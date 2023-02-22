package com.example.myhealthv0.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "traitement")
class DataTraitement (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id_traitement")
    val  id_traitement: Int?,

    @ColumnInfo(name="quantite")
    var text1: Int?,

    @ColumnInfo(name="heure_prise")
    val text2: String?,

    @ColumnInfo(name="duree")
    val text3: Int?,

    @ColumnInfo(name="id_maladie")
    val text4: Int?,

    @ColumnInfo(name="id_medicament")
    val text5: Int?
)
/*
CREATE TABLE "traitement" (
	"id_traitement"	INTEGER NOT NULL,
	"quantite"	INTEGER,
	"heure_prise"	NUMERIC,
	"duree"	NUMERIC,
	"id_medicament"	INTEGER,
	"id_maladie"	INTEGER,
	PRIMARY KEY("id_traitement" AUTOINCREMENT),
	FOREIGN KEY("id_maladie") REFERENCES "maladie"("id_maladie"),
	FOREIGN KEY("id_medicament") REFERENCES "medicament"("Code_CIS")
)
))*/
