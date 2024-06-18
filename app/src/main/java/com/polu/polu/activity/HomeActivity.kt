package com.polu.polu.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.polu.polu.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        var navController = findNavController(R.id.fragment)
        var bottomNavigationItemView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottomNavigationItemView.setupWithNavController(navController)

    }
}