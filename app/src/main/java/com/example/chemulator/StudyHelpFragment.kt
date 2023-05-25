package com.example.chemulator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chemulator.databinding.FragmentStudyHelpBinding
import com.example.chemulator.databinding.FragmentWaveBinding
import kotlin.math.abs


class StudyHelpFragment : Fragment() {
    private var _binding: FragmentStudyHelpBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStudyHelpBinding.inflate(inflater, container, false)
        val rootView = binding.root
        var curDay = binding.datePicker1.dayOfMonth
        var curMonth = binding.datePicker1.month
        var curYear = binding.datePicker1.year
      binding.calc.setOnClickListener{ view->
          var day = binding.datePicker1.dayOfMonth
          var month = binding.datePicker1.month
          var year = binding.datePicker1.year
          var e = 0
if(curMonth != month){
    e = 31
}

          if(abs(curDay-(day+e)) > 30) {
              binding.advice.text = "You still have a lot of time. Try to assemble a study schedule. Additionally, you should try to narrow down areas of weakness so you will know what to focus on. Stay consistent with your studying to ensure you do not end up cramming at the last minute. Good Luck!"

          }
          else if(abs(curDay-(day+e)) > 15) {
                  binding.advice.text = "You still have some time before your test. Try to study a little bit each day, gradually ramping up as you get closer to test day. Complete any review you can find and ask your teacher if you are uncertain about any topics. Good Luck!"
          }
          else if(abs(curDay-(day+e)) > 7){
              binding.advice.text = "You are getting close to your test day. Try reviewing every day for 30 minutes, increasing it to 1 hour as you get much closer. Complete all review material and if necessary find more online. Make sure to ask your teacher if you are unsure about anything. Good Luck!"
          }
          else if(abs(curDay-(day+e)) > 0){
              binding.advice.text = "You are very close to your test day. Try reviewing material for 1 hour every day, making sure you are in a space that is free of distractions. If any extra review material is avaiable, make sure that you do all of it. Before going into the test, make sure your head is clear. Good Luck!"
          }
          else if(abs(curDay-(day+e)) == 0){
              binding.advice.text = "Yikes, it's test day! Eat a healthy breakfast and try clearing your head before going into your test. As long as you are prepared, you will do well. Good Luck!"
          }
      }


        return rootView
    }


}