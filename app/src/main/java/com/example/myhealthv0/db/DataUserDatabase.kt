package com.example.myhealthv0.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [
    //DataLogin::class,
    //DataMalade::class,
    //DataMaladie::class,
   // DataMedecin::class,
    DataMedicament::class
    //DataOrdonnance::class,
    //DataSpecialite::class,
    //DataTraitement::class
                     ], version = 1, exportSchema = false)
abstract class DataUserDatabase : RoomDatabase() {
    abstract val userDao: UserDao

    companion object{
        @Volatile
        private var INSTANCE: DataUserDatabase? = null
        fun getInstance(context: Context): DataUserDatabase{
            synchronized(this){
                var instance = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        DataUserDatabase::class.java,
                        "db_myhealth"
                    ).createFromAsset("gestion_medoc.sqlite").allowMainThreadQueries().build()
                }
                return instance
            }
        }
    }
}