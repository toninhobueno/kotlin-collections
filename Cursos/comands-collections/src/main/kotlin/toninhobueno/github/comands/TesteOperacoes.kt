package toninhobueno.github.comands

fun main(){
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    salarios.forEach { println(it) }
    println("----------------------------------------------")


    println ("Maior salario: ${salarios.maxOrNull()}")
    println ("Menor salario: ${salarios.minOrNull()}")
    println ("Media salario: ${salarios.average()}")


    val salariosMaisque2500 = salarios.filter { it > 2500 }
    println("----------------------------------------------")
    salariosMaisque2500.forEach { println(it) }
}