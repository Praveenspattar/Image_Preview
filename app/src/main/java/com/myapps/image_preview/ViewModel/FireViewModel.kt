package com.myapps.image_preview.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.myapps.image_preview.Repository.FirebaseRepo
import com.myapps.image_preview.Utils.MyAuthResult
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class FireViewModel(private val firebaseRepo: FirebaseRepo) {
    private val _createAccountResult = MutableLiveData<MyAuthResult>()

    val createAccountResult: LiveData<MyAuthResult> get() = _createAccountResult

     fun createAccount(email: String, password: String) {
//        viewModelScope.launch {
//            _createAccountResult.value = firebaseRepo.createAccount(email, password)
//        }
    }
}