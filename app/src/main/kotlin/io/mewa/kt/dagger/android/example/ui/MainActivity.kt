package io.mewa.kt.dagger.android.example.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import dagger.android.DaggerActivity
import io.mewa.kt.dagger.android.example.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerActivity() {

    init {
        Log.d("MainActivity", "instantiated")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MainActivity", "onCreate")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, OtherActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy")
        super.onDestroy()
    }

}
