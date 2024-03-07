package RPG

class Personagem(val nome:String, val tipoDePersnagem: TipoDePersonagem) {
    private var vida: Int = 1000
    var contratado: Boolean = false
    init {
        when (tipoDePersnagem) {
            TipoDePersonagem.ARQUEIRO -> vida += 50
            TipoDePersonagem.FEITICEIRO -> vida += 150
            TipoDePersonagem.GUERREIRO -> vida += 250
        }
        println("Personagem criado com nome $nome, classe $tipoDePersnagem e ${vida}HP. Contratado? $contratado")
    }
    fun isContratado () {
        println("$nome está contratado? $contratado")
    }
    fun getVida ():Int {
        return vida
    }
}