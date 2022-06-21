package com.bnk.bangtalchul.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.view.fragment.CommunityFragment
import com.bnk.bangtalchul.view.fragment.HomeFragment
import com.bnk.bangtalchul.view.fragment.MyPageFragment
import com.bnk.bangtalchul.view.fragment.SearchFragment
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private val fl: FrameLayout by lazy {
        findViewById(R.id.fl_)
    }

    private val bn: BottomNavigationView by lazy {
        findViewById(R.id.bn_)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val account = GoogleSignIn.getLastSignedInAccount(this)
        if (account != null) { // 로그인 기능 구현시 != -> =
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        } else {
            supportFragmentManager.beginTransaction().add(fl.id, HomeFragment()).commit()

            bn.setOnNavigationItemSelectedListener {
                replaceFragment(
                    when (it.itemId) {
                        R.id.menu_home -> HomeFragment()
                        R.id.menu_search -> SearchFragment()
                        R.id.menu_community -> CommunityFragment()
                        else -> MyPageFragment()
                    }
                )
                true
            }
        }

    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(fl.id, fragment).commit()
    }

}