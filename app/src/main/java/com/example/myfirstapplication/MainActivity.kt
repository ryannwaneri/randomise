package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton=findViewById<Button>(R.id.button)
        val resultsTextview=findViewById<TextView>(R.id.resultsTextview)
        val seekbar=findViewById<SeekBar>(R.id.seekBar)

        rollbutton.setOnClickListener{
            val rand= Random().nextInt(seekbar.progress)
            resultsTextview.text=rand.toString()
        }

    }
}