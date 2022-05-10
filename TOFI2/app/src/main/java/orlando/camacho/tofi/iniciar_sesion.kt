package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class iniciar_sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        val botonIniciarSesion: Button = findViewById(R.id.btnIniciarSesion)
        val botonRegistrarse: Button = findViewById(R.id.btnRegistrarse)
        val olvidarPass: TextView = findViewById(R.id.btnOlvidarPassword)

        botonIniciarSesion.setOnClickListener {
            var intent: Intent = Intent (this, seleccion_perfiles::class.java)
            startActivity(intent)
        }

        botonRegistrarse.setOnClickListener {
            var intent: Intent = Intent (this, registro::class.java)
            startActivity(intent)
        }

        olvidarPass.setOnClickListener {
            var intent: Intent = Intent (this, recuperar_contra::class.java)
            startActivity(intent)
        }
    }
}