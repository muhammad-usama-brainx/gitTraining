package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var i = 0;
      i += 2;


        println(i);
        println("Added this feature in loop branch")
        println("Added this feature in loop branch also")


        println("added this feature using master branch")
      println("program ends here")

    }
}