package auth.login.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import auth.login.presentation.ui.components.LoginBodyComponent
import core.presentation.components.CustomImage
import core.presentation.components.CustomText
import kmmapp.composeapp.generated.resources.Res
import kmmapp.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LoginContent(
    navigateToRegister: () -> Unit,
    navigateToHome: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.horizontalGradient(
                    listOf(
                        MaterialTheme.colorScheme.surface,
                        MaterialTheme.colorScheme.surfaceVariant
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomImage(
                modifier = Modifier.size(200.dp),
                painter = painterResource(Res.drawable.compose_multiplatform)
            )

            LoginBodyComponent()

            ElevatedButton(
                onClick = {
                    navigateToHome()
                }
            ) {
                CustomText(text = "Home")
            }
            ElevatedButton(
                onClick = {
                    navigateToRegister()
                }
            ) {
                CustomText(text = "Register")
            }
        }
    }
}
