package br.com.petscrud.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.petscrud.R
import br.com.petscrud.models.Pet
import com.google.gson.Gson
import okhttp3.OkHttpClient

private const val URL = "https://pet-cp-backend-default-rtdb.firebaseio.com/pets.json"

class PetActivity : AppCompatActivity() {

    private var listaPets: List<Pet> = emptyList()
    private var client = OkHttpClient()
    private var gson = Gson()

    private lateinit var petNome: EditText
    private lateinit var petRaca: EditText
    private lateinit var petPeso: EditText
    private lateinit var petNascimento: EditText
    private lateinit var btnGravar: Button
    private lateinit var btnPesquisar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pet_layout)
        inicializaCampos()
    }

    private fun inicializaCampos() {
        petNome = findViewById(R.id.pet_nome)
        petRaca = findViewById(R.id.pet_raca)
        petPeso = findViewById(R.id.pet_peso)
        petNascimento = findViewById(R.id.pet_nascimento)
        btnGravar = findViewById(R.id.btn_gravar)
        btnPesquisar = findViewById(R.id.btn_pesquisar)
    }
}