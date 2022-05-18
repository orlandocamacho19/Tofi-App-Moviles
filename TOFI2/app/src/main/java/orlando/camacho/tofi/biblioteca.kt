package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore

class biblioteca : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biblioteca)

        val botonInicioP: ImageButton = findViewById(R.id.btnIniciP)
        val botonBuscarP: ImageButton = findViewById(R.id.btnBuscarP)
        val botonBilioP: ImageButton = findViewById(R.id.btnBiblioP)
        val botonActiP: ImageButton = findViewById(R.id.btnActiP)
        val botonPerfil: ImageButton = findViewById(R.id.btnPerfilP)

        val libro1: ShapeableImageView = findViewById(R.id.libroFav1)
        val progres1: ProgressBar = findViewById(R.id.barraLibroFav1)
        val nombre1: TextView = findViewById(R.id.nombreLibroFav1)
        val libro2: ShapeableImageView = findViewById(R.id.libroFav2)
        val progres2: ProgressBar = findViewById(R.id.barraLibroFav2)
        val nombre2: TextView = findViewById(R.id.nombreLibroFav2)
        val libro3: ShapeableImageView = findViewById(R.id.libroFav3)
        val progres3: ProgressBar = findViewById(R.id.barraLibroFav3)
        val nombre3: TextView = findViewById(R.id.nombreLibroFav3)
        val libro4: ShapeableImageView = findViewById(R.id.libroFav4)
        val progres4: ProgressBar = findViewById(R.id.barraLibroFav4)
        val nombre4: TextView = findViewById(R.id.nombreLibroFav4)

        val perfilUsuario: String? = intent.getStringExtra("perfil")
        val mail: String? = intent.getStringExtra("mail").toString()

        var favoritos = ArrayList<DocumentSnapshot>()

        db.collection("Favoritos").get().addOnSuccessListener {

            for (favorito in it.documents) {
                if (favorito.get("Mail") == mail && favorito.get("Perfil") == perfilUsuario) {
                    favoritos.add(favorito)
                }
            }

            if (favoritos.size == 1) {
                if (favoritos.get(0).get("LibroF") == "Pastelito"){
                    libro1.setImageResource(R.drawable.gato)
                } else if (favoritos.get(0).get("LibroF") == "Click"){
                    libro1.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(0).get("LibroF") == "Museo"){
                    libro1.setImageResource(R.drawable.museo)
                } else {
                    libro1.setImageResource(R.drawable.mochila)
                }

                nombre1.setText(favoritos.get(0).get("LibroF").toString())

                libro2.visibility = View.INVISIBLE
                progres2.visibility = View.INVISIBLE
                nombre2.visibility = View.INVISIBLE
                libro3.visibility = View.INVISIBLE
                progres3.visibility = View.INVISIBLE
                nombre3.visibility = View.INVISIBLE
                libro4.visibility = View.INVISIBLE
                progres4.visibility = View.INVISIBLE
                nombre4.visibility = View.INVISIBLE
            } else if (favoritos.size == 2) {
                if (favoritos.get(0).get("LibroF") == "Pastelito"){
                    libro1.setImageResource(R.drawable.gato)
                } else if (favoritos.get(0).get("LibroF") == "Click"){
                    libro1.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(0).get("LibroF") == "Museo"){
                    libro1.setImageResource(R.drawable.museo)
                } else {
                    libro1.setImageResource(R.drawable.mochila)
                }

                if (favoritos.get(1).get("LibroF") == "Pastelito"){
                    libro2.setImageResource(R.drawable.gato)
                } else if (favoritos.get(1).get("LibroF") == "Click"){
                    libro2.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(1).get("LibroF") == "Museo"){
                    libro2.setImageResource(R.drawable.museo)
                } else {
                    libro2.setImageResource(R.drawable.mochila)
                }

                nombre1.setText(favoritos.get(0).get("LibroF").toString())
                nombre2.setText(favoritos.get(1).get("LibroF").toString())

                libro3.visibility = View.INVISIBLE
                progres3.visibility = View.INVISIBLE
                nombre3.visibility = View.INVISIBLE
                libro4.visibility = View.INVISIBLE
                progres4.visibility = View.INVISIBLE
                nombre4.visibility = View.INVISIBLE
            } else if (favoritos.size == 3) {
                if (favoritos.get(0).get("LibroF") == "Pastelito"){
                    libro1.setImageResource(R.drawable.gato)
                } else if (favoritos.get(0).get("LibroF") == "Click"){
                    libro1.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(0).get("LibroF") == "Museo"){
                    libro1.setImageResource(R.drawable.museo)
                } else {
                    libro1.setImageResource(R.drawable.mochila)
                }

                if (favoritos.get(1).get("LibroF") == "Pastelito"){
                    libro2.setImageResource(R.drawable.gato)
                } else if (favoritos.get(1).get("LibroF") == "Click"){
                    libro2.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(1).get("LibroF") == "Museo"){
                    libro2.setImageResource(R.drawable.museo)
                } else {
                    libro2.setImageResource(R.drawable.mochila)
                }

                if (favoritos.get(2).get("LibroF") == "Pastelito"){
                    libro3.setImageResource(R.drawable.gato)
                } else if (favoritos.get(2).get("LibroF") == "Click"){
                    libro3.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(2).get("LibroF") == "Museo"){
                    libro3.setImageResource(R.drawable.museo)
                } else {
                    libro3.setImageResource(R.drawable.mochila)
                }

                nombre1.setText(favoritos.get(0).get("LibroF").toString())
                nombre2.setText(favoritos.get(1).get("LibroF").toString())
                nombre3.setText(favoritos.get(2).get("LibroF").toString())

                libro4.visibility = View.INVISIBLE
                progres4.visibility = View.INVISIBLE
                nombre4.visibility = View.INVISIBLE
            } else if (favoritos.size == 4) {
                if (favoritos.get(0).get("LibroF") == "Pastelito"){
                    libro1.setImageResource(R.drawable.gato)
                } else if (favoritos.get(0).get("LibroF") == "Click"){
                    libro1.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(0).get("LibroF") == "Museo"){
                    libro1.setImageResource(R.drawable.museo)
                } else {
                    libro1.setImageResource(R.drawable.mochila)
                }

                if (favoritos.get(1).get("LibroF") == "Pastelito"){
                    libro2.setImageResource(R.drawable.gato)
                } else if (favoritos.get(1).get("LibroF") == "Click"){
                    libro2.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(1).get("LibroF") == "Museo"){
                    libro2.setImageResource(R.drawable.museo)
                } else {
                    libro2.setImageResource(R.drawable.mochila)
                }

                if (favoritos.get(2).get("LibroF") == "Pastelito"){
                    libro3.setImageResource(R.drawable.gato)
                } else if (favoritos.get(2).get("LibroF") == "Click"){
                    libro3.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(2).get("LibroF") == "Museo"){
                    libro3.setImageResource(R.drawable.museo)
                } else {
                    libro3.setImageResource(R.drawable.mochila)
                }

                if (favoritos.get(3).get("LibroF") == "Pastelito"){
                    libro4.setImageResource(R.drawable.gato)
                } else if (favoritos.get(3).get("LibroF") == "Click"){
                    libro4.setImageResource(R.drawable.clicked)
                } else if (favoritos.get(3).get("LibroF") == "Museo"){
                    libro4.setImageResource(R.drawable.museo)
                } else {
                    libro4.setImageResource(R.drawable.mochila)
                }

                nombre1.setText(favoritos.get(0).get("LibroF").toString())
                nombre2.setText(favoritos.get(1).get("LibroF").toString())
                nombre3.setText(favoritos.get(2).get("LibroF").toString())
                nombre4.setText(favoritos.get(3).get("LibroF").toString())

            } else {
                libro1.visibility = View.INVISIBLE
                progres1.visibility = View.INVISIBLE
                nombre1.visibility = View.INVISIBLE
                libro2.visibility = View.INVISIBLE
                progres2.visibility = View.INVISIBLE
                nombre2.visibility = View.INVISIBLE
                libro3.visibility = View.INVISIBLE
                progres3.visibility = View.INVISIBLE
                nombre3.visibility = View.INVISIBLE
                libro4.visibility = View.INVISIBLE
                progres4.visibility = View.INVISIBLE
                nombre4.visibility = View.INVISIBLE
            }

            botonInicioP.setOnClickListener {
                var intent: Intent = Intent(this, catalogo::class.java)
                intent.putExtra("perfil", perfilUsuario)
                intent.putExtra("mail", mail)
                startActivity(intent)
            }
            botonBuscarP.setOnClickListener {
                var intent: Intent = Intent(this, buscar::class.java)
                intent.putExtra("perfil", perfilUsuario)
                intent.putExtra("mail", mail)
                startActivity(intent)
            }
            botonBilioP.setOnClickListener {
                var intent: Intent = Intent(this, biblioteca::class.java)
                intent.putExtra("perfil", perfilUsuario)
                intent.putExtra("mail", mail)
                startActivity(intent)
            }
            botonActiP.setOnClickListener {
                var intent: Intent = Intent(this, actividades_de_historias::class.java)
                intent.putExtra("perfil", perfilUsuario)
                intent.putExtra("mail", mail)
                startActivity(intent)
            }
            botonPerfil.setOnClickListener {
                var intent: Intent = Intent(this, perfil::class.java)
                intent.putExtra("perfil", perfilUsuario)
                intent.putExtra("mail", mail)
                startActivity(intent)
            }
        }
    }
}