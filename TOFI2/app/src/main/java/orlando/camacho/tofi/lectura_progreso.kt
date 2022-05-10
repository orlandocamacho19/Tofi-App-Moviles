package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class lectura_progreso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lectura_progreso)

        val botonAtrasLibroProgreso: ImageButton = findViewById(R.id.btnAtrasLibroProgreso)

        botonAtrasLibroProgreso.setOnClickListener {
            var intent: Intent = Intent (this, lectura_progreso_dos::class.java)
            startActivity(intent)
        }
    }
}