package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val inicio: ImageButton = findViewById(R.id.btnPInicio)
        val buscar: ImageButton = findViewById(R.id.btnPBuscar)
        val biblioteca: ImageButton = findViewById(R.id.btnPBiblio)
        val acti: ImageButton = findViewById(R.id.btnPActi)
        val perfil: ImageButton = findViewById(R.id.btnPPerfil)
        val configuracion: ImageButton = findViewById(R.id.btnConfig)

        inicio.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            startActivity(intent)
        }

        buscar.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            startActivity(intent)
        }

        biblioteca.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
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

        configuracion.setOnClickListener {
            var intent: Intent = Intent (this, configuracion::class.java)
            startActivity(intent)
        }
    }
}