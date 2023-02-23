package com.example.practicalw2

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

        val rollBtn: Button = findViewById(R.id.RollBtn)
        rollBtn.setOnClickListener {rollDIce() }

        diceImage = findViewById(R.id.DiceImage)
    }

    private fun rollDIce(){
        val randomInt =(1..6 ).random()
        val numberTxt: TextView =findViewById(R.id.NumberTxt) //Creating a Textview object called numberTxt to find view by id
        Toast.makeText(this,"Dice is rolled",
            Toast.LENGTH_SHORT).show()

        val drawableResource = when(randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        numberTxt.text = randomInt.toString()


    }
}