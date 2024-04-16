package com.myapps.image_preview.Api

import com.myapps.image_preview.Utils.MyAuthResult

interface FirebaseApi {

    suspend fun createAccount(email: String, password: String) : MyAuthResult

}