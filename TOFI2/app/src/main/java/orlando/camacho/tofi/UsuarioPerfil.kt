package orlando.camacho.tofi

class UsuarioPerfil(var nombre : String ?= null, var edad : String ?= null){
    override fun toString() = nombre + "\t" + edad
}