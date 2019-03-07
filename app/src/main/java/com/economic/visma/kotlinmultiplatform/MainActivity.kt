package com.economic.visma.kotlinmultiplatform

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.mobileconf.shared.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorld = HelloWorld()
        Log.d("SharedCode", helloWorld.greetings())
    }
}
