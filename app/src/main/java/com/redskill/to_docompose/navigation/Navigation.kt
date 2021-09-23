package com.redskill.to_docompose.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.redskill.to_docompose.navigation.destination.listComposable
import com.redskill.to_docompose.navigation.destination.taskComposable
import com.redskill.to_docompose.ui.viewmodel.SharedViewModel
import com.redskill.to_docompose.utils.Constants.LIST_SCREEN

@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navHostController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navHostController) {
        Screens(navHostController = navHostController)
    }

    NavHost(
        navController = navHostController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(navigateToTaskScreen = screen.task, sharedViewModel = sharedViewModel)
        taskComposable(navigateToListScreen = screen.list)
    }
}