package com.example.chemulator

import androidx.fragment.app.activityViewModels
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import java.net.Inet4Address
import java.net.NetworkInterface

private const val BASE_URL =
    "http://api.weatherapi.com/v1/forecast.json?key=a9e0f04c420640ccb5f140547232505&"
private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
private val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

  val QUERY_STRING = "q=${getLocalIPAddress()}" +
         "&days=10&aqi=no&alerts=no"






interface WeatherApiService {

    @GET(QUERY_STRING)
    fun getWeatherRequest(): Call<WeatherResponse>
}
object BookApi {
    val WeatherApi: WeatherApiService by lazy {
        retrofit.create(WeatherApiService::class.java)
    }
}
fun getLocalIPAddress(): String? {
    try {
        val en = NetworkInterface.getNetworkInterfaces()
        while (en.hasMoreElements()) {
            val networkInterface = en.nextElement()
            val enu = networkInterface.inetAddresses
            while (enu.hasMoreElements()) {
                val inetAddress = enu.nextElement()
                if (!inetAddress.isLoopbackAddress && inetAddress is Inet4Address) {
                    return inetAddress.getHostAddress()
                }
            }
        }
    } catch (ex: Exception) {
        ex.printStackTrace()
    }

    return null
}
