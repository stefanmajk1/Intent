package com.example.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.day1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{

            val firstName = binding.etFirstName.text.toString()
            val lastName = binding.etLastName.text.toString()

            if(firstName.isEmpty() || lastName.isEmpty()){
                Toast.makeText(
                    this,
                    "Please fill out all fields",
                    Toast.LENGTH_SHORT

                ).show()
            }else{
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("FirstName", firstName)
                intent.putExtra("LastName", lastName)

                startActivity(intent)
            }

        }

        binding.btnClearFields.setOnClickListener{

            binding.etFirstName.text.clear()
            binding.etLastName.text.clear()

            Toast.makeText(this, "Fields are now empty!", Toast.LENGTH_SHORT).show()
        }

    }
}