package com.example.navigation_with_arguments_in_jetpack_compose

import android.widget.TextView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Dashboard( emailValue : String? , passwordValue : String?  ,naveController: NavController) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.teal_200)),



    ){

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(start = 30.dp, end = 30.dp , top = 200.dp)

            ) {

            Text(text = "Your Details  ",
                fontSize = 40.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 30.dp, top = 60.dp , start = 10.dp)
            )
            Spacer(modifier = Modifier.height(40.dp))

            Text(text = "Your email is : "  , fontSize = 32.sp)

            Text(text = "$emailValue")
            Text(text = "Your password  is : "  , fontSize = 32.sp)
            Text(text = "$passwordValue")

        }
    }
    



}
//
//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun DashboardPreview() {
//    Dashboard(emailValue = "romitpal4@gmial.com", passwordValue = "Ujdjdjdj@13338")
//
//}