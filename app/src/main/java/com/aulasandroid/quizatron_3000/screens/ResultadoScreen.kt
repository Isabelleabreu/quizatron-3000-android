package com.aulasandroid.quizatron_3000.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
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
fun ResultadoScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(150.dp),
                contentAlignment = Alignment.TopCenter
            ){

                Image(
                    modifier = Modifier
                        .height(100.dp)
                        .padding(top = 20.dp),
                    contentDescription = "Quiz Icon",
                    painter = painterResource(id = R.drawable.quiz),
                    alignment = Alignment.TopCenter

                )
            }

        Column(
            modifier = Modifier.fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFF30C6FF)),
            Arrangement.spacedBy(20.dp),
            Alignment.CenterHorizontally

        ) {

                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .height(80.dp)
                        .padding(top = 20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF5FDA86)
                    ),
                    border = BorderStroke(width = 2.dp, color = Color.Black)
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {

                    Text(
                        modifier = Modifier.fillMaxWidth()
                            .offset(y = 15.dp),
                        text = "Bom trabalho!",
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp
                    )
                }
            }


            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                text = "Você acertou 1 de 3 perguntas",
                fontSize = 24.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black,
                textAlign = TextAlign.Center,
            )

        }

        Box(
            modifier = Modifier.fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {

            OutlinedButton (
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
            ) {
                Text(
                    text = "JOGAR NOVAMENTE",
                    color = Color.Black,
                    fontSize = 24.sp
                )


            }
        }
    }
}