package com.example.tablayoutsample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tablayoutsample.Adaptar.TabAdaptar
import com.example.tablayoutsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupViewPager()
    }
    private fun setupViewPager() {
        val adapter = TabAdaptar(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(OthersFragment(), "Others")
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}