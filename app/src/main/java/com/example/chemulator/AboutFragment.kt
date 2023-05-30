package com.example.chemulator

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chemulator.databinding.FragmentAboutBinding
import com.example.chemulator.databinding.FragmentWaveBinding


class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        val rootView = binding.root

binding.button.setOnClickListener{view ->
    val intent = Intent(Intent.ACTION_SENDTO)
    intent.data = Uri.parse("mailto:") // only email apps should handle this
    intent.putExtra(Intent.EXTRA_EMAIL, "nparf12@gmail.com")
    intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback")
    if (intent.resolveActivity(requireActivity().packageManager) != null) {
        startActivity(intent)
    }
}
        return rootView
    }


}