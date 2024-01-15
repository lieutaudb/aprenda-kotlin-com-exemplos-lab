enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

data class Instrutor(val nome: String)

fun main() {
    val usuario1 = Usuario("Eduarda")
    val usuario2 = Usuario("Douglas")

    val conteudo1 = ConteudoEducacional("Design gráfico", 90)
    val conteudo2 = ConteudoEducacional("Análise e desenvolvimento de sistemas", 120)

    val formacao = Formacao("Dio", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}