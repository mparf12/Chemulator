package com.example.chemulator

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.chemulator.databinding.FragmentCalcListBinding
import com.example.chemulator.databinding.FragmentCoverBinding
import com.example.chemulator.databinding.FragmentStoBinding


class stoFragment : Fragment() {
    var cmon = 2
    val elements = listOf(
        Element("H", 1.008,1),
        Element("He", 4.003,2),
        Element("Li", 6.941,3),
        Element("Be", 9.012,4),
        Element("B", 10.811,5),
        Element("C", 12.011,6),
        Element("N", 14.007,7),
        Element("O", 15.999,8),
        Element("F", 18.998,9),
        Element("Ne", 20.180,10),
        Element("Na", 22.990,11),
        Element("Mg", 24.305,12),
        Element("Al", 26.982,13),
        Element("Si", 28.086,14),
        Element("P", 30.974,15),
        Element("S", 32.066,16),
        Element("Cl", 35.453,17),
        Element("Ar", 39.948,18),
        Element("K", 39.098,19),
        Element("Ca", 40.078,20),
        Element("Sc", 44.956,21),
        Element("Ti", 47.867,22),
        Element("V", 50.942,23),
        Element("Cr", 51.996,24),
        Element("Mn", 54.938,25),
        Element("Fe", 55.845,26),
        Element("Co", 58.933,27),
        Element("Ni", 58.693,28),
        Element("Cu", 63.546,29),
        Element("Zn", 65.38,30),
        Element("Ga", 69.723,31),
        Element("Ge", 72.631,32),
        Element("As", 74.922,33),
        Element("Se", 78.971,34),
        Element("Br", 79.904,35),
        Element("Kr", 83.798,36),
        Element("Rb", 85.468,37),
        Element("Sr", 87.62,38),
        Element("Y", 88.906,39),
        Element("Zr", 91.224,40),
        Element("Nb", 92.906,41),
        Element("Mo", 95.95,42),
        Element("Tc", 98.907,43),
        Element("Ru", 101.07,44),
        Element("Rh", 102.906,45),
        Element("Pd", 106.42,46),
        Element("Ag", 107.868,47),
        Element("Cd", 112.414,48),
        Element("In", 114.818,49),
        Element("Sn", 118.711,50),
        Element("Sb", 121.760,51),
        Element("Te", 127.6,52),
        Element("I", 126.904,53),
        Element("Xe", 131.293,54),
        Element("Cs", 132.905,55),
        Element("Ba", 137.328,56),
        Element("Hf", 178.49,72),
        Element("Ta", 180.948,73),
        Element("W", 183.84,74),
        Element("Re", 186.207,75),
        Element("Os", 190.23,76),
        Element("Ir", 192.217,77),
        Element("Pt", 195.085,78),
        Element("Au", 196.967,79),
        Element("Hg", 200.592,80),
        Element("TI", 204.383,81),
        Element("Pb", 207.2,82),
    )
    private var _binding: FragmentStoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStoBinding.inflate(inflater, container, false)
        val rootView = binding.root
       binding.calcy.setOnClickListener{view ->
           Toast.makeText(this.context, "Done!", Toast.LENGTH_SHORT).show()
           var p1 = binding.p1.text
           var p2 = binding.p2.text
           var p3 = binding.p3.text
           var re1 = binding.re1.text
           var re2 = binding.re2.text
           var re3 = binding.re3.text
            var mass1 = 0.0
           var mass2 = 0.0
           var mass3 = 0.0

           if((getMassFromText(re1.toString())/getMass(re1.toString()))/getCoFromText(re1.toString()) <= (getMassFromText(re2.toString())/getMass(re2.toString()))/getCoFromText(re2.toString())){
               if((getMassFromText(re1.toString())/getMass(re1.toString()))/getCoFromText(re1.toString()) <= (getMassFromText(re3.toString())/getMass(re3.toString()))/getCoFromText(re3.toString())) {
                   mass1 = ((((getMassFromText(re1.toString()))/(getMass(re1.toString()))) * getMass(p1.toString())) * ((getCoFromText(p1.toString()))/(getCoFromText(re1.toString()))))
                  if(p2.toString() != ""){
                      mass2 = ((((getMassFromText(re1.toString()))/(getMass(re1.toString()))) * getMass(p2.toString())) * ((getCoFromText(p2.toString()))/(getCoFromText(re1.toString()))))
                  }
                   if(p3.toString() != ""){
                       mass3 = ((((getMassFromText(re1.toString()))/(getMass(re1.toString()))) * getMass(p3.toString())) * ((getCoFromText(p3.toString()))/(getCoFromText(re1.toString()))))
                   }
               }
               else{
                  mass1 = ((((getMassFromText(re3.toString()))/(getMass(re3.toString()))) * getMass(p1.toString())) * ((getCoFromText(p1.toString()))/(getCoFromText(re3.toString()))))
                   if(p2.toString() != ""){
                      mass2 = ((((getMassFromText(re3.toString()))/(getMass(re3.toString()))) * getMass(p2.toString())) * ((getCoFromText(p2.toString()))/(getCoFromText(re3.toString()))))
                   }
                   if(p3.toString() != ""){
                      mass3 = ((((getMassFromText(re3.toString()))/(getMass(re3.toString()))) * getMass(p3.toString())) * ((getCoFromText(p3.toString()))/(getCoFromText(re3.toString()))))
                   }
               }
           }
           else{
               if((getMassFromText(re2.toString())/getMass(re2.toString()))/getCoFromText(re2.toString()) <= (getMassFromText(re2.toString())/getMass(re2.toString()))/getCoFromText(re2.toString())) {
                   mass1 = ((((getMassFromText(re2.toString()))/(getMass(re2.toString()))) * getMass(p1.toString())) * ((getCoFromText(p1.toString()))/(getCoFromText(re2.toString()))))
                   if(p2.toString() != ""){
                       mass2 = ((((getMassFromText(re2.toString()))/(getMass(re2.toString()))) * getMass(p2.toString())) * ((getCoFromText(p2.toString()))/(getCoFromText(re2.toString()))))
                   }
                   if(p3.toString() != ""){
                       mass3 = ((((getMassFromText(re2.toString()))/(getMass(re2.toString()))) * getMass(p3.toString())) * ((getCoFromText(p3.toString()))/(getCoFromText(re2.toString()))))
                   }
               }
               else{
                  mass1 = ((((getMassFromText(re3.toString()))/(getMass(re3.toString()))) * getMass(p1.toString())) * ((getCoFromText(p1.toString()))/(getCoFromText(re3.toString()))))
                   if(p2.toString() != ""){
                      mass2 = ((((getMassFromText(re3.toString()))/(getMass(re3.toString()))) * getMass(p2.toString())) * ((getCoFromText(p2.toString()))/(getCoFromText(re3.toString()))))
                   }
                   if(p3.toString() != ""){
                       mass3 = ((((getMassFromText(re3.toString()))/(getMass(re3.toString()))) * getMass(p3.toString())) * ((getCoFromText(p3.toString()))/(getCoFromText(re3.toString()))))
                   }
               }
           }



       binding.p1Mass.text = "${"%.2f".format(mass1)} g"

           if(p2.toString() != "")
           binding.p2Mass.text = "${"%.2f".format(mass2)} g"

           if(p3.toString() != "")
           binding.p3Mass.text = "${"%.2f".format(mass3)} g"
       }


        setHasOptionsMenu(true)
        return rootView
    }
    fun getMass(comp: String): Double{
        var mass = 0.0
        var umHelloChris = false
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
    return mass
    }
    fun getCoFromText(comp: String): Double{
        if(comp != ""){
            return comp.substring(0 , comp.indexOf("(")).toDouble()
        }
      else{
          return 100000000.0
        }
    }
    fun getMassFromText(comp: String): Double{
        if(comp != "") {
            return comp.substring(comp.indexOf("{") + 1, comp.lastIndexOf("}")).toDouble()
        }
       else{
           return 0.00000000000000000000000000000000000000000000001
        }

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