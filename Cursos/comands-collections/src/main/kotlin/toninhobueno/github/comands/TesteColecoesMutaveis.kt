package toninhobueno.github.comands

fun main (){
    val joao = Funcionario("Joao", 1000.0,"CLT")
    val pedro = Funcionario("Pedro", 5000.0,"PJ")
    val maria = Funcionario("Maria", 3000.0,"CLT")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach{ println(it) }

    println("----------------------------------------------")

    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("----------------------------------------------")

    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("------------------- SET ---------------------------")
    val funcionariosSet = mutableSetOf(pedro)
    funcionariosSet.forEach{ println(it) }

    funcionariosSet.add(joao)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{ println(it) }


    println("----------------------------------------------")

    funcionariosSet.remove(maria)
    funcionariosSet.forEach{ println(it) }
}