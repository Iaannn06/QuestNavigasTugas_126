package com.example.questnavigastugas_126.view

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

val PurpleBg = Color(0xFFF3E5F5)
val PurpleButton = Color(0xFFF3E5F5)

@Composable
fun WelcomeScreen(
    onSubmitClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleBg)
            .padding(dimensionResource(R.dimen.padding_medium))
    )
}