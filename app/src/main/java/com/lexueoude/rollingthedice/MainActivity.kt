package com.lexueoude.rollingthedice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
//import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    var randomNumberTxt : TextView? = null
//    lateinit var randomNumberTxt : TextView
//    lateinit var diceEmptyImg : ImageView
    lateinit var diceOneImg : ImageView
    lateinit var diceTwoImg : ImageView
    lateinit var diceThreeImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        randomNumberTxt = findViewById<TextView>(R.id.text_view_random_number)
//        diceEmptyImg = findViewById(R.id.dice_empty)
        diceOneImg = findViewById(R.id.image_view_dice_one)
        diceTwoImg = findViewById(R.id.image_view_dice_two)
        diceThreeImg = findViewById(R.id.image_view_dice_three)

        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        rollButton.setOnClickListener {
            rollDice()
        }
    }


    fun rollDice() {

        val randomNumber1 = (1..6).random()
//        randomNumberTxt.text = randomNumber.toString()
        val image1 = when (randomNumber1) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else ->R.drawable.dice_empty
        }
        diceOneImg.setImageResource(image1)



        val randomNumber2 = (1..6).random()
//        randomNumberTxt.text = randomNumber.toString()
        val image2 = when (randomNumber2) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else ->R.drawable.dice_empty
        }
        diceTwoImg.setImageResource(image2)


        val randomNumber3 = (1..6).random()
//        randomNumberTxt.text = randomNumber.toString()
        val image3 = when (randomNumber3) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else ->R.drawable.dice_empty
        }
        diceThreeImg.setImageResource(image3)
    }
}