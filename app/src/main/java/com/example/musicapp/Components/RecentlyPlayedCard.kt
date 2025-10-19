package com.example.musicapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.musicapp.models.Album
import com.example.musicapp.ui.theme.Rosa2
import com.example.musicapp.ui.theme.RosaClaro
import com.example.musicapp.ui.theme.amarillo

@Composable
fun RecentlyPlayedCard(album: Album) {
    // Implementation will go here
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .padding(18.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(

                        RosaClaro.copy(alpha = 0.8f),

                        amarillo.copy(alpha = 0.4f),


                        Rosa2.copy(alpha = 0.35f)
                    )
                ),
                shape = RoundedCornerShape(24.dp)
            )
    ) {
        Row(


        ) {
            AsyncImage(
                model = album.image,
                contentDescription = album.title,
                modifier = Modifier
                    .fillMaxHeight()
                    .width(105.dp)
                    .padding(16.dp)
                    .clip(RoundedCornerShape(17.dp))
                    .background(Color.White),
                contentScale = ContentScale.Crop


            )


            Column(
                modifier = Modifier
                    .padding(top = 16.dp, start = 4.dp)
                    .weight(1f)
            )
            {
                Text(
                    text = album.title,
                    color = Rosa2.copy(alpha = 0.9f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,

                    )
                Text(
                    text = "${album.artist} · popular song",
                    color = Rosa2.copy(alpha = 0.9f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W200,


                    )
            }
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "play",
                tint = Rosa2.copy(alpha = 0.7f),

                modifier = Modifier
                    .padding(top = 31.dp, end = 16.dp)

            )
        }
    }
}