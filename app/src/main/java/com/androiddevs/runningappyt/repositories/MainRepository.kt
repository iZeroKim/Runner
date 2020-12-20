package com.androiddevs.runningappyt.repositories

import com.androiddevs.runningappyt.database.Run
import com.androiddevs.runningappyt.database.RunDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


class MainRepository @Inject constructor(
    val runDao: RunDao
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurnt() = runDao.getAllRunsSortedByCaloriesBurnt()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCalorieBurnt() = runDao.getTotalCaloriesBurnt()

    fun getAvgSpeed() = runDao.getAverageSpeed()
}