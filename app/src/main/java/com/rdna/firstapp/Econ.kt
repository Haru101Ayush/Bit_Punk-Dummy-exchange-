package com.rdna.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_econ.*

class Econ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_econ)
        supportActionBar?.hide()

        websetup()
    }

    private fun websetup()
    {
        econspec.webViewClient = WebViewClient()
        econspec.apply {
            loadUrl("https://coinmarketcap.com/currencies/e-coin-finance/")
        }

    }
}