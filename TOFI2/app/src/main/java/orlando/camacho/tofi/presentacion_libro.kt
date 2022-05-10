package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class presentacion_libro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentacion_libro)

        val botonPlay: ImageButton = findViewById(R.id.btnPlay)

        botonPlay.setOnClickListener {
            var intent: Intent = Intent (this, lectura_progreso::class.java)
            startActivity(intent)
        }
    }
}