package com.example.homework_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework_4.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.btn1Main.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toA)
        }
        binding.btn2Main.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toX)
        }
        return binding.root
    }

}