package com.example.motionlayoutplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import androidx.constraintlayout.motion.widget.MotionLayout
import com.example.motionlayoutplayground.databinding.ActivitySlideBoxBinding

class SlideBox : AppCompatActivity() {

    private lateinit var binding: ActivitySlideBoxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlideBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}