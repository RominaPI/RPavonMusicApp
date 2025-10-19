package com.example.musicapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.musicapp.models.Album
import com.example.musicapp.ui.theme.Rosa1
import com.example.musicapp.ui.theme.Rosa2
import com.example.musicapp.ui.theme.Rosa3
import com.example.musicapp.ui.theme.RosaClaro
import com.example.musicapp.ui.theme.amarillo

@Composable
fun AlbumCard(album: Album, onClick: () -> Unit) {
    // Implementation will go here
    Box(
        modifier = Modifier
            .padding(20.dp)
            .width(190.dp)
            .height(180.dp)

            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Rosa1.copy(alpha = 0.1f),

                        Rosa2.copy(alpha = 0.3f),


                        Rosa3.copy(alpha = 0.6f)
                    )
                ),
                shape = RoundedCornerShape(24.dp)
            )
            .clickable(enabled = true, onClick = onClick)
    ) {
        AsyncImage(
            model= album.image,
            contentDescription = album.title,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Rosa1.copy(alpha = 0.1f),
                            Rosa2.copy(alpha = 0.3f),
                            Rosa3.copy(alpha = 0.6f)
                        )
                    ),
                    shape = RoundedCornerShape(24.dp)
                ),
            contentScale = ContentScale.Crop
        )

                Row(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(12.dp)
                        .width(190.dp)
                        .height(80.dp)


                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    RosaClaro.copy(alpha = 0.2f),

                                    Rosa2.copy(alpha = 0.3f),


                                    Rosa3.copy(alpha = 0.6f)
                                )
                            ),
                            shape = RoundedCornerShape(24.dp)
                        )
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = album.title,
                            color = amarillo.copy(alpha = 0.9f),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 12.dp, top = 12.dp)

                        )
                        Text(
                            text = album.artist,
                            color = amarillo.copy(alpha = 0.9f),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.W200,
                            modifier = Modifier
                                .padding(top = 6.dp, start = 12.dp)

                        )
                    }
                    Box(
                        modifier = Modifier
                            .padding(top= 29.dp, end= 9.dp
                            )
                            .size(33.dp) // tamaño del círculo

                            .background(color = Color(0xFFEAE7E3), shape = CircleShape) // color del círculo
                            .align(Alignment.CenterVertically), // centra el box en el Row
                        contentAlignment = Alignment.Center // centra el icon dentro del box
                    ) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow, // ícono de play
                            contentDescription = "play",
                            tint = Rosa2.copy(alpha=0.7f) // color del play
                        )
                    }


                }



        }
}