package com.elanureroglu.landmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.elanureroglu.landmark.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(toolbar = Toolbar(this))
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val intent = intent


        var selectedLandmark = chosenLandmark

        selectedLandmark?.let {
            binding.nameText.text = selectedLandmark!!.name
            binding.countryText.text = selectedLandmark!!.country
            binding.informationText.text = selectedLandmark!!.information
            binding.imageView.setImageResource(selectedLandmark!!.image)
        }
    }

    private fun setSupportActionBar(toolbar: Toolbar) {

    }
}