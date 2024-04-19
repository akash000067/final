package com.example.finalexam

import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth


class loginactivity {
}


// Inside LoginActivity.java

// Inside LoginActivity.java
fun onSignInButtonClick(view: View?) {
    val email = "user@example.com" // Get the email from your email EditText
    val password = "password123" // Get the password from your password EditText
    val mAuth = FirebaseAuth.getInstance()
    mAuth.signInWithEmailAndPassword(email, password)
        .addOnCompleteListener(this,
            OnCompleteListener<AuthResult?> { task ->
                if (task.isSuccessful) {
                    // Sign-in success, update UI with the signed-in user's information
                    val user = mAuth.currentUser
                    // Redirect user to main page or perform other actions
                } else {
                    // If sign-in fails, display a message to the user.
                    Log.w(TAG, "signInWithEmail:failure", task.exception)
                    Toast.makeText(
                        this@LoginActivity, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
}
