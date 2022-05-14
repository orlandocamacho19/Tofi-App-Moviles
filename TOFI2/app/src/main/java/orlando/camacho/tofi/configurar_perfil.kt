package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class configurar_perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configurar_perfil)

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
            // Actualizar la base de datos y al usuario que inicio sesion asignarle en una realtimedb los datos el perfil


            var intent: Intent = Intent (this, recuperar_contra::class.java)
            startActivity(intent)
        }

    }
}