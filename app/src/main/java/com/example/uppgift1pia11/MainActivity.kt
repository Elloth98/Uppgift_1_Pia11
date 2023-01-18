package com.example.uppgift1pia11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mytext = findViewById<TextView>(R.id.rubrik_tv)

        var myothertext = findViewById<EditText>(R.id.rubrik_tv).text.toString()

        findViewById<Button>(R.id.Banan).setOnClickListener {

            mytext.text = "Banan"

            }

        findViewById<Button>(R.id.Apelsin).setOnClickListener {

            mytext.text = "Apelsin"

        }

        findViewById<Button>(R.id.Kiwi).setOnClickListener {

            mytext.text = "Kiwi"

        }

        if (myothertext == "Banan") {
            findViewById<Button>(R.id.Kiwi).visibility = View.VISIBLE
        } else {
            findViewById<Button>(R.id.Kiwi).visibility = View.GONE
        }
        }

}