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


fun main() {
    // Criação de listas de habilidades
    val habilidadesJedi = listOf(            
        AdquirirHabilidade("Força", 10),
        AdquirirHabilidade("Sabre de Luz", 5),
        AdquirirHabilidade("Telecinese", 8)
    )
    
    
    
    }
