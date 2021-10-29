package com.example.hackerthon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SearchingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching)

        val settingButton: ImageButton = findViewById(R.id.settingButton)
        settingButton.setOnClickListener{
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
        val newsButton: ImageButton = findViewById(R.id.newsButton)
        newsButton.setOnClickListener{
            val intent = Intent(this, NewsActivity::class.java)
            startActivity(intent)
        }
        val homeButton: ImageButton = findViewById(R.id.homeButton)
        homeButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val searchingButton: ImageButton = findViewById(R.id.searchingButton)
        searchingButton.setOnClickListener{
            val intent = Intent(this, SearchingActivity::class.java)
            startActivity(intent)
        }


    }
}