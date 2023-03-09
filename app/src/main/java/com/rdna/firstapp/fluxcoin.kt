package com.rdna.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_algo.*
import kotlinx.android.synthetic.main.activity_fluxcoin.*

class fluxcoin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fluxcoin)
        supportActionBar?.hide()
        websetup()
    }
    private fun websetup()
    {
        fluxspec.webViewClient = WebViewClient()
        algospec.apply{
            loadUrl("https://coinmarketcap.com/currencies/zel/")
        }
    }
}