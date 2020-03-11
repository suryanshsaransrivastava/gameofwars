package com.example.gameofwars

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val icon1 = findViewById(R.id.icon1) as ImageView
        icon1.setOnClickListener{
            val intent = Intent(this, airforce::class.java)

        startActivity(intent)
        }
        val icon2 = findViewById(R.id.icon2) as ImageView
        icon2.setOnClickListener{
            val intent = Intent(this, army::class.java)

            startActivity(intent)
        }
        val icon3 = findViewById(R.id.icon3) as ImageView
        icon3.setOnClickListener{
            val intent = Intent(this, navy::class.java)

            startActivity(intent)
        }
    }
}
