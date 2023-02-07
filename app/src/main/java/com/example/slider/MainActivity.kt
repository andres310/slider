package com.example.slider

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.slider.Slider
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "Slider"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val colorView = findViewById<View>(R.id.color_view)
        val rColor = findViewById<Slider>(R.id.r_slider)
        val gColor = findViewById<Slider>(R.id.g_slider)
        val bColor = findViewById<Slider>(R.id.b_slider)

        val rText = findViewById<TextView>(R.id.r_value)
        rColor.addOnChangeListener { slider, value, fromUser ->
            colorView.setBackgroundColor(Color.rgb(value, gColor.value, bColor.value))
            rText.text = value.toString()
        }
        val gText = findViewById<TextView>(R.id.g_value)
        gColor.addOnChangeListener { slider, value, fromUser ->
            colorView.setBackgroundColor(Color.rgb(rColor.value, value, bColor.value))
            gText.text = value.toString()
        }
        val bText = findViewById<TextView>(R.id.b_value)
        bColor.addOnChangeListener { slider, value, fromUser ->
            colorView.setBackgroundColor(Color.rgb(rColor.value, gColor.value, bColor.value))
            bText.text = value.toString()
        }
    }
}