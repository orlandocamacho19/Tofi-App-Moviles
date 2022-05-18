package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView

class buscar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar)

        val perfilUsuario: String? = intent.getStringExtra("perfil")
        val mail: String? = intent.getStringExtra("mail").toString()

        val botonFantaUno: ShapeableImageView = findViewById(R.id.btnFantasia)
        val botonFantaDos: RelativeLayout = findViewById(R.id.btnFantasiaDos)
        val botonFantaTres: TextView = findViewById(R.id.btnFantasiaTres)
        val botonInicioC: ImageButton = findViewById(R.id.btnInicioC)
        val botonBuscarC: ImageButton = findViewById(R.id.btnBuscarC)
        val botonBiblioC: ImageButton = findViewById(R.id.btnBiblioC)
        val botonActiC: ImageButton = findViewById(R.id.btnActiC)
        val botonPerfilC: ImageButton = findViewById(R.id.btnPerfilC)

        botonFantaUno.setOnClickListener {
            var intent: Intent = Intent (this, catalogo_fantasia::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonFantaDos.setOnClickListener {
            var intent: Intent = Intent (this, catalogo_fantasia::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonFantaTres.setOnClickListener {
            var intent: Intent = Intent (this, catalogo_fantasia::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonInicioC.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonBuscarC.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonBiblioC.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonActiC.setOnClickListener {
            var intent: Intent = Intent (this, actividades_de_historias::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonPerfilC.setOnClickListener {
            var intent: Intent = Intent (this, perfil::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
    }
}