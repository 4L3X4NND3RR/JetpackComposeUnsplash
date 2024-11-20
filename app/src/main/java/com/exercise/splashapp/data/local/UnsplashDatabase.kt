package com.exercise.splashapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.exercise.splashapp.data.local.dao.UnsplashImageDao
import com.exercise.splashapp.data.local.dao.UnsplashRemoteKeysDao
import com.exercise.splashapp.model.UnsplashImage
import com.exercise.splashapp.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase: RoomDatabase() {
    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}