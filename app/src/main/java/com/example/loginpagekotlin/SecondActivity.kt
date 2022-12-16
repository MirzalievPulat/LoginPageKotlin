package com.example.loginpagekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initviews()
    }
    fun initviews(){
        var tv_id = findViewById<TextView>(R.id.tv_id)
        var tv_pw = findViewById<TextView>(R.id.tv_pw)
        val id = intent.getStringExtra("id")
        val pw = intent.getStringExtra("pw")
        tv_id.setText(id)
        tv_pw.setText(pw)
    }
}