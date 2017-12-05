package kotlinspinner.ettle.com.kotlintoastexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_click_me = findViewById<Button>(R.id.btn_click_me)
        btn_click_me.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "This is the sample App ", Toast.LENGTH_LONG).show()
        }
    }
}
