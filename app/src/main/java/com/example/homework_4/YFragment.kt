package com.example.homework_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework_4.databinding.FragmentYBinding

class YFragment : Fragment() {
    private lateinit var binding: FragmentYBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentYBinding.inflate(inflater, container, false)
        binding.btnY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toMain)
        }
        return binding.root
    }

}