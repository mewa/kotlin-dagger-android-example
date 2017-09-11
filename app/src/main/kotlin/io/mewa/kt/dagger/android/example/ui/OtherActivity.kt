package io.mewa.kt.dagger.android.example.ui

import android.os.Bundle
import android.util.Log
import dagger.android.DaggerActivity
import io.mewa.kt.dagger.android.example.R
import io.mewa.kt.dagger.android.example.api.Api
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class OtherActivity : DaggerActivity() {

    @Inject lateinit var api: Api

    init {
        Log.d("OtherActivity", "instantiated")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("OtherActivity", "onCreate")

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
