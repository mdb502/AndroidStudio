package com.mdb.mibanco2.models

sealed class Items_principal (
    var image: Int?,
    var title: String,
    var details: String
){
    object Item_principal1: Items_principal(
        image = null,
        title = "Cuentas",
        details = "Detalle cuenta 1"
    )
    object Item_principal2: Items_principal(
        image = null,
        title = "Tarjetas de crédito",
        details = "Detalle tarjeta 1"
    )
    object Item_principal3: Items_principal(
        image = null,
        title = "Recompensas",
        details = "Detalle recompensas 1"
    )
    object Item_principal4: Items_principal(
        image = null,
        title = "Inversiones",
        details = "Detalle inversión 1"
    )
    object Item_principal5: Items_principal(
        image = null,
        title = "Créditos",
        details = "Detalle créditos 1"
    )
}