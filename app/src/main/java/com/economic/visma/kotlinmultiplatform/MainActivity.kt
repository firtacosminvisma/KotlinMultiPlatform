package com.economic.visma.kotlinmultiplatform

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mobileconf.shared.GitHubApi
import kotlinx.android.synthetic.main.activity_main.hello_world_text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val githubApi = GitHubApi()
        hello_world_text.text = "loading ..."
        githubApi.load {
            hello_world_text.text = "result: ${it.url}"
        }
    }
}
