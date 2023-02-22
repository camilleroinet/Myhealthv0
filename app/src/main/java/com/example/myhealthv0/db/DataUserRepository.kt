package com.example.myhealthv0.db

class DataUserRepository(private val dao:UserDao) {
    val users = dao.getAllUser()

    suspend fun insert(userdao: DataMedicament): Long{
        return dao.insertUser(userdao)
    }

    suspend fun update(userdao:DataMedicament): Int {
        return dao.updateUser(userdao)
    }

    suspend fun delete(userdao: DataMedicament): Int{
        return dao.deleteUser(userdao)
    }

    suspend fun deleteAll() : Int{
        return dao.deleteAll()
    }

}