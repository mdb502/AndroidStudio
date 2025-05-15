package com.mdb.mibanco2.screens

import android.graphics.pdf.models.ListItem
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mdb.mibanco2.models.Items_principal
import com.mdb.mibanco2.models.Items_principal.*
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(){
    val lista_items_principal = listOf(
        Item_principal1,
        Item_principal2,
        Item_principal3,
        Item_principal4,
        Item_principal5
    )
    LazyColumn(
        contentPadding = PaddingValues(16.dp)
    ){
        items(lista_items_principal){item->
            ListItemRow(item)
            Divider()
        }
    }
}

@Composable
fun ListItemRow(item: Items_principal){
    var masInfo = remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .animateContentSize(
                animationSpec = tween(150,0, LinearEasing)
            )
            .padding(vertical = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = item.title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .weight(1f)
            )
            IconButton(onClick = {masInfo.value = !masInfo.value} ) {
                Icon(
                    if(masInfo.value) Icons.Default.Remove else Icons.Default.Add,
                    contentDescription = "Más información"
                )
            }
        }
        if(masInfo.value)
            Row {
                Text(text = item.details)
            }
    }


}