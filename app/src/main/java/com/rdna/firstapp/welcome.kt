package com.rdna.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acc_offline.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_welcome.*

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        supportActionBar?.hide()

        hogya.setOnClickListener{
            startActivity(Intent(this,acc_offline::class.java))

            sign_log.setOnClickListener {
                startActivity(Intent(this,login::class.java))
            }

        }
    }
}