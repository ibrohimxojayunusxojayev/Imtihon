package com.example.imtihon3.screens.primary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import com.example.imtihon3.database.Book

class PrimaryViewModel(private val model: PrimaryModel, private val navController: NavController) {
    private val _books = MutableLiveData<List<Book>>()
    val books: LiveData<List<Book>> = _books

    private val _savedBooks = MutableLiveData<List<Book>>()
    val savedBooks: LiveData<List<Book>> = _savedBooks

    init {
        _books.value = model.getAllBooks()
        _savedBooks.value = model.getSavedBooks()
    }

    fun updateState(book: Book) {
        book.saved = !book.saved
        model.update(book)
        _books.value = model.getAllBooks()
        _savedBooks.value = model.getSavedBooks()
    }

    fun navigate(book: Book) {
        navController.navigate("detail_screen/${book.id}")
    }
}