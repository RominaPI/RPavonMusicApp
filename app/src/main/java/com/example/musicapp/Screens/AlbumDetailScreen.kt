package com.example.musicapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.example.musicapp.Components.RecentlyPlayedCard
import com.example.musicapp.ui.theme.PauseCircle
import com.example.musicapp.ui.theme.PlayCircle
import com.example.musicapp.ui.theme.Rosa1
import com.example.musicapp.ui.theme.Rosa2
import com.example.musicapp.ui.theme.Rosa3
import com.example.musicapp.ui.theme.RosaClaro
import com.example.musicapp.ui.theme.Rosota
import com.example.musicapp.ui.theme.amarillo
import com.example.musicapp.ui.theme.naranja
import com.example.musicapp.ui.theme.orange
import com.example.musicapp.ui.theme.routes.HomeScreenRoute
import com.example.musicapp.viewmodel.AlbumDetailViewModel
import com.example.musicapp.viewmodel.SharedViewModel

@Composable
fun AlbumDetailScreen(
    nav: NavController,
    id: String,
    padding: PaddingValues,
    sharedViewModel: SharedViewModel
) {

    // Implementation for displaying album details goes here
    val vm: AlbumDetailViewModel = viewModel()
    LaunchedEffect(true) { vm.loadAlbum(id) }
    LaunchedEffect(id) { sharedViewModel.selectAlbum(id) }
    if (vm.loading) {
        Box(
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

                ), contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()

        }
    } else {
        Box(
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
                        )
                    )
                ), contentAlignment = Alignment.BottomEnd
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(

                    )
            ) {
                item {
                    Box(
                        modifier = Modifier
                            .padding(top = 11.dp, start = 9.dp, end = 9.dp, bottom = 16.dp)
                            .fillMaxWidth()
                            .height(310.dp)
                            .clip(RoundedCornerShape(24.dp))
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
                        AsyncImage(
                            model = vm.album?.image,
                            contentDescription = vm.album?.title,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(24.dp))
                                .background(Color.Transparent),
                            contentScale = ContentScale.Crop
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    Icons.AutoMirrored.Filled.ArrowBack,
                                    "Back",
                                    tint = naranja,
                                    modifier = Modifier
                                        .size(30.dp)
                                        .clip(CircleShape)
                                        .border(width = 0.5.dp, naranja, shape = CircleShape)
                                        .background(Color.Transparent.copy(alpha = 0.25f))
                                        .padding(5.dp)
                                        .clickable(enabled = true, onClick = { nav.navigate(
                                            HomeScreenRoute) })
                                )
                                Spacer(Modifier.weight(1f))
                                Icon(
                                    Icons.Default.FavoriteBorder,
                                    "Favorite",
                                    tint = naranja,
                                    modifier = Modifier
                                        .size(30.dp)
                                        .clip(CircleShape)
                                        .border(width = 0.5.dp, naranja, shape = CircleShape)
                                        .background(Color.Transparent.copy(alpha = 0.25f))
                                        .padding(5.dp)
                                )


                            }


                            Column(
                                modifier = Modifier
                                    .height(100.dp)
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(Color.Transparent.copy(0.2f))
                                    .padding(5.dp)
                            ) {
                                Text(
                                    text = vm.album?.title ?: "No selected album",

                                    fontSize = 18.sp,
                                    modifier = Modifier.padding(horizontal = 5.dp),
                                    color = naranja
                                )
                                Text(
                                    text = vm.album?.artist ?: "No selected artist",

                                    fontSize = 10.sp,
                                    modifier = Modifier.padding(horizontal = 5.dp),
                                    color = naranja.copy(alpha = 0.7f)

                                )
                                Row(
                                    Modifier
                                        .padding(top = 10.dp)
                                ) {
                                    PlayCircle(Modifier.size(40.dp), tint = naranja)
                                    PauseCircle(Modifier.size(40.dp), tint = naranja)
                                }


                            }


                        }
                    }
                }
                item{
                    Column(Modifier
                        .padding(horizontal = 10.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .border(
                            width = 1.2.dp,
                            brush = Brush.horizontalGradient(listOf(Rosa2, Rosa3)),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .background(Color.Transparent.copy(0.2f))
                        .padding(10.dp)
                    ) {
                        Text(
                            text = "About Album",
                            color = Rosa2,
                        )
                        Text(
                            text = vm.album?.description ?: "No description",
                            color = naranja,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }
                }
                item{
                    Row(Modifier
                        .padding(start = 10.dp, top = 5.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .border(
                            width = 1.2.dp,
                            brush = Brush.horizontalGradient(listOf(Rosa2, Rosa3)),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .background(Color.Transparent.copy(0.2f))
                        .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text= "Artist : ",
                            fontWeight = FontWeight.Bold,
                            color = Rosa2)
                        Text(
                            text = vm.album?.artist ?: "No artist",
                            color = naranja,
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                }
               items(count=10){
                   i ->
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
                               model = vm.album?.image,
                               contentDescription = vm.album?.title,
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
                                   text = "${ vm.album?.title }  Track ${i+1}",
                                   color = Rosa2.copy(alpha = 0.9f),
                                   fontSize = 16.sp,
                                   fontWeight = FontWeight.Bold,

                                   )
                               Text(
                                   text = "${vm.album?.artist} ",
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

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(12.dp)

                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Rosa1.copy(alpha = 0.4f),
                                Rosa2.copy(alpha = 0.6f),
                                Rosa3.copy(alpha = 0.8f)
                            ),
                            startY = 100f
                        ),
                        shape = RoundedCornerShape(25.dp)
                    )

            ){

                AsyncImage(
                    model= vm.album?.image ?: " ",
                    contentDescription = vm.album?.title,
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
                        text = vm.album?.title ?: "",
                        color = Rosa2.copy(alpha = 0.9f),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,

                        )
                    Text(
                        text = "${vm.album?.artist} ",
                        color = Rosa2.copy(alpha = 0.9f),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W200,


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