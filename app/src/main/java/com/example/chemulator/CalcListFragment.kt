package com.example.chemulator

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.chemulator.databinding.FragmentCalcListBinding
import com.example.chemulator.databinding.FragmentMainBinding


class CalcListFragment : Fragment() {

    private var _binding: FragmentCalcListBinding? = null
    private val binding get() = _binding!!
    val calcs = listOf(Calculator("Molar Mass", R.drawable.mass), Calculator("Stoichiometry", R.drawable.flasktime), Calculator("Wavelength", R.drawable.wave), Calculator("Isotopes", R.drawable.isotope))
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCalcListBinding.inflate(inflater, container, false)
        val rootView = binding.root


        val mAdapter = CalculatorAdapter(calcs)
        binding.recyclerView.adapter = mAdapter
        setHasOptionsMenu(true)
        return rootView

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