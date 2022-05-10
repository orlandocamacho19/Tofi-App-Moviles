package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class biblioteca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biblioteca)

        val botonInicioP: ImageButton = findViewById(R.id.btnIniciP)
        val botonBuscarP: ImageButton = findViewById(R.id.btnBuscarP)
        val botonBilioP: ImageButton = findViewById(R.id.btnBiblioP)
        val botonActiP: ImageButton = findViewById(R.id.btnActiP)
        val botonPerfil: ImageButton = findViewById(R.id.btnPerfilP)

        botonInicioP.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            startActivity(intent)
        }
        botonBuscarP.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            startActivity(intent)
        }
        botonBilioP.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
            startActivity(intent)
        }
        botonActiP.setOnClickListener {
            var intent: Intent = Intent (this, actividades_de_historias::class.java)
            startActivity(intent)
        }
        botonPerfil.setOnClickListener {
            var intent: Intent = Intent (this, perfil::class.java)
            startActivity(intent)
        }
    }
}