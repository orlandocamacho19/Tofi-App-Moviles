package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore

class configurar_perfil : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configurar_perfil)
        val mail = intent.getSerializableExtra("mail")

        val etNombrePerfil: EditText = findViewById(R.id.NombrePerfil)
        val btMasEdad: ImageButton = findViewById(R.id.btMasEdad)
        val btMenosEdad: ImageButton = findViewById(R.id.btMenosEdad)
        val tvEdad: TextView = findViewById(R.id.EdadChamaco)
        val btSiguiente: Button = findViewById(R.id.btnSigConfigPerfil)

        btMasEdad.setOnClickListener {
            var edad: Int = Integer.parseInt(tvEdad.text as String)
            if (edad >= 1 && edad < 12) {
                edad += 1
                tvEdad.setText(edad.toString())
            }
        }

        btMenosEdad.setOnClickListener {
            var edad: Int = Integer.parseInt(tvEdad.text as String)
            if (edad > 1 && edad <= 12) {
                edad -= 1
                tvEdad.setText(edad.toString())
            }
        }

        btSiguiente.setOnClickListener {
            if (!etNombrePerfil.text.isEmpty()) {

                val perfil = UsuarioPerfil(etNombrePerfil.text.toString(), tvEdad.text.toString(), intent.getStringExtra("mail"))

                db.collection("Perfiles").add(perfil)

                var intent: Intent = Intent(this, bienvenida::class.java)
                intent.putExtra("mail", mail)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Ingrese un nombre.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}