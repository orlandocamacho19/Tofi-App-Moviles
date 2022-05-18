package orlando.camacho.tofi

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore

class catalogo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        val botonClick: ImageButton = findViewById(R.id.btnClick)
        val botonMochila: ImageButton = findViewById(R.id.btnMochila)
        val botonMuseo : ImageButton = findViewById(R.id.btnMuseo)
        val botonPastelito : ImageButton = findViewById(R.id.btnPastelito)
        val botonInicio: ImageButton = findViewById(R.id.btnInicio)
        val botonBuscar: ImageButton = findViewById(R.id.btnBuscar)
        val botonBiblioteca: ImageButton = findViewById(R.id.btnBiblioteca)
        val botonActividades: ImageButton = findViewById(R.id.btnActividades)
        val botonPerfil: ImageButton = findViewById(R.id.btnPerfil)

        val perfilUsuario: String? = intent.getStringExtra("perfil")
        val mail : String? = intent.getStringExtra("mail").toString()

        botonClick.setOnClickListener {
            var intent: Intent = Intent (this, presentacion_libro::class.java)
            var libroSelec="Click"
            intent.putExtra("Libro", libroSelec)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonMochila.setOnClickListener{
            var intent: Intent = Intent (this, presentacion_libro::class.java)
            var libroSelec="Mochila"
            intent.putExtra("Libro", libroSelec)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonMuseo.setOnClickListener{
            var intent: Intent = Intent (this, presentacion_libro::class.java)
            var libroSelec="Museo"
            intent.putExtra("Libro", libroSelec)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonPastelito.setOnClickListener{
            var intent: Intent = Intent (this, presentacion_libro::class.java)
            var libroSelec="Pastelito"
            intent.putExtra("Libro", libroSelec)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonInicio.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonBuscar.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonBiblioteca.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        botonActividades.setOnClickListener {
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
    }
}