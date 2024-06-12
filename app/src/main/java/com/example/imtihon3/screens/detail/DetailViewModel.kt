package com.example.imtihon3.screens.detail

import com.example.imtihon3.database.Book
import com.example.imtihon3.screens.primary.PrimaryModel

class DetailViewModel(val model: PrimaryModel) {
    fun updateState(book: Book) {
        book.saved = !book.saved
        model.update(book)
    }
}