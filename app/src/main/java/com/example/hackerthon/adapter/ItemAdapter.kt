package com.example.hackerthon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hackerthon.MyAllergyList
import com.example.hackerthon.R

class ItemAdapter(
    //MyPlayList List를 받을 변수 dataset과
    //각종 앱 관련 정보를 받을 context 객체를 생성자에 선언
    private val context: Context,
    private val dataset: List<MyAllergyList>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val ingredient: TextView = view.findViewById(R.id.ingredient)
    }
    //RecyclerView의 새 뷰 홀더를 만들기 위해 레이아웃 관리자가 호출
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_allergy, parent, false)

        return ItemViewHolder(adapterLayout)
    }
    //목록 항목 뷰의 콘텐츠를 바꾸기 위해 레이아웃 관리자가 호출
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.ingredient.text = item.stringName
    }
    //데이터 세트의 크기를 반환
    override fun getItemCount(): Int {
        return dataset.size
    }
}