package com.example.SHWAPNO

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webVIew()
    }


    private fun webVIew() {
        val shwapnoWeb : WebView = findViewById(R.id.shwapno_web)
        shwapnoWeb.webViewClient = WebViewClient()
        shwapnoWeb.apply {
            loadUrl("https://www.shwapno.com/")
            settings.javaScriptEnabled = true

        }
    }
}