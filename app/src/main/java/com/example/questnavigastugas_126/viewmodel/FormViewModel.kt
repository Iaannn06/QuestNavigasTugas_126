package com.example.questnavigastugas_126.viewmodel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel



data class FormUiState(
    val nama: String = "",
    val jenisKelamin: String = "Laki-laki",
    val statusPerkawinan: String = "Lajang",
    val alamat: String = ""
)


class FormViewModel : ViewModel() {

    var uiState by mutableStateOf(FormUiState())
        private set
    fun setNama(nama: String) {
        uiState = uiState.copy(nama = nama)
    }
    fun setJenisKelamin(jenisKelamin: String) {
        uiState = uiState.copy(jenisKelamin = jenisKelamin)
    }
    fun setStatusPerkawinan(status: String) {
        uiState = uiState.copy(statusPerkawinan = status)
    }
    fun setAlamat(alamat: String) {
        uiState = uiState.copy(alamat = alamat)
    }
}