package com.example.imtihon3.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Books")
data class Book(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val author: String,
    val description: String,
    var saved: Boolean = false,
    val image: String
)