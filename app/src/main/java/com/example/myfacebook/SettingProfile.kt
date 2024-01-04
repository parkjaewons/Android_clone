package com.example.myfacebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class SettingProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settingprofile)

        var infolist = arrayListOf<info>(
            info("   팔로우 설정", "folder"),
            info("   프로필 상태", "warning"),
            info("   Mera Verified", "check_mark"),
            info("   보관함", "card_box"),
            info("   미리 보기", "eye"),
            info("   활동 로그", "add_list"),
            info("   프로필 및 태그 설정", "login"),
            info("   게시물 및 태그 검토", "speech"),
            info("   개인정보 보호 센터", "key_lock"),
            info("   검색", "glass"),
            info("   기념 계정설정", "love"),
            info("   프로페셔널 모드 설정", "briefcase"),
            info("   다른 프로필 만들기", "add")
        )

        val listview = findViewById<ListView>(R.id.mainListView)

        val adapter = Data(this, infolist)
        listview.adapter = adapter
    }
}