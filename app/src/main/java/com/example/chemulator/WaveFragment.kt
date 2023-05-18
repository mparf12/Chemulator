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
       binding.dochSoAlt.setOnClickListener{ view ->
          var freq =  binding.freq.text.toString()
           var en = binding.ene.text.toString()
           var length = binding.length.text.toString()
           if(freq != ""){

           }
       }


        return rootView
    }

//fun expoHandler(value : String): Double {

//}

}