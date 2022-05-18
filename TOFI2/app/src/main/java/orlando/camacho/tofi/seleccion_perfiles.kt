package orlando.camacho.tofi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore


class seleccion_perfiles : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_perfiles)

        val mail : String? = intent.getStringExtra("mail").toString()

        val botonPerfil1: ImageView = findViewById(R.id.ivPerfil1)
        val nombrePerfil1: TextView = findViewById(R.id.nombrePrimerPerfil)
        val botonPerfil2: ImageView = findViewById(R.id.ivPerfil2)
        val nombrePerfil2: TextView = findViewById(R.id.NombreSegundoPerfil)
        val botonPerfil3: ImageView = findViewById(R.id.ivPerfil3)
        val nombrePerfil3: TextView = findViewById(R.id.nombreTercerPerfil)
        val botonPerfilNuevo: ImageButton = findViewById(R.id.ivPerfilNuevo)

        //traer perfiles
        var perfiles = ArrayList<DocumentSnapshot>()

        db.collection("Perfiles").get().addOnSuccessListener {

            for (perfil in it.documents){
                if (perfil.get("mail") == mail){
                    perfiles.add(perfil)
                }
            }

            if (perfiles.size == 1) {
                nombrePerfil1.setText(perfiles.get(0).get("nombre").toString())
                botonPerfil2.visibility = View.INVISIBLE
                nombrePerfil2.visibility = View.INVISIBLE
                botonPerfil3.visibility = View.INVISIBLE
                nombrePerfil3.visibility = View.INVISIBLE
            } else if (perfiles.size == 2) {
                nombrePerfil1.setText(perfiles.get(0).get("nombre").toString())
                nombrePerfil2.setText(perfiles.get(1).get("nombre").toString())
                botonPerfil3.visibility = View.INVISIBLE
                nombrePerfil3.visibility = View.INVISIBLE
            } else {
                nombrePerfil1.setText(perfiles.get(0).get("nombre").toString())
                nombrePerfil2.setText(perfiles.get(1).get("nombre").toString())
                nombrePerfil3.setText(perfiles.get(2).get("nombre").toString())
            }

            botonPerfil1.setOnClickListener {
                var intent: Intent = Intent (this, catalogo::class.java)
                intent.putExtra("mail", mail)
                intent.putExtra("perfil", perfiles.get(0).get("nombre").toString())
                startActivity(intent)
            }

            botonPerfil2.setOnClickListener {
                var intent: Intent = Intent (this, catalogo::class.java)
                intent.putExtra("mail", mail)
                intent.putExtra("perfil", perfiles.get(1).get("nombre").toString())
                startActivity(intent)
            }

            botonPerfil3.setOnClickListener {
                var intent: Intent = Intent (this, catalogo::class.java)
                intent.putExtra("mail", mail)
                intent.putExtra("perfil", perfiles.get(2).get("nombre").toString())
                startActivity(intent)
            }
        }

        botonPerfilNuevo.setOnClickListener {
            var intent: Intent = Intent (this, configurar_perfil::class.java)
            intent.putExtra("mail", mail)
            startActivity(intent)
        }


    }
}