package orlando.camacho.tofi

class UsuarioPerfil(var nombre : String ?= null, var edad : String ?= null, var mail : String ?= null){
    override fun toString() = nombre + "\t" + edad + "\t" + mail
}