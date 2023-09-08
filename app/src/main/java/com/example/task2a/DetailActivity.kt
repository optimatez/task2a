package com.example.task2a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.RatingBar

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Set location variable to passed LocationData object.
        val location = intent.getParcelableExtra<LocationData>("location")

        // If location data exists, set the values to the data held in the object.
        location?.let {
            val vName = findViewById<TextView>(R.id.name)
            vName.text = location.name

            val vCity = findViewById<TextView>(R.id.city)
            vCity.text = location.city

            val vImage = findViewById<ImageView>(R.id.image)
            val imageId = resources.getIdentifier(location.imageSource, "drawable", packageName)
            vImage.setImageResource(imageId)

            val vRating = findViewById<RatingBar>(R.id.ratingBar)
            vRating.setRating(location.rating.toFloat())

            val vLastVisited = findViewById<TextView>(R.id.lastVisited)
            vLastVisited.text = location.lastVisited
        }
    }
}