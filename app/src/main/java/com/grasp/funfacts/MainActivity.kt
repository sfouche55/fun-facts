package com.grasp.funfacts

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

//import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val tag = MainActivity::class.simpleName
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    // View vars
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        relativeLayout = findViewById(R.id.relativeLayout)
        showFactButton!!.setOnClickListener {
            // Update the fact TextView with a randomly selected fact
            val fact = factBook.getFact()
            val color = colorWheel.getColor()
            factTextView!!.text = fact
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }
        //Toast.makeText(this, "Activity created successfully!", Toast.LENGTH_LONG).show()
        Log.d(tag, "Logging from the onCreate() method.")
    }
}
