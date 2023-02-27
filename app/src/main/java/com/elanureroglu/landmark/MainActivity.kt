package com.elanureroglu.landmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.elanureroglu.landmark.databinding.ActivityMainBinding

 var chosenLandmark : Landmark ?= null

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //data

        val pisa = Landmark("Pisa ","Italy","It is known for its nearly four-degree lean, the result of an unstable foundation. The tower is one of three structures in the Pisa's Cathedral Square (Piazza del Duomo), which includes the cathedral and Pisa Baptistry.",R.drawable.pisatower)
        val eiffel = Landmark("Eiffel ", "France","The Eiffel Tower is a wrought-iron lattice tower on the Champ de Mars in Paris, France.It is the second tallest free-standing structure in France after the Millau Viaduct and was named part of a UNESCO World Heritage Site.",R.drawable.eiffel)
        val colosseum = Landmark("Colosseum", "Italy","It is the largest ancient amphitheater ever built, and is still the largest standing amphitheater in the world, despite its age.",R.drawable.colosseum)
        val londonBridge =Landmark("London Bridge","UK","Several bridges named London Bridge have spanned the River Thames between the City of London and Southwark, in central London.",R.drawable.londonbridge)
        val tajMahal = Landmark("Taj Mahal","India","The Taj Mahal is a tribute to Mughal Emperor Shah Jahan's beloved wife, Arjumand Banu Begum. This opulent structure, completed in 1648, is home to her tomb, after she died giving birth to their 14th child",
        R.drawable.tajmahal)
        val gizaPyramid = Landmark("Pyramid of Giza","Egypt","Located along the Nile River outside of Cairo, the Great Pyramid of Giza and the surrounding pyramids are more than 4,500 years old. The pyramid is also one of the Seven Wonders of the ancient world – and the only one left standing today.",
        R.drawable.piramit)


        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(colosseum)
        landmarkList.add(londonBridge)
        landmarkList.add(tajMahal)
        landmarkList.add(gizaPyramid)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

    }
}