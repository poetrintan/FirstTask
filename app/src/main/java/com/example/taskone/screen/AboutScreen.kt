package com.example.taskone.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import com.example.taskone.data.FullData


@Composable
fun AboutScreen() {
    val about = FullData.aboutData.firstOrNull()

    about?.let {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = about.Photo), contentDescription = "Profile Picture", modifier = Modifier.size(120.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Name: ${about.Name}", style = MaterialTheme.typography.headlineSmall)
            Text(text = "Email: ${about.Email}")
            Text(text = "University: ${about.University}")
            Text(text = "Major: ${about.Major}")
        }
    }
}
