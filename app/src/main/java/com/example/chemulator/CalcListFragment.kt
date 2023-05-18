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
    val calcs = listOf(Calculator("Molar Mass", R.drawable.mass), Calculator("Stoichiometry", R.drawable.flasktime), Calculator("Wavelength", R.drawable.wave))
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCalcListBinding.inflate(inflater, container, false)
        val rootView = binding.root


        val mAdapter = CalculatorAdapter(calcs)
        binding.recyclerView.adapter = mAdapter
        return rootView

    }


}