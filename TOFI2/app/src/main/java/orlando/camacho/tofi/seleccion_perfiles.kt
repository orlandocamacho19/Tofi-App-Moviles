package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class seleccion_perfiles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_perfiles)
        val mail = intent.getSerializableExtra("mail").toString()

        val botonPerfil1: ImageView = findViewById(R.id.ivPerfil1)
        val botonPerfil2: ImageView = findViewById(R.id.ivPerfil2)
        val botonPerfil3: ImageView = findViewById(R.id.ivPerfil3)
        val botonPerfilNuevo: ImageButton = findViewById(R.id.ivPerfilNuevo)

        botonPerfil1.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonPerfil2.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonPerfil3.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonPerfilNuevo.setOnClickListener {
            var intent: Intent = Intent (this, configurar_perfil::class.java)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }


    }
}