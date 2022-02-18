package com.example.proj20_git.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.proj20_git.data.dao.SearchHistoryDao
import com.example.proj20_git.data.entity.GithubRepoEntity

@Database(entities = [GithubRepoEntity::class], version = 1)
abstract class SimpleGithubDatabase : RoomDatabase() {

    abstract fun searchHistoryDao(): SearchHistoryDao

}
