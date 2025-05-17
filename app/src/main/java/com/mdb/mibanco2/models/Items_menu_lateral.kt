package com.mdb.mibanco2.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AttachMoney
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.PriceCheck
import androidx.compose.material.icons.outlined.RealEstateAgent
import androidx.compose.ui.graphics.vector.ImageVector
import com.mdb.mibanco2.navigation.NavScreen

sealed class Items_menu_lateral(
    val icon: ImageVector,
    val title: String,
    val ruta: String
){
    object Item_menu_lateral1: Items_menu_lateral(
        Icons.Outlined.RealEstateAgent,
        "Consulta de saldos",
        NavScreen.HomeScreen.name
    )object Item_menu_lateral2: Items_menu_lateral(
        Icons.Outlined.CreditCard,
        "Pagar Tarjetas",
        NavScreen.PagarTarjetas.name
    )object Item_menu_lateral3: Items_menu_lateral(
        Icons.Outlined.PriceCheck,
        "Pagar servicios",
        NavScreen.PagarServicios.name
    )object Item_menu_lateral4: Items_menu_lateral(
        Icons.Outlined.AttachMoney,
        "Transferencias",
        NavScreen.Transferencias.name
    )
}