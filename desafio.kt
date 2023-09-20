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
    
    // Inserindo formações com diferentes níveis e habilidades
    val formacaoJedi = Formacao("Formação Jedi", Nivel.Jedi, habilidadesJedi)  
    val formacaoPadawan = Formacao("Formação Padawan", Nivel.Padawan, habilidadesPadawan)
    val formacaoNPC = Formacao("Formação NPC", Nivel.NPC, habilidadesNPC)
   
    // Inserindo aprendizes com nome e idade
    val aprendiz1 = Aprendiz("Luke Skywalker", 25)    
    val aprendiz2 = Aprendiz("Ahsoka Tano", 17)
    val aprendiz3 = Aprendiz("Darth Vader", 35)
    val aprendiz4 = Aprendiz("Obi-Wan Kenobi", 42)
    val aprendiz5 = Aprendiz("Rey", 19)
    val aprendiz6 = Aprendiz("Leia Organa", 29)


    // Matrícula de aprendizes nas formações
    formacaoPadawan.Treinar(aprendiz2)
    formacaoNPC.Treinar(aprendiz3)
    formacaoJedi.Treinar(aprendiz4)
    formacaoPadawan.Treinar(aprendiz5)
    formacaoJedi.Treinar(aprendiz6)