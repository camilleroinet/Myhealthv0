package com.example.myhealthv0.model

import androidx.lifecycle.*
import com.example.myhealthv0.db.DataMedicament
import kotlinx.coroutines.launch
import com.example.myhealthv0.Event
import com.example.myhealthv0.db.DataUserRepository

class ViewModelDao (private val repo: DataUserRepository) : ViewModel() {
    private var isUpdateOrDelete = false
    private lateinit var userToUpdateOrDelete: DataMedicament
    val inputName1 = MutableLiveData<String?>()
    val saveOrUpdateButtonText = MutableLiveData<String>()
    private val clearAllOrDeleteButtonText = MutableLiveData<String>()
    private val statusMessage = MutableLiveData<Event<String>>()
    val message: LiveData<Event<String>>
        get() = statusMessage

    init{
        saveOrUpdateButtonText.value = "rechercher"
        clearAllOrDeleteButtonText.value = "clear All"
    }

    fun initUpdateAndDelete(datauser: DataMedicament){
        inputName1.value = datauser.text1
        isUpdateOrDelete = true
        userToUpdateOrDelete = datauser
        saveOrUpdateButtonText.value = "Update"
        clearAllOrDeleteButtonText.value = "Delete"
    }

    fun saveOrUpdate(){
        if(inputName1.value == null){
            statusMessage.value = Event("Le champ doit etre rempli")
        }else {
            if(isUpdateOrDelete){
                userToUpdateOrDelete.text1 = inputName1.value!!
                updateDatauser(userToUpdateOrDelete)
            }else{
                val name = inputName1.value!!
                val name2 = inputName1.value!!
                val name3 = inputName1.value!!

                insertDataUser(DataMedicament(0, name, name2, name3))
                inputName1.value = ""
            }
        }
    }

    private fun insertDataUser(datauser: DataMedicament) = viewModelScope.launch {
        val newRowId = repo.insert(datauser)
        if (newRowId > -1){
            statusMessage.value = Event("insertion ok $newRowId")
        } else {
            statusMessage.value = Event("Tache non effectuee")
        }
    }

    private fun updateDatauser(datauser: DataMedicament) = viewModelScope.launch {
        val noOfRow = repo.update(datauser)
        if (noOfRow > 0){
            inputName1.value = ""
            isUpdateOrDelete = false
            saveOrUpdateButtonText.value = "save"
            clearAllOrDeleteButtonText.value = "clear all"
            statusMessage.value = Event("$noOfRow update ok")
        }else {
            statusMessage.value = Event("Problemes")
        }
    }

    fun getSavedUser() = liveData {
        repo.users.collect{
            emit(it)
        }
    }

    fun clearallOrdelete(){
        if (isUpdateOrDelete){
            deleteUser(userToUpdateOrDelete)
        }else{
            clearAll()
        }
    }

    private fun deleteUser(datauser: DataMedicament) = viewModelScope.launch {
        val noOfRowDeleted = repo.delete(datauser)
        if (noOfRowDeleted > 0){
            inputName1.value = ""
            isUpdateOrDelete = false
            saveOrUpdateButtonText.value = "save"
            clearAllOrDeleteButtonText.value = "clear all"
            statusMessage.value = Event("$noOfRowDeleted Row supprimee")
        }else{
            statusMessage.value = Event("Probleme")
        }
    }

    private fun clearAll() = viewModelScope.launch {
        val noOfRowDeleted = repo.deleteAll()
        if (noOfRowDeleted > 0){
            statusMessage.value = Event("$noOfRowDeleted user supprimee")
        }else{
            statusMessage.value = Event("Probleme")
        }
    }

}