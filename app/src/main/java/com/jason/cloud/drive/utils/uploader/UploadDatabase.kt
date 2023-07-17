package com.jason.cloud.drive.utils.uploader

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UploadTask::class], version = 1)
abstract class UploadDatabase : RoomDatabase() {
    abstract fun getUploadDao(): UploadDao
}