package com.example.chemulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chemulator.databinding.FragmentCoverBinding
import com.example.chemulator.databinding.FragmentStoBinding


class stoFragment : Fragment() {
    private var _binding: FragmentStoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = binding.root
       binding.calcy.setOnClickListener { view ->

       }



        return rootView
    }


}