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
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
