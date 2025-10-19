package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.musicapp.Screens.AlbumDetailScreen
import com.example.musicapp.Screens.HomeScreen
import com.example.musicapp.ui.theme.MusicAppTheme
import com.example.musicapp.ui.theme.routes.AlbumDetailScreenRoute
import com.example.musicapp.ui.theme.routes.HomeScreenRoute
import com.example.musicapp.viewmodel.SharedViewModel

class MainActivity : ComponentActivity() {
    val sharedViewMode = SharedViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicAppTheme {
                val nav = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = nav,
                        startDestination = HomeScreenRoute
                    ) {
                        composable<HomeScreenRoute> {
                            HomeScreen(
                                nav,
                                PaddingValues(30.dp),
                                sharedViewMode
                            )
                        }

                        composable<AlbumDetailScreenRoute> { backStack ->
                            val args = backStack.toRoute<AlbumDetailScreenRoute>()
                            AlbumDetailScreen(
                                nav,
                                args.id,
                                PaddingValues(30.dp),
                                sharedViewMode
                            )
                        }
                    }
                }
            }
        }
    }
}

