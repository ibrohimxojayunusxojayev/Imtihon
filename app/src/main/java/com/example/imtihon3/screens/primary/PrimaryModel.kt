package com.example.imtihon3.screens.primary

import com.example.imtihon3.database.AppDatabase
import com.example.imtihon3.database.Book

class PrimaryModel(val db: AppDatabase) {
    fun getAllBooks() = db.getBookDao().getAllBooks()
    fun getSavedBooks() = db.getBookDao().getSavedBooks()
    fun update(book: Book) = db.getBookDao().updateBook(book)


}