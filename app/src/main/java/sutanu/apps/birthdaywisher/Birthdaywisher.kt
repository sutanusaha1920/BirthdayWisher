package sutanu.apps.birthdaywisher

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UI() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = Color.LightGray) {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Happy Birthday!",
                    fontSize = 30.sp, fontFamily = FontFamily.Cursive,
                    color = colorResource(id = R.color.purple_500)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text("Sutanu",
                    fontSize = 50.sp, fontFamily = FontFamily.Cursive,
                    color = colorResource(id = R.color.purple_500)
                )
            }
        }
    }
}


@Preview
@Composable
fun BirthdayPreview() {
    UI()
}