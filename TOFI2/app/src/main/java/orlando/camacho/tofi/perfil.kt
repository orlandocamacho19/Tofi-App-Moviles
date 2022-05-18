package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val perfilUsuario: String? = intent.getStringExtra("perfil")
        val mail : String? = intent.getStringExtra("mail").toString()

        val inicio: ImageButton = findViewById(R.id.btnPInicio)
        val buscar: ImageButton = findViewById(R.id.btnPBuscar)
        val biblioteca: ImageButton = findViewById(R.id.btnPBiblio)
        val acti: ImageButton = findViewById(R.id.btnPActi)
        val perfil: ImageButton = findViewById(R.id.btnPPerfil)
        val configuracion: ImageButton = findViewById(R.id.btnConfigPerfil)


        inicio.setOnClickListener {
            var intent: Intent = Intent (this, catalogo::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        buscar.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        biblioteca.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        acti.setOnClickListener {
            var intent: Intent = Intent (this, actividades_de_historias::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        perfil.setOnClickListener {
            var intent: Intent = Intent (this, perfil::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }

        configuracion.setOnClickListener {
            var intent: Intent = Intent (this, configuracion::class.java)
            intent.putExtra("perfil", perfilUsuario)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }
    }
}