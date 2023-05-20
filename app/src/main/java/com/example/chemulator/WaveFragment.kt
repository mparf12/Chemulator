package com.example.chemulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chemulator.databinding.FragmentCalcListBinding
import com.example.chemulator.databinding.FragmentWaveBinding
import kotlin.math.pow


class WaveFragment : Fragment() {

    private var _binding: FragmentWaveBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWaveBinding.inflate(inflater, container, false)
        val rootView = binding.root
       binding.calc.setOnClickListener{ view ->
          var freq =  binding.freq.text.toString()
           var en = binding.ene.text.toString()
           var length = binding.length.text.toString()
           if(freq != ""){
            binding.length.setText((expoHandler("3.00E8")/expoHandler(freq)).toString())
               binding.ene.setText((expoHandler("6.626E-34") * expoHandler(freq)).toString())
           }
           if(en != ""){
               binding.freq.setText((expoHandler(en)/expoHandler("6.626E-34")).toString())
               binding.length.setText((expoHandler("3.00E8")/expoHandler(binding.freq.text.toString())).toString())
           }
           if(length !=""){
               binding.freq.setText((expoHandler("3.00E8")/expoHandler(length)).toString())
               binding.ene.setText((expoHandler("6.626E-34") * expoHandler(binding.freq.text.toString())).toString())
           }
           binding.freq.setText(decimalHandeler(binding.freq.text.toString()))
           binding.ene.setText(decimalHandeler(binding.ene.text.toString()))
           binding.length.setText(decimalHandeler(binding.length.text.toString()))
       }


        return rootView
    }

fun expoHandler(value : String): Double {
    return (value.substring(0, value.indexOf("E")).toDouble() * 10.0.pow((value.substring(value.indexOf('E') + 1, value.length).toInt())))
}
    fun decimalHandeler(value : String): String{
        return("${"%.5f".format(value.substring(0, value.indexOf("E")).toDouble())}${value.substring(value.indexOf("E"), value.length)}")
    }

}