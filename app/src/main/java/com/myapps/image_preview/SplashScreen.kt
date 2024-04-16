package com.myapps.image_preview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    private val splashTimeOut: Long = 2000
    private val splashIntent by lazy { Intent(this, MainActivity::class.java) }
    private  var job: Job? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        job = CoroutineScope(Dispatchers.Main).launch {
            delay(splashTimeOut)
            startActivity(splashIntent)
            finish()
        }
    }

    override fun onDestroy() {
        job?.cancel()
        super.onDestroy()
    }
}