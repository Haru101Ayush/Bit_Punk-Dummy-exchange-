package com.rdna.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_algo.*
import kotlinx.android.synthetic.main.activity_bitcoin.*

class bitcoin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitcoin)
        supportActionBar?.hide()

        websetup()

    }
    private fun  websetup()
    {
        btcspec.webViewClient = WebViewClient()
        btcspec.apply {
            loadUrl("https://coinmarketcap.com/currencies/bitcoin/")
            settings.javaScriptEnabled =true

        }
    }
}