package com.asm_kotlin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.asm_kotlin.ui.theme.screen.Boarding
import com.asm_kotlin.ui.theme.screen.Cart
import com.asm_kotlin.ui.theme.screen.CheckOut
import com.asm_kotlin.ui.theme.screen.Congrats
import com.asm_kotlin.ui.theme.screen.Home
import com.asm_kotlin.ui.theme.screen.Login
import com.asm_kotlin.ui.theme.screen.ProductDetail
import com.asm_kotlin.ui.theme.screen.SignUp

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Boarding.route,
    ) {
        composable(Screen.Boarding.route) { Boarding(navController) }
        composable(Screen.Login.route) { Login(navController) }
        composable(Screen.SignUp.route) { SignUp(navController) }
        composable(Screen.MyBottombar.route) { MyBottombar(navController) }
        composable(Screen.Home.route) { Home(navController) }
        composable(Screen.ProductDetail.route) { ProductDetail(navController.toString()) }
        composable(Screen.Cart.route) { Cart(navController) }
        composable(Screen.CheckOut.route) { CheckOut(navController) }
        composable(Screen.Congrats.route) { Congrats(navController) }
    }
}