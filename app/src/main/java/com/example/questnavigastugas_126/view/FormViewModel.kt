package com.example.questnavigastugas_126.view

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

data class FormUiState(
    data class FormUiState(
        val nama: String = "",
        val jenisKelamin: String = "Laki-Laki",
        val statusPerkawinan: String = "Lajang",
        val alamat: String = ""
    )

    class FormViewModel : ViewModel() {
        val uiState by mutableStateOf(FormUiState())
            private set

        fun SetNama(nama: String) {
            uiState = uiState.copy(nama = nama)
        }


    }
)