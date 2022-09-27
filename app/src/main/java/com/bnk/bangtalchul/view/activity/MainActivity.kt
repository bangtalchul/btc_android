package com.bnk.bangtalchul.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.view.fragment.HomeFragment
import com.bnk.bangtalchul.view.fragment.MyPageFragment
import com.bnk.bangtalchul.view.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private val fl: FrameLayout by lazy {
        findViewById(R.id.fl_)
    }

    private val bn: BottomNavigationView by lazy {
        findViewById(R.id.bn_)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
//        if (auth?.currentUser == null) {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
//        else {
            supportFragmentManager.beginTransaction().add(fl.id, HomeFragment()).addToBackStack(null).commit()
//        }

    }

    override fun onStart() {
        super.onStart()
        bn.setOnNavigationItemSelectedListener {
            if(it.itemId == R.id.menu_community){
                startCommunityActivity()
            }else{
                replaceFragment(
                    when (it.itemId) {
                        R.id.menu_mypage -> MyPageFragment()
                        R.id.menu_search -> SearchFragment()
                        else -> HomeFragment()
                    }
                )
            }
            true
        }
    }
    private fun startCommunityActivity(){
        var intent = Intent(this, BoardActivity::class.java)
        intent.putExtra("from", "HOME")
        startActivity(intent)
        finish()
    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(fl.id, fragment).addToBackStack(null).commit()
    }

    override fun onKeyDown(keycode: Int, event: KeyEvent?): Boolean {
        if (keycode == KeyEvent.KEYCODE_BACK) {
            finish()
            return true
        }
        return false
    }

}