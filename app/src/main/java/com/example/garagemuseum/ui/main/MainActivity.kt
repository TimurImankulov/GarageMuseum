package com.example.garagemuseum.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.garagemuseum.R

class MainActivity : AppCompatActivity() {

    private var host: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        host = Navigation.findNavController(this, R.id.nav_host_fragment)

    }
}