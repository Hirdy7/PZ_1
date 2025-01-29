package com.example.pz_1

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingSuperCall")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnToDialog : Button = findViewById(R.id.btnToDialogWindow)
        val btnToEmpty: Button = findViewById(R.id.btnToEmpty)

        btnToDialog.setOnClickListener{
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }

        btnToEmpty.setOnClickListener{
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStart(){
        super.onStart()
        Log.d("MainActivity", "onStart called")
    }
    override fun onResume(){
        super.onResume()
        Log.d("MainActivity", "onResume called")
    }
    override fun onPause(){
        super.onPause()
        Log.d("MainActivity", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop called")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("MainActivity", "onDestroy called")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d("MainActivity", "onRestart called")
    }
}