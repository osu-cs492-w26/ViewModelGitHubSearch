package edu.oregonstate.cs492.viewmodelgithubsearch.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class GitHubReposRepository(
    private val service: GitHubService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) {
    suspend fun loadReposSearch(query: String): Result<List<GitHubRepo>> {

    }
}