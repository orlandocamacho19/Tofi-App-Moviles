package orlando.camacho.tofi

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import orlando.camacho.tofi.databinding.ActivityIniciarSesionBinding

class iniciar_sesion : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityIniciarSesionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.btnIniciarSesion.setOnClickListener {
            val email = binding.etUsuarioRegistro.text.toString()
            val password = binding.etContraseniaRegistro.text.toString()

            when {
                email.isEmpty() || password.isEmpty() -> {
                    Toast.makeText(baseContext, "Mail o contraseña incorrecta", Toast.LENGTH_SHORT).show()
                } else -> {
                    SignIn(email, password)
                }
            }
        }

        binding.btnRegistrarse.setOnClickListener {
            var intent: Intent = Intent (this, registro::class.java)
            startActivity(intent)
        }

        binding.btnOlvidarPassword.setOnClickListener {
            var intent: Intent = Intent (this, recuperar_contra::class.java)
            startActivity(intent)
        }
    }

    private fun SignIn(email:String,password:String){
        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                Log.d(TAG, "signInWithEmail:success")
                reload()
            } else {
                Log.w(TAG, "signInWithEmail:failure", task.exception)
                reload()
            }
        }
    }

    private fun reload(){
        val intent = Intent(this, seleccion_perfiles::class.java)
        intent.putExtra("mail", binding.etUsuarioRegistro.text.toString())
        this.startActivity(intent)
    }
}