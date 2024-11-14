package com.example.taskone.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.taskone.data.FullData
import com.example.taskone.model.Movie
import com.example.taskone.ui.theme.TaskOneTheme
import com.example.taskone.navigation.TopAppBarWithBackButton

@Composable
fun RecommendationsScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column {
        TopAppBarWithBackButton(
            title = "Recommendations",
            showBackButton = false,
            navController = navController
        )
    }
}

@Composable
fun RecommendationsScreen(
    modifier: Modifier = Modifier,
    movies: List<Movie> = FullData.Movie
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(160.dp),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(movies, key = { it.Title }) { movie ->
            Image(
                painter = painterResource(id = movie.Photo),
                contentDescription = movie.Title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendationsScreenPreview() {
    TaskOneTheme {
        RecommendationsScreen()
    }
}
