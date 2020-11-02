fun main() {
    println("Bem vindo ao Bytebank!")
    val contaGiu = Conta("Giuseppe", 1000, 1000.0)
    val contaAna = Conta("Giuseppe", 1001, 2000.0)

    println("Saldo da Ana é: ${contaAna.saldo}")
    println("Saldo do Giuseppe é: ${contaGiu.saldo}")

    println()
    testarPrimitivos()
}

class Conta(val titular: String, val numero: Int, var saldo: Double) {
}

fun testarPrimitivos() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    // Tipo primitivos nap sao alterados, eh recebido uma copia
    println("Numero x eh igual $numeroX")
    println("Numero y eh igual $numeroY")

    val contaJoao = Conta("Joao", 2000, 10.0)
    var contaMaria = contaJoao
    contaMaria.saldo -= 100

    // Referencias, espacos de memoria reservados, diferente dos tipos primitivos
    // Tipos nao primitivos eh apontado a posicao de memoria para o objeto
    println("Saldo conta Joao =  ${contaJoao.saldo}") // Note que mudou o valor da conta Joao
    println("Saldo conta Maria =  ${contaMaria.saldo}")

    //Vai imprimir o mesmo hash de objeto para ambos
    println(contaJoao)
    println(contaMaria)
}

fun testarLacos() {
    for (i in 1..5) {
        var titular = "Giuseppe $i"
        val numeroConta = 1000 + i
        var saldo = 10.0 + i

        println("O titular eh: $titular")
        println("A conta eh: $numeroConta")
        println("O saldo eh: $saldo")
        println()
    }

    for (i in 10 downTo 1 step 2) {
        if (i == 8) continue
        if (i == 4) break
        var titular = "Giuseppe $i"
        val numeroConta = 1000 + i
        var saldo = 10.0 + i

        println("O titular eh: $titular")
        println("A conta eh: $numeroConta")
        println("O saldo eh: $saldo")
        println()
    }
}

fun testarLoop() {
    for (i in 1..6) {
        println("O valor de I é: $i")
    }
}

fun testarCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta negativa")
        else -> println("Conta negativa")
    }
}