package com.example.questnavigastugas_126.view


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_126.R




private val PurpleBg = Color(0xFFF3E5F5)
private val PurpleButton = Color(0xFF8E24AA)

@Composable
fun WelcomeScreen(
    onSubmitClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleButton)
            .padding(dimensionResource(R.dimen.padding_medium)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = stringResource(R.string.welcome_title),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleButton

        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacer_large)))

        Image (
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Logo",
            modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
        )

        Text(
            text = stringResource(R.string.welcome_logo_name),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleButton
        )

        Text(
            text = stringResource(R.string.welcome_logo_subtitle),
            fontSize = 14.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacer_xlarge)))

        Text(
            text = stringResource(R.string.welcome_user_name),
            fontSize = 18.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Text(
            text = stringResource(R.string.welcome_user_id),
            fontSize = 16.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = onSubmitClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(dimensionResource(R.dimen.button_height)),
            shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner_radius)),
            colors = ButtonDefaults.buttonColors(containerColor = PurpleButton)
        ) {
            Text(
                text = stringResource(R.string.button_submit),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }


    }
}