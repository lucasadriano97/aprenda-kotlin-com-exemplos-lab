// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { NPC, Padawan, Jedi }                                 // Cria classe para níveis (NPC, Padawan, Jedi), do tipo enum

data class Aprendiz(val nome: String, val idade: Int)                   // Classe Aprendiz com nome e idade

class AdquirirHabilidade(val nome: String, val duracao: Int)           // Classe de Habilidades com nome e duração

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
