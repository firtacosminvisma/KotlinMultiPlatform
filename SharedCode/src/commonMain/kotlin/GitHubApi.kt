package com.example.mobileconf.shared

import coroutineDispatcher
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GitHubApi {
    private val client = HttpClient {
        install(JsonFeature) {

            serializer = KotlinxSerializer().apply {
                setMapper(GitHubUser::class, GitHubUser.serializer())
            }
        }
    }

    fun load(completion: (GitHubUser) -> Unit) {
        GlobalScope.launch(coroutineDispatcher) {
            val url = "https://api.github.com/users/defunkt"
            val user = client.get<GitHubUser>(url)
            completion(user)
        }
    }
}
