package com.rdna.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_bitcoin.*
import kotlinx.android.synthetic.main.activity_eth.*

class eth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eth)
        supportActionBar?.hide()

        websetup()

    }
    private fun  websetup()
    {
        ethspec.webViewClient = WebViewClient()
        ethspec.apply {
            loadUrl("https://coinmarketcap.com/currencies/ethereum/")
            settings.javaScriptEnabled = true

        }
    }
}