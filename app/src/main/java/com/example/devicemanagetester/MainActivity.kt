package com.example.devicemanagetester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.devicemanagetester.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.tabLayout.setupWithViewPager(activityMainBinding.viewPager)
        activityMainBinding.viewPager.adapter = object : FragmentStatePagerAdapter(supportFragmentManager, 0) {
            override fun getCount(): Int {
                return 1
            }

            override fun getItem(position: Int): Fragment {
                return BuildInfoFragment.newInstance("", "")
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return "Build"
            }

        }
    }
}