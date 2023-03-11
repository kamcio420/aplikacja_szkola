package com.example.aplikacja_szkola

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

//Things to do:
//1. activity choosing menu on click(toolbar)
//2. Informacje activity content
//3. Oceny activity content,
//4. lock these two activities when user is not logged in

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val confirmButton = findViewById<Button>(R.id.login_button)
        val properLogin = "Kamil"
        val properPassword = "Lach"



        confirmButton.setOnClickListener {
            val login = findViewById<TextInputEditText>(R.id.input_login).text
            val password = findViewById<TextInputEditText>(R.id.input_haslo).text

            if (login.toString() == properLogin)
            {
                findViewById<TextView>(R.id.error_login).text = ""
                if (password.toString() == properPassword)
                {
                    findViewById<TextView>(R.id.error_login).text = ""
                    findViewById<TextView>(R.id.error_haslo).text = ""
                    val intent = Intent(this, Informacje::class.java)
                    startActivity(intent)
                }
                else
                {
                    findViewById<TextView>(R.id.error_haslo).text = "Wprowadzono niepoprawne hasło!"
                }
            }
            else
            {
                findViewById<TextView>(R.id.error_login).text = "Wprowadzono niepoprawny login!"
            }
        }

    }
}