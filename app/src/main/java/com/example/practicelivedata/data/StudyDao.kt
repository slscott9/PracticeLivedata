package com.example.practicelivedata.data

import androidx.room.*

@Dao
interface StudyDao {

    @Transaction
    suspend fun upsertStudySession(study: StudySession ){
        val inserted = insertStudySession(study)

        if(inserted == -1L){
            updateStudySession(study.month, study.dayOfMonth, study.hours)
        }
    }

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertStudySession(study: StudySession): Long

    @Query("update study_table_test set hours = hours + :a  where dayOfMonth= :currentDayOfMonth and month= :currentMonth")
    suspend fun updateStudySession(currentMonth: Int, currentDayOfMonth: Int, a: Float )


}