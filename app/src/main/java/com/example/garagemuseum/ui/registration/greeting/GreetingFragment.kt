package com.example.garagemuseum.ui.registration.greeting

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.garagemuseum.R
import com.example.garagemuseum.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_greeting.*
import kotlinx.android.synthetic.main.view_input_name.view.*

class GreetingFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_greeting

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvWriter.animateText(getString(R.string.greeting_title))
        setupListeners()
    }

    private fun setupListeners() {
        viewInputName.etName.setOnEditorActionListener(TextView.OnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                openAgeScreen()
                return@OnEditorActionListener true
            }
            false
        })

        button.setOnClickListener {
            findNavController().navigate(R.id.action_greetingFragment_to_ageFragment)
        }
    }

    private fun openAgeScreen() {
        findNavController().navigate(R.id.action_greetingFragment_to_ageFragment)
    }
}
