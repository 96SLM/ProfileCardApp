package com.example.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.profilecard.ui.theme.ProfileCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardTheme {
//                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
//                    /*Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )*/
//                }
            }
        }
    }
}
//Pick up form "Run your first app on the Android Emulator"
/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/

@Composable
fun ProfileCardApp(){}

@Composable
fun ProfileBio(image: Painter, name: String, bio: String){
    Column{
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = name
        )
        Text(
            text = bio
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ProfileCardTheme {
        ProfileCardApp()
        ProfileBio(
            image = painterResource(id = R.drawable.rudolph_icon),
            name = "Rudolph",
            bio = "Has a red nose."
        )
    }
}