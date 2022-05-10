package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class pronunciacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pronunciacion)

        val serpiente: ImageButton = findViewById(R.id.btnSerpiente)
        val inicio: ImageButton = findViewById(R.id.btnPronunInicio)
        val buscar: ImageButton = findViewById(R.id.btnPronunBuscar)

        val acti: ImageButton = findViewById(R.id.btnPronunActi)
        val perfil: ImageButton = findViewById(R.id.btnPronunPerfil)
        val atras: ImageButton = findViewById(R.id.btnAtrasPronun)


        serpiente.setOnClickListener {
            var intent: Intent = Intent (this, presentacion_libro_dos::class.java)
            startActivity(intent)
        }

        inicio.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            startActivity(intent)
        }

        buscar.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            startActivity(intent)
        }

        acti.setOnClickListener {
            var intent: Intent = Intent (this, actividades_de_historias::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener {
            var intent: Intent = Intent (this, perfil::class.java)
            startActivity(intent)
        }
        atras.setOnClickListener {
            var intent: Intent = Intent (this, actividades_de_historias::class.java)
            startActivity(intent)
        }
    }
}