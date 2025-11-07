package com.example.questnavigastugas_126.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.Alignment
import androidx.compose.runtime.R



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
        horinzontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(

        )
    }
}