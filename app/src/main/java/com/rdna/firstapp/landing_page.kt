package com.rdna.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_landing_page.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_welcome.*

class landing_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
        supportActionBar?.hide()


        card2.setOnClickListener {
            startActivity(Intent(this, nft_place::class.java))}

            card1.setOnClickListener {
                startActivity(Intent(this,chart::class.java))}

        dash.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))}




        }
    }
