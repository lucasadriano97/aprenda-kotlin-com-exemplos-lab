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
    val habilidadesPadawan = listOf(
        AdquirirHabilidade("Força Básica", 5),
        AdquirirHabilidade("Treinamento com Sabre", 3),
        AdquirirHabilidade("Meditar", 4)
    )
    val habilidadesNPC = listOf(
        AdquirirHabilidade("Tarefas Domésticas", 1)
    )
    
    // Criação de formações com diferentes níveis e habilidades
    val formacaoJedi = Formacao("Formação Jedi", Nivel.Jedi, habilidadesJedi)  
    val formacaoPadawan = Formacao("Formação Padawan", Nivel.Padawan, habilidadesPadawan)
    val formacaoNPC = Formacao("Formação NPC", Nivel.NPC, habilidadesNPC)
    }
