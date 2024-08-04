package com.example.testingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testingcompose.ui.theme.TestingComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            SayName("Moeez")

            Column() {
                ListViewItem(
                    imgId = R.drawable.ic_launcher_foreground,
                    name = "Moeez",
                    occupation = "Software Engineer"
                )
                ListViewItem(
                    imgId = R.drawable.ic_launcher_foreground,
                    name = "AAA",
                    occupation = "Software Engineer"
                )
                ListViewItem(
                    imgId = R.drawable.ic_launcher_foreground,
                    name = "BBB",
                    occupation = "Software Engineer"
                )
                ListViewItem(
                    imgId = R.drawable.ic_launcher_foreground,
                    name = "CCC",
                    occupation = "Software Engineer"
                )

            }
        }
    }
}


@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun PreviewFunction() {
    Column() {
        SayName("Moeez")

        ListViewItem(
            imgId = R.drawable.ic_launcher_foreground,
            name = "Moeez",
            occupation = "Software Engineer"
        )
        ListViewItem(
            imgId = R.drawable.ic_launcher_foreground,
            name = "AAA",
            occupation = "Software Engineer"
        )
        ListViewItem(
            imgId = R.drawable.ic_launcher_foreground,
            name = "BBB",
            occupation = "Software Engineer"
        )
        ListViewItem(
            imgId = R.drawable.ic_launcher_foreground,
            name = "CCC",
            occupation = "Software Engineer"
        )

    }
}

@Composable
fun SayName(name: String = "Moeez") {
    Text(text = "Hello $name",
        modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 8.dp) )// Add padding to the start and end

}

@Composable
fun ListViewItem(imgId: Int, name: String, occupation: String) {
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId), contentDescription = "", Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.width(8.dp)) // Add space here

        Column() {
            Text(
                text = name, fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation, fontWeight = FontWeight.Thin, fontSize = 12.sp
            )

        }

    }
}
