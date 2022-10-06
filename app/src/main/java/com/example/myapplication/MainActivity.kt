package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var myArray: MutableList<String> = mutableListOf("Hamburger","Pizza","Mexican","American","Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun clickDecide(view: View) {
        var myRandom: Int = (0 until myArray.size).random()
        var itemOfChoice: String = myArray[myRandom]
        textView.text = itemOfChoice
    }

    fun clickAddItem(view: View) {
        val input: String = editTextTextPersonName2.text.toString()
        myArray.add(input)
        editTextTextPersonName2.setText("")
    }
}