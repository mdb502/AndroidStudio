package com.mdb.mibanco2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mdb.mibanco2.screens.HomeScreen
import com.mdb.mibanco2.screens.PagarServicios
import com.mdb.mibanco2.screens.PagarTarjetas
import com.mdb.mibanco2.screens.Transferencias

@Composable
fun BancoNavigation(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = NavScreen.HomeScreen.name
        ) {
        composable(NavScreen.HomeScreen.name){
            HomeScreen()
        }
        composable(NavScreen.Transferencias.name) {
            Transferencias()
        }
        composable(NavScreen.PagarServicios.name) {
            PagarServicios()
        }
        composable(NavScreen.PagarTarjetas.name) {
            PagarTarjetas()
        }
    }
}