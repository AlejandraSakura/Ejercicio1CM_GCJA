package com.example.ejercicio1cm_gcja

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        thread {
            Thread.sleep(3000)
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}