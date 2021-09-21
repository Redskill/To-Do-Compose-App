package com.redskill.to_docompose.data.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.redskill.to_docompose.data.ToDoDao

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}