package com.example.garagemuseum.ui.registration.age

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.garagemuseum.R
import com.example.garagemuseum.base.BaseFragment
import com.example.garagemuseum.utils.AnimationUtils
import com.example.garagemuseum.utils.setSeekBarChangeListener
import kotlinx.android.synthetic.main.fragment_age.*

class AgeFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_age
    private var lastScale = 0f

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        setupListeners()
    }

    private fun setupViews() {
        tvAgeDesc.animateText(getString(R.string.age_desc))
    }

    private fun setupListeners() {
        seekBar.setSeekBarChangeListener { scaleValue ->
            AnimationUtils.animateScale(imgRedMan, lastScale, scaleValue.toFloat())
            lastScale = scaleValue.toFloat()
            checkAge(scaleValue)
        }
    }

    private fun checkAge(scaleValue: Int) {
        val age = scaleValue / 6
        if (age == 16) {
            tvAge.text = getString(R.string.sixteen_plus)
        } else tvAge.text = (age + 1).toString()

        when (age) {
            in 1..4 -> tvAgeDesc.text = getString(R.string.greeting_desc_one)
            in 5..14 -> tvAgeDesc.text = getString(R.string.greeting_desc_two)
            in 15..16 -> tvAgeDesc.text = getString(R.string.greeting_desc_three)
        }
    }
}