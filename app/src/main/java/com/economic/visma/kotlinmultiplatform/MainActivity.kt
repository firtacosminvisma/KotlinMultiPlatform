package com.economic.visma.kotlinmultiplatform

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mobileconf.shared.Greeting
import kotlinx.android.synthetic.main.activity_main.hello_world_text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greeting = Greeting()
        hello_world_text.text = greeting.greetMe()
    }
}
