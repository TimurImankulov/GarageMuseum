package com.example.garagemuseum.ui.registration.ondoard

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.garagemuseum.R
import com.example.garagemuseum.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_onboard.*

class OnBoardFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_onboard

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        button.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardFragment_to_greetingFragment)
        }
    }
}