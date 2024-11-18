package ru.faimizufarov.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.faimizufarov.common.Colors

@Composable
fun OnboardingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Colors.black)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp)
                .padding(horizontal = dimensionResource(ru.faimizufarov.common.R.dimen.large)),
            text = stringResource(R.string.onboarding_text),
            textAlign = TextAlign.Center,
            fontSize = 28.sp,
            color = Colors.white
        )

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
            painter = painterResource(R.drawable.courses),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(ru.faimizufarov.common.R.dimen.medium))
                .padding(bottom = dimensionResource(ru.faimizufarov.common.R.dimen.large)),
            onClick = {
                TODO("open sing up screen")
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Colors.green,
                contentColor = Colors.white
            )
        ) {
            Text(
                text = stringResource(ru.faimizufarov.common.R.string.continue_text)
            )
        }
    }
}

@Preview
@Composable
fun OnboardingScreenPreview() {
    OnboardingScreen()
}