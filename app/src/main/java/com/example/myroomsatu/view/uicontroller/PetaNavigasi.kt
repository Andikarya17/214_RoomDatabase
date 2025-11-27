package com.example.myroomsatu.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myroomsatu.view.route.DestinasiEntry
import com.example.myroomsatu.view.route.DestinasiHome
import com.example.myroomsatu.view.uicontroller.EntrySiswaScreen
import com.example.myroomsatu.view.uicontroller.HomeScreen


@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(
        navController = navController,
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(route = DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                }
            )
        }

        composable(route = DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}

