package com.ivan.m.pagingdemo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ivan.m.pagingdemo.data.local.dao.UnsplashImageDao
import com.ivan.m.pagingdemo.data.local.dao.UnsplashRemoteKeysDao
import com.ivan.m.pagingdemo.model.UnsplashImage
import com.ivan.m.pagingdemo.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}