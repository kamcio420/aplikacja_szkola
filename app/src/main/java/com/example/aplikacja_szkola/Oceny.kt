package com.example.aplikacja_szkola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Oceny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oceny)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.login ->
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            R.id.informacje ->
            {
                if(islogged == true)
                {
                    val intent = Intent(this, Informacje::class.java)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this, "Najpierw się zaloguj!", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.oceny ->
            {
                if(islogged == true)
                {
                    val intent = Intent(this, Oceny::class.java)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this, "Najpierw się zaloguj!", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.logo -> Toast.makeText(this, "Logo", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}