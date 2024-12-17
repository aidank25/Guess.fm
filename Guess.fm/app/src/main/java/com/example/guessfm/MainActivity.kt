package com.example.guessfm

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
//import com.example.guessfm.databinding.ActivityMainBinding

var check = 0

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding
    fun launchGameView() {
        // first parameter is the context, second is the class of the activity to launch
        val i = Intent(this@MainActivity, GameActivity::class.java)
        startActivity(i) // brings up the second activity
    }
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val fragmentManager:FragmentManager = supportFragmentManager
        val homeFragment: Fragment = HomeFragment()
        var fragment: Fragment = homeFragment

        if (check == 0) {
            //bottomNavigationView.selectedItemId = R.id.action_home
            fragment = homeFragment
            fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit()
            check = 1
        }
        */
    }
}