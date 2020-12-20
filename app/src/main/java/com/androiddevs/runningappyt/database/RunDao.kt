package com.androiddevs.runningappyt.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {
    //Replace old run with new run if it exists
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    //Get sorted runs
    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurnt DESC")
    fun getAllRunsSortedByCaloriesBurnt(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    //Get total running time
    @Query("SELECT SUM(timeInMillis) FROM running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    //Get total calories burnt
    @Query("SELECT SUM(caloriesBurnt) FROM running_table")
    fun getTotalCaloriesBurnt(): LiveData<Int>

    //Get total running distance
    @Query("SELECT SUM(distanceInMeters) FROM running_table")
    fun getTotalDistance(): LiveData<Int>

    //Get average speed
    @Query("SELECT AVG(avgSpeedInKMH) FROM running_table")
    fun getAverageSpeed(): LiveData<Float>
}