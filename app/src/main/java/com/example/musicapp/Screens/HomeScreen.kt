package com.example.musicapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicapp.ui.theme.Rosa1
import com.example.musicapp.ui.theme.Rosa2
import com.example.musicapp.ui.theme.Rosa3
import com.example.musicapp.ui.theme.Rosa4
import com.example.musicapp.ui.theme.Rosa5
import com.example.musicapp.ui.theme.RosaClaro

import com.example.musicapp.ui.theme.Rosota
import com.example.musicapp.ui.theme.amarillo

import com.example.musicapp.ui.theme.naranja
import com.example.musicapp.ui.theme.orange



@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        orange.copy(alpha = 0.6f),
                        orange.copy(alpha = 0.3f),
                        RosaClaro.copy(alpha = 0.7f),
                        Rosota.copy(alpha = 0.5f),
                        naranja.copy(alpha = 0.8f),
                    ),
                    center = Offset(x = 25f, y = 1680f),
                    radius = 1150f
                )
            )
    ) {
        // Encabezado

        // Contenedor centrado

        // Box decorativa centrada
        Box(

            modifier = Modifier
                .padding(top = 50.dp)
                .width(350.dp)
                .height(160.dp)
                .align(Alignment.CenterHorizontally)

                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Rosa1.copy(alpha = 0.2f),

                            Rosa2.copy(alpha = 0.4f),


                            Rosa3.copy(alpha = 0.9f)
                        )
                    ),
                    shape = RoundedCornerShape(24.dp)
                )
        ) {
            Column() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menú",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))



                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "bell",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }

                Text(
                    text = "Good Morning",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.W300,
                    modifier = Modifier
                        .padding(start = 11.dp)
                )
                Text(
                    text = "Romina Pavón",
                    color = Color.White,
                    fontSize = 29.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(11.dp)
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Albums",
                color = Rosa5,
                fontSize = 29.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 18.dp, top = 10.dp)

            )
            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "See more",
                color = Rosa4,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 11.dp, end = 20.dp)

            )
        }
        LazyRow() {
            item {
                Box(
                    modifier = Modifier
                        .padding(20.dp)
                        .width(190.dp)
                        .height(180.dp)
                        .align(Alignment.CenterHorizontally)

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
                ) {
                    Box(
                        modifier = Modifier

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
                    ) {
                        Box(
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
                            Row(

                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = "Tales of Ithiria",
                                        color = amarillo.copy(alpha = 0.9f),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(start = 12.dp, top = 12.dp)

                                    )
                                    Text(
                                        text = "Haggard",
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

                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Recently Played",
                color = Rosa5,
                fontSize = 29.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 18.dp, top = 3.dp)

            )
            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "See more",
                color = Rosa4,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 11.dp, end = 20.dp)

            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                , contentAlignment = Alignment.BottomEnd
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()


            ) {
                item {
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
                        Row(){
                            Box(

                            ){

                            }
                        }



                    }
                }

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(12.dp)

                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Rosa1.copy(alpha = 0.2f),

                                Rosa2.copy(alpha = 0.3f),


                                Rosa3.copy(alpha = 0.8f)
                            ),
                            startY = 100f
                        ),
                        shape = RoundedCornerShape(25.dp)
                    )

            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

