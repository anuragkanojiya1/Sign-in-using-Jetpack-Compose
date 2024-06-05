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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.signincompose.R
import com.example.signincompose.components.ButtonComponent
import com.example.signincompose.components.CheckboxComponent
import com.example.signincompose.components.ClickableLoginTextComponent
import com.example.signincompose.components.DividerTextComponent
import com.example.signincompose.components.HeadingTextComponent
import com.example.signincompose.components.MyTextFieldComponent
import com.example.signincompose.components.NormalTextComponent
import com.example.signincompose.components.PasswordTextFieldComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController){
    Surface(color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
        ) {
        Column(modifier = Modifier.fillMaxSize()) {

            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.welcome),
                painterResource(id = R.drawable.baseline_person_outline_24)
                )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.baseline_drive_file_rename_outline_24)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.baseline_email_24)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.baseline_password_24)
            )
            Spacer(modifier = Modifier.height(20.dp))
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    navController.navigate(route = "new")

                })
            Spacer(modifier = Modifier.height(30.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()
            Spacer(modifier = Modifier.height(18.dp))
            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                navController.navigate(route = "login")
            })

            }
        }
    }

//@Preview
//@Composable
//fun DefaultPreviewOfSignUpScreen()
//{
//    SignUpScreen()
//}