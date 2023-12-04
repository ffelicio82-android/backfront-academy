package br.com.fernando.giftapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val textView : TextView = findViewById(R.id.textView)

        val giftList : Array<String> = GiftBox.getGifts()
        giftList.forEach { gift ->
            val text : String = if (gift == "Presente 20") gift else "$gift\n\n\n"
            textView.append(text)
        }
    }
}