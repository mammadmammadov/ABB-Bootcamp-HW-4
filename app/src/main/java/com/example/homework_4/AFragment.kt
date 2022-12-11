package com.example.homework_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework_4.databinding.FragmentABinding


class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentABinding.inflate(inflater, container, false)
        binding.toB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toBfromA)
            val t = 10
            val s = 5
        }
        return binding.root
    }

}