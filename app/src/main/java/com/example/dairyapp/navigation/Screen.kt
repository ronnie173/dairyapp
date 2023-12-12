package com.example.dairyapp.navigation

sealed class Screen(val route:String){
    object Authentication:Screen(route = "authentication_screen")
    object Home:Screen("home_screen")
    object Write:Screen("write_screen")

}