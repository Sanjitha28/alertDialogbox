package com.example.alertdialogbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
//    @SuppressLint("WrongViewCast")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msg : EditText =findViewById(R.id.etMessage);
        val btDisplay : Button = findViewById(R.id.btdisplay)

        btDisplay.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("MAD lab")
                .setMessage(msg.text.toString())
                .setPositiveButton("OK"){dailog, which ->
                    // When Ok button is clicked
                    Toast.makeText(applicationContext, "Ok button is clicked", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("cancel"){dialog, which->
                    // cancel button is clicked
                    Toast.makeText(applicationContext, "cancel button is clicked", Toast.LENGTH_SHORT).show()
                }
                .create()
            alertDialog.show()
        }
    }
}