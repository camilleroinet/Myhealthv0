package com.example.myhealthv0.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(user: DataMedicament) : Long

    @Update
    suspend fun updateUser(user: DataMedicament) : Int

    @Delete
    suspend fun deleteUser(user: DataMedicament) : Int

    @Query("DELETE FROM medicament")
    suspend fun deleteAll() : Int

    @Query("SELECT * from medicament")
    fun getAllUser(): Flow<List<DataMedicament>>

    @Query("SELECT * from medicament")
    fun getUser(): List<DataMedicament>

    @Query("SELECT * from medicament")
    fun getMedoc(): List<DataMedicament>
}