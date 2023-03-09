package com.rdna.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import kotlinx.android.synthetic.main.activity_econ.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()

{

    override fun onCreate(savedInstanceState: Bundle?)

    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        M_Algo.setOnClickListener{
            startActivity(Intent(this,Algo::class.java))
        }

        M_Apx.setOnClickListener{
            startActivity(Intent(this,Apx::class.java))
        }

        M_btcp.setOnClickListener{
            startActivity(Intent(this,bitcoin::class.java))
        }

        M_eth.setOnClickListener{
            startActivity(Intent(this,eth::class.java))
        }

        M_econ.setOnClickListener {
            startActivity(Intent(this,login::class.java))
        }

        M_flux.setOnClickListener {
            startActivity(Intent(this,fluxcoin::class.java))
        }
    }





}
