package com.example.motionlayoutplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ImageDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_detail)

        supportActionBar?.hide()
    }
}