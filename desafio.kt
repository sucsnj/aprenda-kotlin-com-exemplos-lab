// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

//classe para representar o aluno
data class Usuario(val nome: String)

// classe para representar o conteúdo educacional
data class ConteudoEducacional(
    val nome: String, // nome do conteúdo
    val duracao: Int = 60 // duração em minutos
)

// classe para representar a formação do aluno
data class Formacao(
    val nome: String,
    val nivel: Nivel, // nível com base na Enum
    val conteudos: List<ConteudoEducacional>
    ) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }

    // lista o alunos inscritos
    fun listarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println("- ${it.nome}") }
    }
}

fun main() {

    // os conteúdos educacionais para exemplo
    val kotlinBasico = ConteudoEducacional("Introdução ao Kotlin", 90)
    val pooKotlin = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 120)
    val colecoesKotlin = ConteudoEducacional("Trabalhando com Coleções", 100)

    // formação
    val formacaoKotlin = Formacao(
        nome = "Formação para Kotlin",
        nivel = Nivel.INTERMEDIARIO,
        conteudos = listOf(kotlinBasico, pooKotlin, colecoesKotlin)
    )

    // alunos
    val usuario1 = Usuario("AlunoDio1")
    val usuario2 = Usuario("AlunoDio2")
    val usuario3 = Usuario("AlunoDio3")

    // fazendo a matrícula de cada aluno
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoKotlin.matricular(usuario3)

    // listando os alunos
    formacaoKotlin.listarInscritos()
}
