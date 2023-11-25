package com.sigiey.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private fun startActivity(intent: MainActivity) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var joinButton: Button = this.findViewById(R.id.joinNowButton)
        joinButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            this.startActivity(intent)
        }
    }
}