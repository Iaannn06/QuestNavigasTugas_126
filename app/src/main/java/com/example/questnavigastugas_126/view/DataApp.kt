package com.example.questnavigastugas_126.view

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_126.viewmodel.FormViewModel

enum class Navigasi {
    SelamatDatang,
    Formulir,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    // ViewModel di-inisialisasi di sini biar "shared"
    val viewModel: FormViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Navigasi.SelamatDatang.name
    ) {
        // Screen 1: Selamat Datang
        composable(route = Navigasi.SelamatDatang.name) {
            WelcomeScreen(
                onSubmitClick = {
                    navController.navigate(Navigasi.Formulir.name)
                }
            )
        }

        // Screen 2: Formulir Isian
        composable(route = Navigasi.Formulir.name) {
            FormIsian(
                viewModel = viewModel, // Kasih ViewModel
                OnSubmitBtnClick = {
                    navController.navigate(Navigasi.Detail.name)
                }
            )
        }

        // Screen 3: Tampil Data
        composable(route = Navigasi.Detail.name) {
            TampilData(
                viewModel = viewModel, // Kasih ViewModel
                onBerandaClick = {
                    // Balik ke Beranda (clear stack)
                    navController.popBackStack(Navigasi.SelamatDatang.name, inclusive = false)
                },
                onFormulirClick = {
                    // Balik ke Formulir (cuma 1x pop)
                    navController.popBackStack()
                }
            )
        }
    }
}


