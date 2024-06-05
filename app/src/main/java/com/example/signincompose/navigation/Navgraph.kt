package com.example.signincompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.signincompose.screens.LoginScreen
import com.example.signincompose.screens.SignUpScreen
import com.example.signincompose.screens.SplashScreen
import com.example.signincompose.screens.TermsAndConditionsScreen

@Composable
fun Navgraph(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash"){
        composable(route = "splash"){
            SplashScreen(navController)
        }
        composable(route="home"){
            SignUpScreen(navController)
        }
        composable(route="new"){
            TermsAndConditionsScreen(navController)
        }
        composable(route = "login"){
            LoginScreen(navController)
        }
        composable(route = "register"){
            SignUpScreen(navController)
        }
    }
}