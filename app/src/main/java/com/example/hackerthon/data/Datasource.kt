package com.example.hackerthon.data

import com.example.hackerthon.MyAllergyList
import com.example.hackerthon.R

class Datasource {

    fun loadMyAllergyList(): MutableList<MyAllergyList> {
        return mutableListOf<MyAllergyList>(
            MyAllergyList("새우"),
            MyAllergyList("대두"),
            MyAllergyList("우유"),
            MyAllergyList("밀"),
        )
    }
}