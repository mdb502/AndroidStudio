package com.mdb.mibanco2.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AttachMoney
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.PriceCheck
import androidx.compose.ui.graphics.vector.ImageVector
import com.mdb.mibanco2.navigation.NavScreen

sealed class Items_bottom_nav(
    val icon: ImageVector,
    val title: String,
    val ruta: String
) {
    object Item_bottom_nav1: Items_bottom_nav(
        Icons.Outlined.AttachMoney,
        "Transferencias",
        NavScreen.Transferencias.name
    )
    object Item_bottom_nav2: Items_bottom_nav(
        Icons.Outlined.PriceCheck,
        "Pagar Servicios",
        NavScreen.PagarServicios.name
    )
    object Item_bottom_nav3: Items_bottom_nav(
        Icons.Outlined.CreditCard,
        "Pagar Tarjetas",
        NavScreen.PagarTarjetas.name
    )
}