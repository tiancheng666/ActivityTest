package com.example.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val extraData = intent.getStringExtra("extra_data")
        Log.d("SecondActivlty", "extra data is $extraData")
    }
}