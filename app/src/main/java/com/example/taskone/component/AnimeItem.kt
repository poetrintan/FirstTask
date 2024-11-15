package com.example.taskone.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskone.R
import com.example.taskone.model.Anime
import com.example.taskone.ui.theme.TaskOneTheme

@Composable
fun AnimeItem(
    anime: Anime,
    modifier: Modifier = Modifier,
    onItemClicked: (String) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(anime.Title)
        }
    ) {
        Image(
            painter = painterResource(id = anime.Photo),
            contentDescription = anime.Title,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = anime.Title,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
        Text(
            text = anime.Genre,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AnimeItemPreview() {
    TaskOneTheme {
        AnimeItem(
            anime = Anime(
                Title = "Jujutsu Kaisen",
                Genre = "Action",
                Studio = "MAPPA",
                Photo = R.drawable.jjk
            ),
            onItemClicked = { animeTitle ->
                println("Anime Title: $animeTitle")
            }
        )
    }
}
