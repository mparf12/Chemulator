package com.example.chemulator

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.chemulator.databinding.FragmentCoverBinding


class CoverFragment : Fragment() {
    private var _binding: FragmentCoverBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCoverBinding.inflate(inflater, container, false)
        val rootView = binding.root


        binding.startButton.setOnClickListener { view ->
            val action = CoverFragmentDirections.actionCoverFragmentToCalcListFragment()
            rootView.findNavController().navigate(action)
        }
        binding.button2.setOnClickListener{view ->
            val action = CoverFragmentDirections.actionCoverFragmentToStudyHelpFragment()
            rootView.findNavController().navigate(action)
        }


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