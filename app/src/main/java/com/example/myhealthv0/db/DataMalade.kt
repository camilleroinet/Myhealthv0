package com.example.myhealthv0.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "malade")
class DataMalade (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id_malade")
    val  id_malade: Int?,

    @ColumnInfo(name="prenom_malade")
    var text1: String?,

    @ColumnInfo(name="nom_malade")
    val text2: String?,

    @ColumnInfo(name="age_malade")
    val text3: Int?,

    @ColumnInfo(name="poids_malade")
    val text4: Int?

    )

/*
CREATE TABLE "malade" (
	"id_malade"	INTEGER NOT NULL,
	"prenom_malade"	TEXT,
	"nom_malade"	TEXT,
	"age_malade"	INTEGER,
	"poids_malade"	REAL,
	PRIMARY KEY("id_malade" AUTOINCREMENT)
))*/
