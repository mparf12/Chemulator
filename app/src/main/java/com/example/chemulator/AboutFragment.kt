package com.example.chemulator

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chemulator.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        val rootView = binding.root

binding.button4.setOnClickListener{view ->
    val number = Uri.parse("tel:5702903489")
    val callIntent = Intent(Intent.ACTION_DIAL, number)
    startActivity(callIntent)
}
        return rootView
    }


}