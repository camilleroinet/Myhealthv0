package com.example.myhealthv0.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login")
class DataLogin (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id_login")
    val id_login: Int?,

    @ColumnInfo(name="login_login")
    var text1: String?,

    @ColumnInfo(name="password_login")
    val text2: String?

    )

/*
CREATE TABLE "login" (
"id_login"	INTEGER,
"login_login"	TEXT NOT NULL,
"password_login"	TEXT NOT NULL,
PRIMARY KEY("id_login" AUTOINCREMENT)
)*/
