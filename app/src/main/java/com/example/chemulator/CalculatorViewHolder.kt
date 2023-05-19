package com.example.chemulator

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.chemulator.databinding.ListItemLayoutBinding

class CalculatorViewHolder(val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentCalculator: Calculator



    fun bindCalculator(calculator: Calculator) {
        currentCalculator = calculator
        binding.textView2.text = currentCalculator.name
        binding.image.setImageResource(currentCalculator.image)

    }
    init {
        binding.root.setOnClickListener { view ->
            if(currentCalculator.name == "Molar Mass")
            binding.root.findNavController()
                .navigate(R.id.action_calcListFragment_to_molarMassFragment)

            if(currentCalculator.name == "Stoichiometry")
                binding.root.findNavController()
                    .navigate(R.id.action_calcListFragment_to_stoFragment)

            if(currentCalculator.name == "Wavelength")
                binding.root.findNavController()
                    .navigate(R.id.action_calcListFragment_to_waveFragment)


        }
    }

}