package com.example.signincompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.signincompose.R
import com.example.signincompose.components.ButtonComponent
import com.example.signincompose.components.ClickableLoginTextComponent
import com.example.signincompose.components.DividerTextComponent
import com.example.signincompose.components.HeadingTextComponent
import com.example.signincompose.components.MyTextFieldComponent
import com.example.signincompose.components.NormalTextComponent
import com.example.signincompose.components.UnderLinedTextComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController){
    Surface(color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(modifier = Modifier
            .fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.baseline_email_24)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.baseline_password_24)
            )

            Spacer(modifier = Modifier.height(40.dp))

            UnderLinedTextComponent(value = stringResource(id = R.string.forgot_password))

            ButtonComponent(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(40.dp))

            DividerTextComponent()
            Spacer(modifier = Modifier.height(18.dp))
            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                navController.navigate(route = "register")
            })

        }
    }
}

//@Preview
//@Composable
//fun LoginScreenPreview(){
//    LoginScreen()
//}