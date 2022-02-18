package com.example.proj20_git.data.response

import com.example.proj20_git.data.entity.GithubRepoEntity

data class GithubRepoSearchResponse(
    val totalCount: Int,
    val items: List<GithubRepoEntity>
)
