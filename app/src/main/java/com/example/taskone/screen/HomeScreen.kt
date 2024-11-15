package com.example.taskone.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.taskone.data.FullData
import com.example.taskone.model.Anime
import com.example.taskone.model.Manhwa
import com.example.taskone.component.AnimeItem
import com.example.taskone.component.ManhwaItem
import com.example.taskone.component.TopAppBarWithBackButton

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column {
        TopAppBarWithBackButton(
            title = "Home",
            showBackButton = false,
            navController = navController
        )
    }
}

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    animeList: List<Anime> = FullData.animes,
    manhwaList: List<Manhwa> = FullData.manhwas,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.padding(16.dp)
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(animeList, key = { it.Title }) { anime ->
                    AnimeItem(anime = anime) {
                        navController.navigate("detail_screen/${anime.Title}")
                    }
                }
            }
        }
        items(manhwaList, key = { it.Title }) { manhwa ->
            ManhwaItem(
                manhwa = manhwa,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .padding(horizontal = 16.dp)
            )
        }
    }
}

