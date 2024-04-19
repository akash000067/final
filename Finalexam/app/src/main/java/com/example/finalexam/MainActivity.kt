package com.example.finalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Check if user is already authenticated
        val currentUser = FirebaseAuth.getInstance().currentUser
        if (currentUser != null) {
            // User is already authenticated, redirect to main page
            redirectToMainPage()
        }
    }

    private fun redirectToMainPage() {
        val intent = Intent(this, MainPageActivity::class.java)
        startActivity(intent)
        finish() // Finish MainActivity so user cannot navigate back to it using back button
    }
}
