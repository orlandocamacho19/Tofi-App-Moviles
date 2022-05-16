package orlando.camacho.tofi

class Usuario(var nombre : String ?= null,var email : String ?= null){
    override fun toString() = nombre + "\t" + email
}