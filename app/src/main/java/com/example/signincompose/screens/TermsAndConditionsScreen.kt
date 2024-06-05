package com.example.signincompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.signincompose.R
import com.example.signincompose.components.HeadingTextComponent

@Composable
fun TermsAndConditionsScreen(navController: NavController){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)
    ) {
        HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions))
    }
}

//@Preview
//@Composable
//fun TermsAndConditionsScreenPreview(){
//    TermsAndConditionsScreen()
//}