package com.example.myhealthv0.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Base de données des médicaments
 * source provenant du ministere français
 * cette db a ete retravaillé a des fins pour cette application
 * application à des fins non commerciales
 */
@Entity(tableName = "medicament")
class DataMedicament (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "Code_CIS")
    val  id_medoc: Int?,

    @ColumnInfo(name="Designation")
    var text1: String?,

    @ColumnInfo(name="Forme_Pharmaceutique")
    val text2: String?,

    @ColumnInfo(name="Voie_Administration")
    val text3: String?
)

/*
CREATE TABLE "login" (
"id_login"	INTEGER,
"login_login"	TEXT NOT NULL,
"password_login"	TEXT NOT NULL,
PRIMARY KEY("id_login" AUTOINCREMENT)
)*/