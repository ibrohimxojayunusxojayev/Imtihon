package com.example.imtihon3.screens.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.imtihon3.R
import com.example.imtihon3.database.Book

@Composable
fun DetailView(dvm: DetailViewModel, navController: NavController, book: Book) {
    val saved = remember { mutableStateOf(book.saved) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 32.dp)
    ) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(Icons.Rounded.ArrowBack, contentDescription = "")
        }
        AsyncImage(
            model = book.image,
            contentDescription = "",
            placeholder = painterResource(id = R.drawable.loading),
            error = painterResource(
                id = R.drawable.error
            ),
            modifier = Modifier
                .height(140.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                Text(
                    text = book.name,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFA7A7A7)
                )
                Text(
                    text = book.author,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W500,
                    color = Color(0xFF666666)
                )
            }
            IconButton(onClick = {
                dvm.updateState(book)
                saved.value = !saved.value
            }) {
                Icon(
                    painter = painterResource(
                        id =
                        R.drawable.bookmark
                    ),
                    contentDescription = "",
                    tint = if (saved.value) Color(0xFF676F8D) else Color(0xFFC7C5C5)
                )
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = book.description,
            fontSize = 14.sp,
            fontWeight = FontWeight.W500,
            color = Color(0xFF666666)
        )
    }
}

