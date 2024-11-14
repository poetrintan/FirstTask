package com.example.taskone.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.taskone.data.FullData
import com.example.taskone.model.Anime
import com.example.taskone.navigation.TopAppBarWithBackButton

@Composable
fun DetailAnimeScreen(
    navController: NavController,
    animeTitle: String?,
    modifier: Modifier = Modifier
) {
    val anime = FullData.Anime.find { it.Title == animeTitle }
    anime?.let {
        Column(
            modifier = modifier.padding(16.dp)
        ) {
            DetailAnimeContent(anime = it)
        }
    } ?: run {
        Text(text = "Anime not found", modifier = modifier.padding(16.dp))
    }
}
Column {
    TopAppBarWithBackButton(
        title = "Detail Anime",
        showBackButton = true,
        navController = navController
    )
}
}


@Composable
private fun DetailAnimeContent(
    anime: Anime,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = anime.Photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Anime Poster"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = anime.Title,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Genre: ${anime.Genre}",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Studio: ${anime.Studio}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailAnimeContentPreview() {
    DetailAnimeContent(
        anime = Anime(
            Title = "Jujutsu Kaisen",
            Genre = "Action",
            Studio = "MAPPA",
            Photo = R.drawable.jjk
        )
    )
}
