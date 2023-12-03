package com.example.homify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.homify.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.Toast
import com.example.homify.bottomnavbar.fragments.GroupFragment
import com.example.homify.bottomnavbar.fragments.HomeFragment
import com.example.homify.bottomnavbar.fragments.RewardFragment
import com.example.homify.bottomnavbar.fragments.TaskFragment
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()

        val homeFragment = HomeFragment()
        val groupFragment = GroupFragment()
        val taskFragment = TaskFragment()
        val rewardFragment = RewardFragment()

//        makeCurrentFragment(homeFragment)


    }

// TODO: set current frag to home screen after login auth

//    private fun makeCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fl_wrapper, fragment)
//            commit()
//        }
}

