package com.example.projekt1.networking

class APIHelper(private val apiService: APIService) {

    suspend fun getLocations(name: String) = apiService.getLocations(name)

    suspend fun getSpecificLocation(woeid: String) = apiService.getSpecificLocation(woeid)

}