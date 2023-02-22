package com.example.myhealthv0.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "ordonnance")
class DataOrdonnance (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id_ordonnance")
    val  id_ordonnance: Int?,

    @ColumnInfo(name="date_delivrance")
    var text1: String?,


    @ColumnInfo(name="id_malade")
    val text2: Int?,

    @ColumnInfo(name="id_medecin")
    val text3: Int?
)
/*
CREATE TABLE "ordonnance" (
	"id_ordonnance"	INTEGER NOT NULL,
	"date_delivrance"	NUMERIC,
	"id_medecin"	INTEGER,
	"id_malade"	INTEGER,
	PRIMARY KEY("id_ordonnance" AUTOINCREMENT),
	FOREIGN KEY("id_malade") REFERENCES "malade"("id_malade")
)
))*/
