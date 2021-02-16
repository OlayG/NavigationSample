package com.example.navigationsample.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationsample.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {

    private lateinit var binding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentThreeBinding.inflate(
        inflater,
        container,
        false
    ).also { binding = it }.root


}