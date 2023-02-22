package com.example.myhealthv0.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "medecin")
class DataMedecin (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id_medecin")
    val  id_medecin: Int?,

    @ColumnInfo(name="prenom_medecin")
    var text1: String?,

    @ColumnInfo(name="nom_medecin")
    val text2: String?,

    @ColumnInfo(name="adresse_medecin")
    val text3: String?,

    @ColumnInfo(name="cp_medecin")
    val text4: Int?,

    @ColumnInfo(name="ville_medecin")
    val text5: String?,

    @ColumnInfo(name="tel_medecin")
    val text6: String?,



    @ColumnInfo(name="id_specialite")
    val text7: Int?
)
/*
CREATE TABLE "medecin" (
	"id_medecin"	INTEGER,
	"prenom_medecin"	NUMERIC,
	"nom_medecin"	TEXT,
	"adresse_medecin"	BLOB,
	"cp_medecin"	TEXT,
	"ville_medecin"	BLOB,
	"tel_medecin"	INTEGER,
	"id_specialite"	INTEGER NOT NULL,
	FOREIGN KEY("id_specialite") REFERENCES "specialite",
	PRIMARY KEY("id_medecin" AUTOINCREMENT)
)
))*/
