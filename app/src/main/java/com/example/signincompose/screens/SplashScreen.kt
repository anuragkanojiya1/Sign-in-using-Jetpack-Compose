package com.example.signincompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.signincompose.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    init {
        viewModelScope.launch {
            delay(3000)  // Simulate loading
            _isLoading.value = false
        }
    }
}

@Composable
fun SplashScreen(navController: NavController, mainViewModel: MainViewModel = viewModel()) {
    val isLoading by mainViewModel.isLoading.collectAsState()

    LaunchedEffect(key1 = isLoading) {
        if (!isLoading) {
            navController.navigate("home") {
                popUpTo("splash") { inclusive = true }
            }
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Cyan
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.qutubminar),
                contentDescription = "Movie Galaxy",
                modifier = Modifier.size(128.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Loading...",
                fontSize = 20.sp,
                color = Color.Magenta
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun SplashScreenPreview() {
//    val navController = rememberNavController()
//    SplashScreen(navController)
//}
