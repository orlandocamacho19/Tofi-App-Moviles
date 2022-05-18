package orlando.camacho.tofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class presentacion_libro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentacion_libro)
        val botonPlay: ImageButton = findViewById(R.id.btnPlay)
        val db = FirebaseFirestore.getInstance()
        var titulo:TextView = findViewById(R.id.txtTitulo) as TextView
        var autor:TextView = findViewById(R.id.txtAutor) as TextView
        var paginas:TextView = findViewById(R.id.txtPaginas) as TextView
        var contenido:TextView = findViewById(R.id.txtContenido) as TextView
        var fondo:ImageView=findViewById(R.id.imgViewPortada) as ImageView
        val r: String? = intent.getStringExtra("Libro")

        if (r.equals("Click")){
            db.collection("biblioteca").document(r.toString()).get().addOnSuccessListener {
                titulo.setText(it.get("titulo") as String?)
                autor.setText(it.get("autor") as String?)
                paginas.setText(it.get("paginas") as String?)
                contenido.setText(it.get("descripcion") as String?)
                fondo.setImageResource(R.drawable.clickrecortada)
            }
        }else if (r.equals("Pastelito")){
            db.collection("biblioteca").document(r.toString()).get().addOnSuccessListener {
                titulo.setText(it.get("titulo") as String?)
                autor.setText(it.get("autor") as String?)
                paginas.setText(it.get("paginas") as String?)
                contenido.setText(it.get("descripcion") as String?)
                fondo.setImageResource(R.drawable.fondopastel)
            }
        }else if (r.equals("Museo")){
            db.collection("biblioteca").document(r.toString()).get().addOnSuccessListener {
                titulo.setText(it.get("titulo") as String?)
                autor.setText(it.get("autor") as String?)
                paginas.setText(it.get("paginas") as String?)
                contenido.setText(it.get("descripcion") as String?)
                fondo.setImageResource(R.drawable.fondomuseo)
            }
        }else if (r.equals("Mochila")){
            db.collection("biblioteca").document(r.toString()).get().addOnSuccessListener {
                titulo.setText(it.get("titulo") as String?)
                autor.setText(it.get("autor") as String?)
                paginas.setText(it.get("paginas") as String?)
                contenido.setText(it.get("descripcion") as String?)
                fondo.setImageResource(R.drawable.fondomochila)
            }
        }



        botonPlay.setOnClickListener {
            var intent: Intent = Intent (this, lectura_progreso::class.java)
            startActivity(intent)
        }
    }
}