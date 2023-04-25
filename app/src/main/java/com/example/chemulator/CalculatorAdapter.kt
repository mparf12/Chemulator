package com.example.chemulator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chemulator.databinding.ListItemLayoutBinding

class CalculatorAdapter(val calculatorList: List<Calculator>) : RecyclerView.Adapter<CalculatorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalculatorViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return CalculatorViewHolder(binding)
    }

    override fun onBindViewHolder(currentViewHolder: CalculatorViewHolder, position: Int) {
        val currentCalculator = calculatorList[position]
        currentViewHolder.bindCalculator(currentCalculator)
    }


    override fun getItemCount(): Int {
        return calculatorList.size
    }

}