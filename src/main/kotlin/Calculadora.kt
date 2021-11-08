import kotlin.math.pow

open class Calculadora {

    fun Subtracao(a: Int, b: Int): Int {
        return a - b
    }

    fun Soma(a: Int, b: Int): Int {
        return a + b

    }

    fun Multiplicacao(a: Int, b: Int): Int {
        return a * b

    }

    fun Divisao(a: Int, b: Int): Int {
        return a / b

    }

    fun Potencia(a: Double, b: Double): Double {
        return a.pow(b)

    }

    fun RaizQuadrada(a: Double): Double{
        return Math.sqrt(a)

    }

}