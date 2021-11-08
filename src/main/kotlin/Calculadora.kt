import kotlin.math.pow

class Calculadora {

    fun subtracao(a: Int, b: Int): Int {
        return a - b
    }

    fun soma(a: Int, b: Int): Int {
        return a + b

    }

    fun multiplicacao(a: Int, b: Int): Int {
        return a * b

    }

    fun divisao(a: Int, b: Int): Int {
        return a / b

    }

    fun potencia(a: Double, b: Double): Double {
        return a.pow(b)

    }

    fun raizQuadrada(a: Double): Double{
        return Math.sqrt(a)

    }

}