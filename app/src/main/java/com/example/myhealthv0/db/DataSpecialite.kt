package com.example.myhealthv0.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "specialite")
class DataSpecialite (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id_specialite")
    val  id_specialite: Int?,

    @ColumnInfo(name="nom_specialite")
    var text1: String?,

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
