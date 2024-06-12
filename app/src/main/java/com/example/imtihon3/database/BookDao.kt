package com.example.imtihon3.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BookDao {
    @Insert
    fun insertBook(book: Book)

    @Delete
    fun deleteBook(book: Book)

    @Update
    fun updateBook(book: Book)

    @Query("SELECT * FROM Books WHERE id = :id")
    fun getBook(id: Int): Book

    @Query("SELECT * FROM Books WHERE saved = 1")
    fun getSavedBooks(): MutableList<Book>

    @Query("SELECT * FROM Books")
    fun getAllBooks(): MutableList<Book>
}