package com.example.chemulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
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



binding.startButton.setOnClickListener{ view ->
    val action = CoverFragmentDirections.actionCoverFragmentToCalcListFragment()
    rootView.findNavController().navigate(action)
}



        return rootView
    }


}