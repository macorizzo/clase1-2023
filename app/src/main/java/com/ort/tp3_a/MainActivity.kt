package com.ort.tp3_a

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var label : TextView
    private lateinit var btnShow : Button
    private lateinit var btnClean : Button
    private lateinit var btnToRed : Button
    private lateinit var btnToBlue : Button
    private lateinit var btnWsp : Button


    private val textLabel : String = "Error 404"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        label = findViewById(R.id.txtLabel)
        btnShow = findViewById(R.id.btnShow)
        btnClean = findViewById(R.id.btnClean)
        btnToRed = findViewById(R.id.btnToRed)
        btnToBlue = findViewById(R.id.btnToBlue)
        btnWsp = findViewById(R.id.btnWsp)
        label.text = ""

        btnShow.setOnClickListener {
            label.text = textLabel
        }
        btnClean.setOnClickListener {
            label.text = ""
        }
        btnToRed.setOnClickListener {
            label.setTextColor(Color.RED)
        }
        btnToBlue.setOnClickListener {
            label.setTextColor(Color.BLUE)
        }
        btnWsp.setOnClickListener {
            val url = "https://web.whatsapp.com/"
            val uri = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }




    }
}