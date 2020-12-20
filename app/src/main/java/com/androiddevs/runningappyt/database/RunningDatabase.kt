package com.androiddevs.runningappyt.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Run::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class RunningDatabase: RoomDatabase() {
    abstract fun getRunDao(): RunDao
}