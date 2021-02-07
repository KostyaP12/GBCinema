package com.geekbrains.gbcinema.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geekbrains.gbcinema.R
import com.geekbrains.gbcinema.ui.home.HomeFragment
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setSupportActionBar(toolbar)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, HomeFragment.newInstance())
                    .commitNow()
        }
    }
}