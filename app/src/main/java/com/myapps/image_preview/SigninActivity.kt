package com.myapps.image_preview

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SigninActivity : AppCompatActivity() {

    lateinit var loginBtn : Button
    lateinit var username : EditText
    lateinit var password : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        loginBtn = findViewById(R.id.buttonlogin)
        username = findViewById(R.id.username_et)
        password = findViewById(R.id.password_et)

        loginBtn.setOnClickListener {
            if (!(username.text.isEmpty() || password.text.isEmpty())){
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }else if (username.text.isEmpty()){
                Toast.makeText(this,"username is null",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"password is null",Toast.LENGTH_SHORT).show()
            }
        }

    }

}