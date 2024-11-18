package com.example.newapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var salman : RadioButton
    lateinit var SRK : RadioButton
    lateinit var Dee : RadioButton
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        salman = findViewById(R.id.radioSalman)
        SRK = findViewById(R.id.radioSrk)
        Dee = findViewById(R.id.radioDeepika)
        image = findViewById(R.id.imageView4)

        salman.setOnClickListener{
            image.setImageResource(R.drawable.salman)
        }

        SRK.setOnClickListener{
            image.setImageResource(R.drawable.srk)
        }
        Dee.setOnClickListener{
            image.setImageResource(R.drawable.deepika)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}