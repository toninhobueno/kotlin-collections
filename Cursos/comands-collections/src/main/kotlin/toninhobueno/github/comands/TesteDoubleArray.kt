package toninhobueno.github.comands

fun main(){
    val salarios = DoubleArray(3)

    salarios [0] = 1000.0
    salarios [1] = 4000.0
    salarios [2] = 1700.0


    salarios.forEach {
        println(it)
    }

    println("----------------------------------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }


    val salarios2 = doubleArrayOf(1500.0, 5000.0, 3200.0)


    println("----------------------------------------------")
    salarios2.sort()
    salarios2.forEach { println(it) }
}