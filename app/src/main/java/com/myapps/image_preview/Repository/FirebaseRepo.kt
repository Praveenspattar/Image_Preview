package com.myapps.image_preview.Repository

import com.myapps.image_preview.Api.FirebaseApi
import com.myapps.image_preview.Utils.MyAuthResult

class FirebaseRepo(private val fireServices : FirebaseApi) {
    suspend fun createAccount(email: String, password: String): MyAuthResult {
        return fireServices.createAccount(email, password)
    }
}