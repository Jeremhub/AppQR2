package com.example.appqr

import okhttp3.Credentials
import okhttp3.Interceptor

class BasicAuthInterceptor (identifiant: String, mdp: String):
    Interceptor{
        private var credentials: String = Credentials.basic(identifiant, mdp)

        override fun intercept(chain: Interceptor.Chain):
                okhttp3.Response {
                var request = chain.request()
                request = request.newBuilder().header("Authorization", credentials).build()
                return chain.proceed(request)
        }
    }