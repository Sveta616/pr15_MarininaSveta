package com.example.pr15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class GeoQuiz : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geo_quiz)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        trueButton.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT)
                .show()
        }
        falseButton.setOnClickListener { view: View->
            Toast.makeText(
                this,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT)
                .show()
        }

        }

    }
