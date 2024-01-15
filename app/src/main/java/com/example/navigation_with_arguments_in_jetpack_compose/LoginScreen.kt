package com.example.navigation_with_arguments_in_jetpack_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigation_with_arguments_in_jetpack_compose.ui.theme.Navigation_with_arguments_in_jetpack_composeTheme

@Composable
fun LoginScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_200)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var emailValue by rememberSaveable {
            mutableStateOf("")
        }

        var passwordValue by rememberSaveable {
            mutableStateOf("")
        }

        //title HomeScreen

        Text(text = "Login screen", fontSize = 48.sp)


        TextField(value = emailValue, onValueChange = { emailValue = it },
            modifier = Modifier.padding(20.dp),
            placeholder = {
                Text(text = "Please enter your email here.")
            })



        TextField(value = passwordValue, onValueChange = { passwordValue = it },

            placeholder = {
                Text(text = "Enter your password here ")
            }
        )

        OutlinedButton(onClick = {

            navController.navigate("Dashboard/$emailValue/$passwordValue")

        },
            modifier = Modifier.padding(top = 30.dp)) {


            Text(text = "Send me to the dashboard screen")

        }


    }
}

//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LoginScreenPreview() {
//
//    Navigation_with_arguments_in_jetpack_composeTheme {
//        LoginScreen()
//    }
//}