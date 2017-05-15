package io.mewa.kt.dagger.android.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.mewa.kt.dagger.android.example.api.Api
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*

import javax.inject.Inject

class OtherActivity : AppCompatActivity() {
    init {
        Log.d("OtherActivity", "instantiated")
    }

    @Inject lateinit var api: Api

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("OtherActivity", "onCreate")
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.let {
            it.setText("Call API")
            it.setOnClickListener {
                api.call()
            }
        }
    }

    override fun onDestroy() {
        Log.d("OtherActivity", "onDestroy")
        super.onDestroy()
    }
}
