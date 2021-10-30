package com.example.hackerthon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.hackerthon.adapter.ItemAdapter
import com.example.hackerthon.data.Datasource

class AllergySettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allergysetting)

//        val newsButton: ImageButton = findViewById(R.id.newsButton)
//        newsButton.setOnClickListener{
//            val intent = Intent(this, NewsActivity::class.java)
//            startActivity(intent)
//        }
//        val homeButton: ImageButton = findViewById(R.id.homeButton)
//        homeButton.setOnClickListener{
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//        val searchingButton: ImageButton = findViewById(R.id.searchingButton)
//        searchingButton.setOnClickListener{
//            val intent = Intent(this, SearchingActivity::class.java)
//            startActivity(intent)
//        }

        val allergicIngredient: EditText = findViewById(R.id.allergicIngredient)
        val addButton: Button = findViewById(R.id.add_button)
        // addButton.setOnClickListener { addAllergyList() }

        // Datasource 인스턴스를 만들고 이 인스턴스에서 loadMyPlayList() 메서드를 호출
        // 반환된 확인 목록을 myDataset라는 val에 저장
        val myDataset = Datasource().loadMyAllergyList()

        // 컨텍스트(this)와 myDataset를 매개변수로 새 ItemAdapter 인스턴스를 만들어
        // ItemAdapter 객체를 recyclerView의 adapter 속성에 할당
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }
}