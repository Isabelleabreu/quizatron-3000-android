package com.aulasandroid.quizatron_3000.quiz

import android.R.attr.contentDescription
import android.R.attr.fontWeight
import android.R.attr.onClick
import android.R.attr.text
import android.R.attr.top
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.quizatron_3000.R

@Composable
fun QuizScreen(modifier: Modifier = Modifier) {
        Column(
            modifier = Modifier.fillMaxSize()
                .background(Color(0xFF30C6FF))
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                Arrangement.spacedBy(20.dp),
                Alignment.CenterHorizontally

            ) {
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .height(250.dp),
                    contentAlignment = Alignment.Center
                ){

                    Image(
                        modifier = Modifier
                            .height(150.dp)
                            .padding(top = 20.dp),
                        contentDescription = "Quiz Icon",
                        painter = painterResource(id = R.drawable.quiz),
                        alignment = Alignment.Center

                    )
                }

                Text(
                    modifier = Modifier,
                    text = "QUIZATRON 3000",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                )

            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(150.dp),
                contentAlignment = Alignment.Center
            ) {

                Button(
                    modifier = Modifier
                        .width(300.dp)
                        .height(60.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
                ) {
                    Text(
                        text = "COMEÇAR",
                        color = Color.Black,
                        fontSize = 24.sp
                    )


                }
            }

            }
        }











