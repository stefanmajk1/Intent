package com.example.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity // Import the correct AppCompatActivity class from AndroidX
import android.os.Bundle
import com.example.day1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstName = intent.getStringExtra("FirstName")
        val lastName = intent.getStringExtra("LastName")

        binding.tvWelcome.text = "Your first name is: $firstName, and your last name is: $lastName. Welcome user!"

    }
}