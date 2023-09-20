// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { NPC, Padawan, Jedi }                                 // Cria classe para níveis (NPC, Padawan, Jedi), do tipo enum

data class Aprendiz(val nome: String, val idade: Int)                   // Classe Aprendiz com nome e idade

class AdquirirHabilidade(val nome: String, val duracao: Int)           // Classe de Habilidades com nome e duração

data class Formacao(val nome: String, val nivel: Nivel, val habilidades: List<AdquirirHabilidade>) {  // Classe Formação com nome, nível e habilidades

    val aprendizes = mutableListOf<Aprendiz>() // Lista mutável de aprendizes matriculados na formação
    
   fun Treinar(aprendiz: Aprendiz) {
        aprendizes.add(aprendiz)
        println("O aprendiz ${aprendiz.nome} foi matriculado na formação $nome (Nível: $nivel).")
    }
}
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
