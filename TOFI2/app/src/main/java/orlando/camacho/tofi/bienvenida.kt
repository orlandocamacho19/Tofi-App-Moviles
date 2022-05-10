package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val btnListoBien: Button = findViewById(R.id.btnListoBien)

        btnListoBien.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            startActivity(intent)
        }


    }
}