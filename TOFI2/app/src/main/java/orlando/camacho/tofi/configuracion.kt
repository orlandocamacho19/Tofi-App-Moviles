package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        val atras: ImageButton = findViewById(R.id.btnAtrasConfig)
        val editarP: Button = findViewById(R.id.btnEditarPerfil)
        val cambiar: Button = findViewById(R.id.btnCambiarPerfil)
        val ayuda: Button = findViewById(R.id.btnAyuda)
        val cerrarSesion: Button = findViewById(R.id.btnCerrarSesion)

        atras.setOnClickListener {
            var intent: Intent = Intent (this, configurar_perfil::class.java)
            startActivity(intent)
        }

        editarP.setOnClickListener {
            var intent: Intent = Intent (this, configurar_perfil::class.java)
            startActivity(intent)
        }

        cambiar.setOnClickListener {
            var intent: Intent = Intent (this, seleccion_perfiles::class.java)
            startActivity(intent)
        }

        ayuda.setOnClickListener {
            var intent: Intent = Intent (this, preguntas_frecuentes::class.java)
            startActivity(intent)
        }

        cerrarSesion.setOnClickListener {
            var intent: Intent = Intent (this, iniciar_sesion::class.java)
            startActivity(intent)
        }
    }
}