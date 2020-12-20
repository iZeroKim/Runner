package com.androiddevs.runningappyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androiddevs.runningappyt.database.RunDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
