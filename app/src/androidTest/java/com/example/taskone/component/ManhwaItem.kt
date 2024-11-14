package com.example.taskone.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskone.R
import com.example.taskone.model.Manhwa
import com.example.taskone.ui.theme.TaskOneTheme

@Composable
fun ManhwaItem(
    manhwa: Manhwa,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = manhwa.Photo),
            contentDescription = manhwa.Title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = manhwa.Title, style = MaterialTheme.typography.titleMedium)
            Text(text = "Genre: ${manhwa.Genre}", color = MaterialTheme.colorScheme.primary)
            Text(text = "Status: ${manhwa.Status}")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ManhwaItemPreview() {
    TaskOneTheme {
        ManhwaItem(
            manhwa = Manhwa(
                Title = "The Villainess Reverses the Hourglass",
                Genre = "Fantasy",
                Status = "Completed",
                Photo = R.drawable.hourglass
            )
        )
    }
}
