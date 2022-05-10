package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class catalogo_fantasia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo_fantasia)

        val botonMadame: ImageButton = findViewById(R.id.btnMadame)
        val botonInicioF: ImageButton = findViewById(R.id.btnInicioF)
        val botonBuscarF: ImageButton = findViewById(R.id.btnBuscarF)
        val botonBilbioF: ImageButton = findViewById(R.id.btnBiblioF)
        val botonActiF: ImageButton = findViewById(R.id.btnActiF)
        val botonPerfilF: ImageButton = findViewById(R.id.btnPerfilF)
        val botonAtras: ImageButton = findViewById(R.id.btnAtrasF)

        botonMadame.setOnClickListener {
            var intent: Intent = Intent (this, presentacion_libro_dos::class.java)
            startActivity(intent)
        }
        botonInicioF.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            startActivity(intent)
        }
        botonBuscarF.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            startActivity(intent)
        }
        botonBilbioF.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
            startActivity(intent)
        }
        botonActiF.setOnClickListener {
            var intent: Intent = Intent (this, actividades_de_historias::class.java)
            startActivity(intent)
        }
        botonPerfilF.setOnClickListener {
            var intent: Intent = Intent (this, perfil::class.java)
            startActivity(intent)
        }
        botonAtras.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            startActivity(intent)
        }
    }
}