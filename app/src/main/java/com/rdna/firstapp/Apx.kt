package com.rdna.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_algo.*
import kotlinx.android.synthetic.main.activity_apx.*

class Apx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apx)
        supportActionBar?.hide()

        websetup()

    }
    private fun  websetup()
    {
        apxsec.webViewClient = WebViewClient()
        apxsec.apply {
            loadUrl("https://coinmarketcap.com/currencies/apx/")
            settings.javaScriptEnabled = true

        }
    }
}