package com.example.proj20_git.data.dao

import androidx.room.*
import com.example.proj20_git.data.entity.GithubRepoEntity

@Dao
interface SearchHistoryDao {

    @Insert
    suspend fun insert(repo: GithubRepoEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(repoList: List<GithubRepoEntity>)

    @Query("SELECT * FROM githubrepository")
    suspend fun getHistory(): List<GithubRepoEntity>

    @Query("SELECT * FROM githubrepository WHERE fullName = :repoName")
    suspend fun getRepository(repoName: String): GithubRepoEntity?

    @Query("DELETE FROM githubrepository WHERE fullName = :repoName")
    suspend fun remove(repoName: String)

    @Query("DELETE FROM githubrepository")
    suspend fun clearAll()

}
