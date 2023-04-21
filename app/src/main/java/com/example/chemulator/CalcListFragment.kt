package com.example.chemulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chemulator.databinding.FragmentCalcListBinding
import com.example.chemulator.databinding.FragmentMainBinding


class CalcListFragment : Fragment() {

    private var _binding: FragmentCalcListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCalcListBinding.inflate(inflater, container, false)




        return binding.root
    }


}