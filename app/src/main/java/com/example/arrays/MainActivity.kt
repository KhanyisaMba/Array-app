package com.example.arrays

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.arrays.R
import com.example.arrays.R.id.teamsTextView

class MainActivity : AppCompatActivity() {
    // Teams from https://footballdatabase.com/ranking/south-africa/1
    // retrieved on 21 May 2022
    private val teams = arrayOf(
        "Mamelodi Sundowns FC",
        "Bidvest Wits",
        "Orlando Pirates",
        "Kaizer Chiefs",
        "Cape Town City FC"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Get the teams text view
        val teamsTextView = findViewById<TextView>(teamsTextView)
        // Set the text view's text to the first team
        teamsTextView.text = teams[0]
        // Change the value of the element at index 0
        teams[0] = "Mamelodi Sundowns FC <3"
        // Construct a string with all elements of the array
        val teamsString = teams.joinToString(separator = "\n")
        // Set the text view's text to the new string
        teamsTextView.text = teamsString
    }
}

