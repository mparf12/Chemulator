package com.example.chemulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chemulator.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
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

        return binding.root
    }


    }
