package com.example.homework19_2

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomAdapter(activity: MainActivity,val list: List<DataClass>) :FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): SecondFragment {
        return SecondFragment().apply {
            arguments=android.os.Bundle().apply {
                val item=list[position]
                putInt("img",item.img)
                putString("title",item.title)
                putString("description",item.description)
            }
        }
    }

}