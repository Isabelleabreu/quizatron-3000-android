package com.aulasandroid.quizatron_3000.quiz

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.aulasandroid.quizatron_3000.R

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF30C6FF)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            contentDescription = "Quiz Icon",
            painter = painterResource(id = R.drawable.quiz),
            alignment = Alignment.Center
        )
    }

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "QUIZATRON 3000",
            fontSize = 24.sp,
            color = Color.Black
        )
    }

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Yellow
        )
    ) {
        Text(
            text = "COMEÇAR",
            color = Color.Black,
            fontSize = 24.sp
        )
    }

}

