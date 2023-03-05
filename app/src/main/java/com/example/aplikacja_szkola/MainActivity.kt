package com.example.aplikacja_szkola

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val confirmButton = findViewById<Button>(R.id.login_button)
        val properLogin = "Kamil"
        val properPassword = "Lach"



        confirmButton.setOnClickListener {
            var login = findViewById<TextInputEditText>(R.id.input_login).text
            var password = findViewById<TextInputEditText>(R.id.input_haslo).text

            if (login.toString() == properLogin)
            {
                if (password.toString() == properPassword)
                {
                    findViewById<TextView>(R.id.error_login).text = ""
                    findViewById<TextView>(R.id.error_haslo).text = ""
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