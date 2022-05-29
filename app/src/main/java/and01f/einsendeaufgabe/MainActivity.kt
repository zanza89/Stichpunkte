package and01f.einsendeaufgabe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onButtonTakeClick(view: View?) {
        val textviewInput: TextView = findViewById(R.id.textview_input)
        val textviewOutput: TextView = findViewById(R.id.textview_output)
        textviewOutput.append("${textviewInput.text}" + "\n")
        textviewInput.text = ""
    }

}