package com.example.examapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        supportActionBar?.hide()

        val ques1 = findViewById<TextView>(R.id.tvQues1)
        val ques2 = findViewById<TextView>(R.id.tvQues2)
        val ques3 = findViewById<TextView>(R.id.tvQues3)
        val ques4 = findViewById<TextView>(R.id.tvQues4)

        ques1.setOnClickListener{
            val options = arrayOf("imphal", "itanagar", "Dispur", "Panaji")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which of the following is the capital of Arunachal Pradesh?")
            builder2.setIcon(R.drawable.baseline_question_answer_24)
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Answer Submitted",Toast.LENGTH_SHORT).show()
            })

            builder2.setNegativeButton("DECLINE",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You did not mark any option.", Toast.LENGTH_SHORT).show()
            })
            builder2.show()
            }


        ques2.setOnClickListener{
            val options = arrayOf("Lotus", "Rhododendron", "Golden Shower", "Not Declared")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is the state flower of Haryana?")
            builder2.setIcon(R.drawable.baseline_question_answer_24)
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->

            })

            builder2.setNegativeButton("DECLINE",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You did not mark any option.", Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }

        ques3.setOnClickListener{
            val options = arrayOf("Jammu and Kashmir", "Jharkhand", "Himachal Pradesh", "Haryana")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which of the following states is not located in the North?")
            builder2.setIcon(R.drawable.baseline_question_answer_24)
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->

            })

            builder2.setNegativeButton("DECLINE",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You did not mark any option.", Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }

        ques4.setOnClickListener{
            val options = arrayOf("Mizoram", "Orissa", "Manipur", "Meghalaya")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("In what state is Elephant Falls located?")
            builder2.setIcon(R.drawable.baseline_question_answer_24)
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->

            })

            builder2.setNegativeButton("DECLINE",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You did not mark any option.", Toast.LENGTH_SHORT).show()
            })
            builder2.show()
        }

        val btnExit = findViewById<Button>(R.id.btnExit)

        btnExit.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure?")
            builder1.setMessage("Do you want to close the App?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("YES", DialogInterface.OnClickListener { dialogInterface, i ->
                //agar user positivie button that is yes par click karta hai toh what action should be performed
                finish() // exit from app
            })

            builder1.setNegativeButton("NO",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }


    }
}