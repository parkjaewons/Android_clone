package com.example.myfacebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfacebook.databinding.ActivityMainBinding
import com.example.myfacebook.databinding.ActivitySettingprofileBinding

class SettingProfile : AppCompatActivity() {
    private val binding by lazy { ActivitySettingprofileBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val infolist = arrayListOf<info>()
        infolist.add(info("   팔로우 설정", R.drawable.folder))
        infolist.add(info("   프로필 상태", R.drawable.warning))
        infolist.add(info("   Mera Verified", R.drawable.check_mark))
        infolist.add(info("   보관함", R.drawable.card_box))
        infolist.add(info("   미리 보기", R.drawable.eye))
        infolist.add(info("   활동 로그", R.drawable.add_list))
        infolist.add(info("   프로필 및 태그 설정", R.drawable.login))
        infolist.add(info("   게시물 및 태그 검토", R.drawable.speech))
        infolist.add(info("   개인정보 보호 센터", R.drawable.key_lock))
        infolist.add(info("   검색", R.drawable.glass))
        infolist.add(info("   기념 계정설정", R.drawable.love))
        infolist.add(info("   프로페셔널 모드 설정", R.drawable.briefcase))
        infolist.add(info("   다른 프로필 만들기", R.drawable.add))

        binding.mainListView.adapter = CustomAdapter(infolist)
        binding.mainListView.layoutManager = LinearLayoutManager(this)
    }
}