package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class recuperar_contra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_contra)

        val checar: Button = findViewById(R.id.btnChecar)

        checar.setOnClickListener {
            var intent: Intent = Intent (this, contra::class.java)
            startActivity(intent)
        }
    }
}