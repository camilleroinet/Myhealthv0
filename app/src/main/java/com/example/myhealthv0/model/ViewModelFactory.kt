package com.example.myhealthv0.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myhealthv0.db.DataUserRepository

class ViewModelFactory(private val repo: DataUserRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>) :T{
        if (modelClass.isAssignableFrom(ViewModelDao::class.java)){
            return ViewModelDao(repo) as T
        }else{
            throw IllegalArgumentException("View Model inconnu")
        }
    }


}