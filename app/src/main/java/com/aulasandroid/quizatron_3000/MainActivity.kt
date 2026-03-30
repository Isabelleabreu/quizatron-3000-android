package com.aulasandroid.quizatron_3000

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aulasandroid.quizatron_3000.screens.PerguntasScreen
import com.aulasandroid.quizatron_3000.screens.QuizScreen
import com.aulasandroid.quizatron_3000.screens.ResultadoScreen
import com.aulasandroid.quizatron_3000.ui.theme.Quizatron3000Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Quizatron3000Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost(
                      navController = navController,
                       startDestination = "start"
                    ){
                        composable (route = "start") { QuizScreen(navController = navController) }

                        composable (route = "perguntas") { PerguntasScreen(navController = navController) }

                        composable (route = "resultado") {ResultadoScreen()}
                    }
                }
            }
        }
    }
}

