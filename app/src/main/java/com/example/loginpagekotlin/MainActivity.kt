package com.example.loginpagekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var et_id:EditText
    lateinit var et_pw:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }
    fun initviews(){
        et_id = findViewById<EditText>(R.id.et_id)
        et_pw = findViewById<EditText>(R.id.et_pw)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            openNextPage()
        }
    }
    fun openNextPage(){
        val intent = Intent(this,SecondActivity::class.java)
        val id = et_id.text.toString()
        val pw = et_pw.text.toString()
        intent.putExtra("id", id)
        intent.putExtra("pw",pw)
        startActivity(intent)
        finish()
    }
}