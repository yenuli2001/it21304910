package com.example.it21304910

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val loginFragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.login)

        button.setOnClickListener{
            loadLogin()
        }

        button.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }

    private fun loadLogin(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentcontainer, loginFragment)
            .addToBackStack(null) // Optional: Add to back stack to handle back navigation
            .commit()
    }
}