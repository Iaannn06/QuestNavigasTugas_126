package com.example.questnavigastugas_126.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    viewModel: FormViewModel,
    onSubmitBtnClick: () -> Unit
){
    val jenisKelaminOptions = listOf(
        stringResource(R.string.gender_male),
        stringResource(R.string.gender_female)
    )
    val statusPerkawinanOptions = listOf(
        stringResource(R.string.status_widow),
        stringResource(R.string.status_single),
        stringResource(R.string.status_widower)
    )

    val uiState = viewModel.uiState

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.form_title),
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = PurpleHeader,
                    titleContentColor = Color.White
                )
            )
        }
    ) {

    }
}
