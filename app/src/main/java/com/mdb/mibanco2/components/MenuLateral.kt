package com.mdb.mibanco2.components

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.mdb.mibanco2.models.Items_menu_lateral.*
import com.mdb.mibanco2.navigation.currentRoute

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuLateral(
    navController: NavHostController,
    drawerState: DrawerState,
    contenido: @Composable() -> Unit
){
    val menu_items = listOf(
        Item_menu_lateral1,
        Item_menu_lateral2,
        Item_menu_lateral3,
        Item_menu_lateral4
    )
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                menu_items.forEach{item->
                    NavigationDrawerItem(
                        label = { Text(text = item.title) },
                        selected = currentRoute(navController)==item.ruta,
                        onClick = {}
                    )
                }
            }
        }

    ) {
        contenido()
    }
}