package com.example.myfacebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profile = findViewById<Button>(R.id.profile_setting)
        val camera = findViewById<Button>(R.id.camera)
        val camera2 = findViewById<Button>(R.id.camera2)

        profile.setOnClickListener {
            val intent = Intent(this, SettingProfile::class.java)
            startActivity(intent)
        }
        camera.setOnClickListener {
            navigatePhotos()
        }
        camera2.setOnClickListener {
            navigatePhotos()
        }
    }

    private fun navigatePhotos() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(intent, 2000)
    }
}