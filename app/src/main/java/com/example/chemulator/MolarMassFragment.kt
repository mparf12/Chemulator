package com.example.chemulator

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.view.animation.AnimationUtils
import android.widget.SeekBar
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.chemulator.databinding.FragmentMolarMassBinding
import kotlin.math.roundToLong


class MolarMassFragment : Fragment() {
    var cmon = 2
    val elements = listOf(
        Element("H", 1.008),
        Element("He", 4.003),
        Element("Li", 6.941),
        Element("Be", 9.012),
        Element("B", 10.811),
        Element("C", 12.011),
        Element("N", 14.007),
        Element("O", 15.999),
        Element("F", 18.998),
        Element("Ne", 20.180),
        Element("Na", 22.990),
        Element("Mg", 24.305),
        Element("Al", 26.982),
        Element("Si", 28.086),
        Element("P", 30.974),
        Element("S", 32.066),
        Element("Cl", 35.453),
        Element("Ar", 39.948),
        Element("K", 39.098),
        Element("Ca", 40.078),
        Element("Sc", 44.956),
        Element("Ti", 47.867),
        Element("V", 50.942),
        Element("Cr", 51.996),
        Element("Mn", 54.938),
        Element("Fe", 55.845),
        Element("Co", 58.933),
        Element("Ni", 58.693),
        Element("Cu", 63.546),
        Element("Zn", 65.38),
        Element("Ga", 69.723),
        Element("Ge", 72.631),
        Element("As", 74.922),
        Element("Se", 78.971),
        Element("Br", 79.904),
        Element("Kr", 83.798),
        Element("Rb", 85.468),
        Element("Sr", 87.62),
        Element("Y", 88.906),
        Element("Zr", 91.224),
        Element("Nb", 92.906),
        Element("Mo", 95.95),
        Element("Tc", 98.907),
        Element("Ru", 101.07),
        Element("Rh", 102.906),
        Element("Pd", 106.42),
        Element("Ag", 107.868),
        Element("Cd", 112.414),
        Element("In", 114.818),
        Element("Sn", 118.711),
        Element("Sb", 121.760),
        Element("Te", 127.6),
        Element("I", 126.904),
        Element("Xe", 131.293),
        Element("Cs", 132.905),
        Element("Ba", 137.328),
        Element("Hf", 178.49),
        Element("Ta", 180.948),
        Element("W", 183.84),
        Element("Re", 186.207),
        Element("Os", 190.23),
        Element("Ir", 192.217),
        Element("Pt", 195.085),
        Element("Au", 196.967),
        Element("Hg", 200.592),
        Element("TI", 204.383),
        Element("Pb", 207.2),
    )
    private var _binding: FragmentMolarMassBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMolarMassBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.calc.setOnClickListener { view ->
            var comp = binding.viewtime.text
            var mass = 0.0
            var umHelloChris = false
            Toast.makeText(this.context, "Done!", Toast.LENGTH_SHORT).show()

            for (i in 0..comp.length) {
umHelloChris = false
                //two letter elements
                 for(element in elements){
                     if (i+2 <= comp.length) {
                         if (element.symbol == comp.substring(i, i + 2)) {
                             if (i + 3 <= comp.length && comp.substring(i + 2, i + 3)
                                     .toIntOrNull() != null) {

                                if(i + 4 <= comp.length && comp.substring(i + 2, i + 4).toIntOrNull() != null){
                                    mass += element.mass * comp.substring(i + 2, i + 4).toDouble()
                                    umHelloChris = true
                                    }
                                    else{
                                    mass += element.mass * comp.substring(i + 2, i + 3).toDouble()
                                    umHelloChris = true
                                }

                             } else {
                                 mass += element.mass
                                 umHelloChris = true
                             }
                         }
                     }
                 }
                // single letter elements
                    for(element in elements) {
                        if (umHelloChris == false) {
                            if (i + 1 <= comp.length) {
                                if (element.symbol == comp.substring(i, i + 1)) {
                                    if (i + 2 <= comp.length && comp.substring(i + 1, i + 2)
                                            .toIntOrNull() != null) {

                                        if(i+3 <= comp.length && comp.substring(i+1, i + 3).toIntOrNull() != null){
                                            mass += element.mass * comp.substring(i + 1, i + 3)
                                                .toDouble()
                                        }
                                        else{
                                            mass += element.mass * comp.substring(i + 1, i + 2)
                                                .toDouble()
                                        }

                                    } else {
                                        mass += element.mass
                                    }
                                }
                            }
                        }
                    }


            }

              if(cmon == 0)
            binding.mass.text = "${"%.0f".format(mass)} grams"
            if(cmon == 1)
                binding.mass.text = "${"%.1f".format(mass)} grams"
            if(cmon == 2)
                binding.mass.text = "${"%.2f".format(mass)} grams"
            if(cmon == 3)
                binding.mass.text = "${"%.3f".format(mass)} grams"
            if(cmon == 4)
                binding.mass.text = "${"%.4f".format(mass)} grams"
            if(cmon == 5)
                binding.mass.text = "${"%.5f".format(mass)} grams"
            if(cmon == 6)
                binding.mass.text = "${"%.6f".format(mass)} grams"
            if(cmon == 7)
                binding.mass.text = "${"%.7f".format(mass)} grams"
            if(cmon == 8)
                binding.mass.text = "${"%.8f".format(mass)} grams"
            binding.mass.visibility = View.VISIBLE
            val animationFadeIn = AnimationUtils.loadAnimation(this.context, R.anim.fade_in)
            binding.mass.startAnimation(animationFadeIn)
        }
        setHasOptionsMenu(true)
        setUpSeekBar()
        return rootView
    }

    fun setUpSeekBar(){
        binding.decimal.text = "2"
        binding.decBar.progress = 2
        binding.decBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, newProgressValue: Int, fromUser: Boolean) {
          binding.decimal.text = newProgressValue.toString()
           cmon = newProgressValue


            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)

    }

}