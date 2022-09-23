package com.example.motionlayoutplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutplayground.adapters.RecyclerAdapter
import com.example.motionlayoutplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val layoutManager:RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.recycler.layoutManager = layoutManager

        val adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder> = RecyclerAdapter()
        binding.recycler.adapter = adapter

    }
}