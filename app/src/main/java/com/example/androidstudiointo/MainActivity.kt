package com.example.androidstudiointo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nameText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nameText = findViewById(R.id.nameTextView)

        nameText.text = "Susan"         // hela koden byter ut David till susan med en försenad sökning



        //Log.d("!!!", "Nu körs onCreate!")
    }
}