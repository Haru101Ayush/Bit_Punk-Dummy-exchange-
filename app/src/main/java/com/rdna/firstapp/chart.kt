package com.rdna.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.rdna.firstapp.chart
import kotlinx.android.synthetic.main.activity_chart.*

class chart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)
        supportActionBar?.hide()
        websetup()

    }
    private fun  websetup()
    {
        chart.webViewClient = WebViewClient()
        chart.apply {
            loadUrl("https://in.tradingview.com/chart/?symbol=BINANCE%3AETHUSDT")
            settings.javaScriptEnabled =true

        }
    }
}