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

//        for (let i = 0; i < 4; i++0)
//        {
//
//        }
      println("program ends here")
    }
}