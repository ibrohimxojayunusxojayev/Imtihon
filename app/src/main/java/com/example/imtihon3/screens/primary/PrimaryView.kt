package com.example.imtihon3.screens.primary

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.imtihon3.navigation.BottomNavGraph

@Composable
fun PrimaryView(pvm: PrimaryViewModel) {
    val bottomNavController = rememberNavController()
    Scaffold(bottomBar = {
        BottomNavigationBar(bottomNavController = bottomNavController)
    }) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding(), start = 16.dp, end = 16.dp, bottom = it.calculateBottomPadding())
        ) {
            Text(text = "BookLibrary", fontSize = 28.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(vertical = 8.dp))
            Box(modifier = Modifier.weight(1f)) {
                BottomNavGraph(
                    pvm = pvm, bottomNavController = bottomNavController
                )
            }
        }
    }
}