package com.example.myhealthv0.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "maladie")
class DataMaladie (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id_maladie")
    val id_maladie: Int?,

    @ColumnInfo(name="nom_maladie")
    val text2: String?

    )

/*
CREATE TABLE "maladie" (
	"id_maladie"	INTEGER,
	"nom_maladie"	TEXT,
	PRIMARY KEY("id_maladie" AUTOINCREMENT)
)
))*/
