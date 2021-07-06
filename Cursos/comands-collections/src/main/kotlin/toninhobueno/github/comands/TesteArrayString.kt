package toninhobueno.github.comands

fun main(){
    val nomes = Array (4){""}

    nomes[0] = "Antonio"
    nomes[1] = "Carlos"
    nomes[2] = "Leite"
    nomes[3] = "Bueno"

for (nome in nomes){
    println(nome)
}


    nomes.sort()
    println("----------------------------------------------")
    nomes.forEach {
        println(it)
    }



    val nomes2 = arrayOf("José","Felipe","Tiago")
    println("----------------------------------------------")
    nomes.sort()
    nomes2.forEach {
        println(it)
    }
}