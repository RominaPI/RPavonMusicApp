package com.example.musicapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicapp.ui.theme.Rosa1
import com.example.musicapp.ui.theme.Rosa2
import com.example.musicapp.ui.theme.Rosa3

@Composable
fun  Header(mod: Modifier){
    Box(

    modifier = mod,
        contentAlignment = Alignment.BottomCenter
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
}