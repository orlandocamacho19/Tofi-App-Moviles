package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val registrarse: Button = findViewById(R.id.btnRegistrarseRegistro)

        registrarse.setOnClickListener {
            var intent: Intent = Intent (this, configurar_perfil::class.java)
            startActivity(intent)
        }
    }
}