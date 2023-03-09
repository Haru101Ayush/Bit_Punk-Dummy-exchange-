package com.rdna.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_acc_offline.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class acc_offline : AppCompatActivity() {


    //private  lateinit var button: Button
    private lateinit var imageView: ImageView

    companion object{
        val Image_Request_Code = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acc_offline)
        supportActionBar?.hide()

        wel_button.setOnClickListener {
            startActivity(Intent(this,landing_page::class.java))
        }

        imageView=findViewById(R.id.pick)

        imageView.setOnClickListener{

            pickimagegallery()

        }

    }
    private fun pickimagegallery()
    {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type="image/*"
        startActivityForResult(intent, Image_Request_Code )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode== Image_Request_Code &&  resultCode == RESULT_OK)
            intent.type= "image/*"
        startActivityForResult(intent,Image_Request_Code)
    }
}

