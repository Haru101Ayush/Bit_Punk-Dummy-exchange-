package com.rdna.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_algo.*

class Algo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algo)
        supportActionBar?.hide()

        websetup()

    }
        private fun  websetup()
        {
            algospec.webViewClient = WebViewClient()
            algospec.apply {
                loadUrl("https://coinmarketcap.com/currencies/algorand/")
                settings.javaScriptEnabled = true


            }
        }
}