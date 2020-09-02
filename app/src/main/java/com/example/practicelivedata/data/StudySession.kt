package com.example.practicelivedata.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "study_table_test")
data class StudySession(
    @PrimaryKey
    val data: String,
    val hours: Float,
    val minutes: Long,
    val weekDay: String,
    val dayOfMonth: Int,
    val month: Int,
    val year: Int,
)