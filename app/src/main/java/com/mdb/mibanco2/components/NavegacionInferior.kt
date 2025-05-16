package com.mdb.mibanco2.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.mdb.mibanco2.models.Items_bottom_nav.*

@Composable
fun NavegacionInferior(
    NavHostController: NavHostController
){
    val menu_items = listOf(
        Item_bottom_nav1,
        Item_bottom_nav2,
        Item_bottom_nav3
    )
    BottomAppBar {
        NavigationBar {
            menu_items.forEach{item->
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(imageVector = item.icon,
                            contentDescription = item.title
                            )
                    }
                )
            }
        }
    }
}