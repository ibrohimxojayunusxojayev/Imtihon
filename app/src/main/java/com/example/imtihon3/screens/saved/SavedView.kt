package com.example.imtihon3.screens.saved

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.example.imtihon3.screens.home.BookItem
import com.example.imtihon3.screens.primary.PrimaryViewModel

@Composable
fun SavedView(pvm: PrimaryViewModel){
    val books = pvm.savedBooks.observeAsState().value!!
    LazyColumn {
        items(books) {
            BookItem(it, pvm)
        }
    }
}