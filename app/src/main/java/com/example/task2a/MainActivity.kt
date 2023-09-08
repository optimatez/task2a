package com.example.task2a

import android.content.Intent
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create LocationData Parcel objects for each location.
        val lunaPark = LocationData(
            "Luna Park",
            "Melbourne",
            "lunapark",
            5,
            "11/08/2022"
        )
        val harbourBridge = LocationData(
            "Sydney Harbour Bridge",
            "Sydney",
            "harbourbridge",
            3,
            "9/10/2016"
        )
        val mcg = LocationData(
            "MCG",
            "Melbourne",
            "mcg",
            2,
            "30/01/2020"
        )
        val operaHouse = LocationData(
            "Sydney Opera House",
            "Sydney",
            "operahouse",
            4,
            "11/10/2016"
        )

        // Setup the click listeners with the custom function
        setupImageViewClickListener(R.id.lunapark, lunaPark)
        setupImageViewClickListener(R.id.harbourbridge, harbourBridge)
        setupImageViewClickListener(R.id.mcg, mcg)
        setupImageViewClickListener(R.id.operahouse, operaHouse)
    }

    // Custom function to create click listeners for each location.
    private fun setupImageViewClickListener(imageViewId: Int, locationData: LocationData) {
        // Get the imageview by Id
        val imageView = findViewById<ImageView>(imageViewId)
        // Create the listener to start the activity when clicked.
        imageView.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            // Include the locationdata object with intent
            intent.putExtra("location", locationData)
            startActivity(intent)
        }
    }
}