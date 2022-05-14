package orlando.camacho.tofi

class Perfil(var nombre : String ?= null,var email : String ?= null,var edad : String ?= null){
    override fun toString() = nombre + "\t" + email + "\t" + edad
}