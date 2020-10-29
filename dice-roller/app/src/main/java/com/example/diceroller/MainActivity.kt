package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        //get random number
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_1
            3 -> R.drawable.dice_1
            4 -> R.drawable.dice_1
            5 -> R.drawable.dice_1
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}