fun main(args: Array<String>) {
    /*Exercício

1. Crie um projeto chamado cadastroDeConvidados
2. Crie um loop (pode ser usado o while) e coloque um when dentro da estrutura,
para simular um menu de escolhas:]
- O Loop precisa ficar ativo enquanto uma variável simNao estiver como "Sim",
a partir do momento que o usuário digitar "Não" ou qualquer outra coisa, o programa
precisa ser finalizado.
- Se o usuário escolher 1, abre as instruções para adicionar um novo convidado
- Se o usuário escolher 2, abre as instruções para remover um convidado
- Se o usuário escolher 3, lista os convidados
3. Use a List para cadastrar cada convidado
4. Teste para ver se tudo funciona

     */

    println("Opção 1: Adicione um convidado \nOpção 2: Remova um convidado " +
            "\nOpção 3: Listar os convidados")
    val escolha = readLine()!!.toInt()

    print("Digite (Sim) para acessar a lista de convidados: ")
    val simNao = readLine()!!
    val listaConv = mutableListOf<String>()

    while (simNao == "Sim"){

        when(escolha){
            1 -> adiciona(listaConv)
            2 -> remove(listaConv)
            3 -> listar(listaConv)
        }
    }


}

fun adiciona (listaConv: MutableList<String>): Any{
    print("Nome do convidado para adicionar: ")
    var nome = readLine()!!
    listaConv.add(nome)
    println(listaConv)
    return listaConv
}

fun remove (listaConv: MutableList<String>): Any{
    print("Nome do convidado para remover: ")
    var removeNome = readLine()!!
    if (listaConv.contains(removeNome)){
        listaConv.remove(removeNome)
        println("O convidado $removeNome foi removido!")
        return listaConv
    }else return println("O convidado $removeNome não existe!")
}

fun listar (listaConv: MutableList<String>): Any{
    println(listaConv.size)
    return listaConv
}