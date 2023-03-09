package com.rdna.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_bitcoin.*
import kotlinx.android.synthetic.main.activity_landing_page.*
import kotlinx.android.synthetic.main.activity_nft_place.*

class nft_place : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nft_place)
        supportActionBar?.hide()
        websetup()

    }
    private fun  websetup()
    {
        nft.webViewClient = WebViewClient()
        nft.apply {
            loadUrl("https://opensea.io/category/art")
            settings.javaScriptEnabled =true

        }
    }
}