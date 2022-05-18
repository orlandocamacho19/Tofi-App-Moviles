package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView

class actividades_de_historias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividades_de_historias)

        val perfilUsuario: String? = intent.getStringExtra("perfil")
        val mail: String? = intent.getStringExtra("mail").toString()

        val botonInicioP: ImageButton = findViewById(R.id.btnIniciP)
        val botonBuscarP: ImageButton = findViewById(R.id.btnBuscarP)
        val botonBilioP: ImageButton = findViewById(R.id.btnBiblioP)
        val botonActiP: ImageButton = findViewById(R.id.btnActiP)
        val botonPerfil: ImageButton = findViewById(R.id.btnPerfilP)
        val botonPronunUno: ShapeableImageView = findViewById(R.id.btnPronunUno)
        val botonPronunDos: TextView = findViewById(R.id.btnPronunDos)
        val botonPronunTres: RelativeLayout = findViewById(R.id.btnPronunTres)


        botonInicioP.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonBuscarP.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonBilioP.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonActiP.setOnClickListener {
            var intent: Intent = Intent (this, actividades_de_historias::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonPerfil.setOnClickListener {
            var intent: Intent = Intent (this, perfil::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonPronunUno.setOnClickListener {
            var intent: Intent = Intent (this, pronunciacion::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonPronunDos.setOnClickListener {
            var intent: Intent = Intent (this, pronunciacion::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
        botonPronunTres.setOnClickListener {
            var intent: Intent = Intent (this, pronunciacion::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
    }
}