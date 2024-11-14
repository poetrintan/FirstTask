package com.example.taskone.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.taskone.navigation.NavigationItem
import com.example.taskone.R
import com.example.taskone.component.AnimeItem
import com.example.taskone.data.FullData
import com.example.taskone.model.Anime
import com.example.taskone.model.Manhwa
import com.example.taskone.screen

@Preview(showBackground = true)
@Composable
private fun HealingAppPreview() {
    HealingAppPreview()
}

@Composable
fun InfiniteApp(
    Anime: List<Anime>,
    Manhwa: List<Manhwa>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(Anime) {
                    items(Anime, key = { it.Title }) {
                        AnimeItem(Anime = it)
                    }
                }
            }
            items(Manhwa) {
                items(Manhwa, key = { it.Title }) {
                    ManhwaItem(Manhwa = it, modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
        }

        @Preview(showBackground = true)
        @Composable
        private fun InfiniteAppPrev() {
            HealingAppPreview(
                Anime = FullData.Anime,
                Manhwa = FullData.Manhwa,
            )