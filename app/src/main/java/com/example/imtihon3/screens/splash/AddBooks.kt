package com.example.imtihon3.screens.splash

import android.content.Context
import com.example.imtihon3.database.AppDatabase
import com.example.imtihon3.database.Book

fun AddBooks(context: Context) {
    val books = listOf(
        Book(
            name = "Summer Island",
            author = "Kristin Hannah",
            description = "Years ago, Nora Bridge walked out on her marriage and left her daughters behind. She has since become a famous radio talk-show host and newspaper columnist beloved for her moral advice. Her youngest daughter, Ruby, is a struggling comedienne who uses her famous mother as fuel for her bitter, cynical humor.",
            image = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1349126636i/8738280.jpg"
        ),
        Book(
            name = "True Colors",
            author = "Kristin Hannah",
            description = "True Colors is New York Times bestselling author Kristin Hannah's most provocative, compelling, and heart-wrenching story yet. With the luminous writing and unforgettable characters that are her trademarks, she tells the story of three sisters whose once-solid world is broken apart by jealousy, betrayal, and the kind of passion that rarely comes along.",
            image = "https://m.media-amazon.com/images/I/61-6MEz7GhL._AC_UF1000,1000_QL80_.jpg"
        ),
        Book(
            name = "Xamsa",
            author = "Alisher Navoiy",
            description = "„Xamsa“ yozishni ozarbayjonlik ulugʻ shoir Nizomiy Ganjaviy boshlab bergan. U 1170–1204-yillar oraligʻida birin-ketin 5 ta doston yaratdi. Bu dostonlar shoirning vafotidan keyin yaxlit bir toʻplam holiga keltirilib „Panj ganj“ („Besh xazina“) deb nomlandi va keyinchalik „Xamsa“ nomi bilan mashhur boʻldi.",
            image = "https://kitoblardunyosi.uz/image/cache/catalog/badiiy_adabiyot/xamsa-web-500x750.jpg"
        ),
        Book(
            name = "Molxona",
            author = "George Oguelda",
            description = "Molxona — 1945-yil 17-avgustida George Orwell tomonidan yozilgan asar. Asarda bir guruh fermada yashovchi hayvonlarining oʻz xoʻjayinlariga qarshi qoʻzgʻolon koʻtarishi va natijada erkin, teng hamda baxtli jamiyat qurishga umid qilish jarayonlari hikoya qilib beriladi. ",
            image = "https://upload.wikimedia.org/wikipedia/commons/7/72/Animal_Farm_%28uzbek_edition%29.jpg"
        ),
    )
    val dao = AppDatabase.getInstance(context).getBookDao()
    books.forEach {
        dao.insertBook(it)
    }
}