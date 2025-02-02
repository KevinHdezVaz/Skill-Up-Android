package com.alkemy.alkemybankbase.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alkemy.alkemybankbase.databinding.FragmentChargeBalanceBinding

class ChargeBalanceFragment : Fragment() {
    private var _binding : FragmentChargeBalanceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding = FragmentChargeBalanceBinding.inflate(inflater,container,false)
        return binding.root
    }
}