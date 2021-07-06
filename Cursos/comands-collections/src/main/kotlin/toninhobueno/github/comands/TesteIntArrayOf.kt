package toninhobueno.github.comands

fun main (){
    val values = intArrayOf(2, 3 ,4 ,10 , 12)

    values.forEach {
        println(it)
    }
    println("----------------------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }

}
