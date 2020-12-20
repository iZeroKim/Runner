package com.androiddevs.runningappyt.database

import android.graphics.Bitmap
import androidx.room.Entity

@Entity(tableName = "Running_table")
data class Run(
    var img: Bitmap? = null,
    //Time/Date when run occurred
    var timestamp: Long = 0L,
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    //Run duration
    var timeInMillis: Long = 0L,
    var caloriesBurnt: Int = 0
){

}
