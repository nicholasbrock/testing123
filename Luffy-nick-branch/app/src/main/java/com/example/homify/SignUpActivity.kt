package com.example.homify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.homify.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.Toast
import com.example.homify.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()

        binding.signup.setOnClickListener{
            val email = binding.email.toString()
            val password = binding.password.toString()
            val confirmPassword = binding.confirmPassword.toString()

            if(email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()){
                if(password.equals(confirmPassword)){
                    // to be filled in

                } else {
                    Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
            }

        }




    }

}

