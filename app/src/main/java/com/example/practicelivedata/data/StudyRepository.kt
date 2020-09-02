package com.example.practicelivedata.data

class StudyRepository(private val studyDao: StudyDao) {

    suspend fun upsertStudySession(studySession: StudySession){
        studyDao.upsertStudySession(studySession)
    }
}