package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        var imageButton: ImageButton = findViewById(R.id.imageButton)
        var editText: EditText = findViewById(R.id.editTextText)
        imageButton.setOnClickListener {
            if(editText.text.isEmpty()) {
                textView.text = "Hello, friend!"
            } else {
                textView.text = "Hello, " + editText.text
            }
        }
    }
    }
