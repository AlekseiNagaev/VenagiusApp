package com.example.venagius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = arrayOf(b1,b2,b3,b4)
        for ((ind,x) in buttons.withIndex()) {
            x.setOnClickListener {
                Toast.makeText(applicationContext, "Button #${ind+1} has been pressed",Toast.LENGTH_SHORT).show()
                Log.e("!@#", "Button #${ind+1} has been pressed")
            }
        }
    }
}