package com.mdb.mibanco2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.mdb.mibanco2.components.NavegacionInferior
import com.mdb.mibanco2.navigation.BancoNavigation
import com.mdb.mibanco2.screens.HomeScreen
import com.mdb.mibanco2.screens.SplashScreen
import com.mdb.mibanco2.ui.theme.MiBanco2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiBanco2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color= MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            NavegacionInferior(navController)
        }
    ){padding->
        Box(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ){
            BancoNavigation(navController = navController)
        }
    }
}
