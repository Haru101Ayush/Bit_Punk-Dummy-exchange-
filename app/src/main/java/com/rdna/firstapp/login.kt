package com.rdna.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        cd_skip.setOnClickListener {
            startActivity(Intent(this,acc_offline::class.java))
        }
        singup.setOnClickListener{
            startActivity(Intent(this,welcome::class.java))

        }

    }
}