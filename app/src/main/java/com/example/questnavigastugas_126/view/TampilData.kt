package com.example.questnavigastugas_126.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_126.R
import com.example.questnavigastugas_126.viewmodel.FormViewModel

val PurpleBgLight = Color(0xFFF3E5F5)
val PurpleButtonDark = Color(0xFF8E24AA)
val PurpleHeader = Color(0xFFAB47BC)
val PurpleCard = Color(0xFFE1BEE7)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    viewModel: FormViewModel,
    onBerandaClick: () -> Unit,
    onFormulirClick: () -> Unit
) {
    val uiState = viewModel.uiState

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.detail_title),
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = PurpleHeader,
                    titleContentColor = Color.White
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(PurpleBgLight)
                .padding(paddingValues)
                .padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Bagian atas: List data
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                DataDisplayItem(
                    label = stringResource(R.string.detail_label_nama),
                    value = uiState.nama
                )
                DataDisplayItem(
                    label = stringResource(R.string.detail_label_gender),
                    value = uiState.jenisKelamin
                )
                DataDisplayItem(
                    label = stringResource(R.string.detail_label_status),
                    value = uiState.statusPerkawinan
                )
                DataDisplayItem(
                    label = stringResource(R.string.detail_label_alamat),
                    value = uiState.alamat
                )
            }

            // Bagian bawah: Tombol
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Button(
                    onClick = onBerandaClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(dimensionResource(R.dimen.button_height)),
                    shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner_radius)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = PurpleButtonDark
                    )
                ) {
                    Text(
                        text = stringResource(R.string.button_beranda),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
                Button(
                    onClick = onFormulirClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(dimensionResource(R.dimen.button_height)),
                    shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner_radius)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = PurpleButtonDark
                    )
                ) {
                    Text(
                        text = stringResource(R.string.button_formulir),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
fun DataDisplayItem(label: String, value: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner_radius)),
        colors = CardDefaults.cardColors(containerColor = PurpleCard)
    ) {
        Column(
            modifier = Modifier.padding(
                horizontal = dimensionResource(R.dimen.padding_medium),
                vertical = 12.dp
            )
        ) {
            Text(
                text = label,
                fontSize = 12.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = value.ifEmpty { stringResource(R.string.detail_empty_value) },
                fontSize = 16.sp,
                color = Color.Black
            )
        }
    }
}

