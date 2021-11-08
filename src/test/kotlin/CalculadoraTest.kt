import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

var calculadora = Calculadora()


    @Test
    fun subtracao() {
        assertEquals(4, calculadora.Subtracao(8,4))
    }

    @Test
    fun soma() {
        assertEquals(10, calculadora.Soma(5,5))
    }

    @Test
    fun multiplicacao() {
        assertEquals(36, calculadora.Multiplicacao(6, 6))
    }

    @Test
    fun divisao() {
        assertEquals(1, calculadora.Divisao(2,2))
    }

    @Test
    fun potencia() {
        assertEquals(64.0, calculadora.Potencia(8.0, 2.0))
    }

    @Test
    fun raizQuadrada() {
        assertEquals(2.0, calculadora.RaizQuadrada(4.0))
    }
}