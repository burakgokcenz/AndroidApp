package com.live.mobilproje.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.live.mobilproje.R
import kotlinx.android.synthetic.main.toolbar.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setSupportActionBar(ac_toolbar)

        supportActionBar?.apply {


            setDisplayHomeAsUpEnabled(true)
            title = "Hakkında"
            setDisplayShowHomeEnabled(true)
        }
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_about)
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}