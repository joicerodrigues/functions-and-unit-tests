package com.example.estudos_testes

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FuncoesTest {
   @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    //@Mock
    //lateinit var functionsTest: funcoes

    //mock class
    // val functionsTest = mock(funcoes::class.java)

    val functionsTest = Funcoes()

    @Test
    fun multiplicacaoTest() {
        val resultActual = functionsTest.multiplicacao(2, 2)
        assertEquals(4, resultActual)
    }

    @Test(expected = MultiplicacaoException::class)
    fun multiplicacaoTestWhenNull() {
        functionsTest.multiplicacao(null, null)
    }

    @Test
    fun multiplicacaoNull(){
       val resultActual = functionsTest.multicacaoNull(null, null)
        assertEquals(null, resultActual)
    }
    @Test

    fun multiplicacaoNotNull(){
        val resultActual = functionsTest.multiplicacao(2, 2)
        assertEquals(4, resultActual)
    }

    @Test
    fun returnEasyOdd() {
        val resultActual = functionsTest.returnEasy(5)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnEasyPair(){
        val resultActual = functionsTest.returnEasy(2)
        assertEquals("[easy, easy]", resultActual)
    }

    @Test
    fun returnEasyNull(){
        val resultActual = functionsTest.returnEasy(null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnEasyStringPair(){
        val resultActual = functionsTest.returnEasyString(2)
        assertEquals("easyeasy", resultActual)
    }

    @Test
    fun returnEasyStringOdd(){
        val resultActual = functionsTest.returnEasyString(1)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnEasyStringNull(){
        val resultActual = functionsTest.returnEasyString(null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArray(){
        val resultActual = functionsTest.returnArray(6,4)
        assertEquals("[4, 5, 6]", resultActual)
    }

    @Test
    fun returnArrayNullfirstValue(){
        val resultActual = functionsTest.returnArray(null,5)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArrayNullsecondValue(){
        val resultActual = functionsTest.returnArray(6,null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArrayNull(){
        val resultActual = functionsTest.returnArray(null,null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArrayTwo(){
        val resultActual = functionsTest.returnArrayTwo(5,2)
        assertEquals("[2, 3, 4, 5]", resultActual)
    }

    @Test
    fun returnArrayFirstValueNull(){
        val resultActual = functionsTest.returnArrayTwo(null,3)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArraySecondValueNull(){
        val resultActual = functionsTest.returnArrayTwo(3,null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArrayTwoNull(){
        val resultActual = functionsTest.returnArrayTwo(null, null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArrayThird(){
        val resultActual = functionsTest.returnArrayThird(3,5)
        assertEquals("[3, 4, 5]", resultActual)
    }

    @Test
    fun returnArrayThirdFirstValueNull(){
        val resultActual = functionsTest.returnArrayThird(null, 5)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArrayThirdSecondValueNull(){
        val resultActual = functionsTest.returnArrayThird(4, null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnArrayThirdNull(){
        val resultActual = functionsTest.returnArrayThird(null, null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnBooleanTrue(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(1)
        teste.add(2)
        teste.add(3)
        teste.add(4)
        teste.add(5)
        val resultActual = functionsTest.returnBoolean(teste)
        assertEquals(true, resultActual)
    }

    @Test
    fun returnBooleanFalse(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(1)
        teste.add(22)
        teste.add(3)
        teste.add(4)
        teste.add(5)
        val resultActual = functionsTest.returnBoolean(teste)
        assertEquals(false, resultActual)
    }

    @Test
    fun returnBooleanNull(){
        val resultActual = functionsTest.returnBoolean(null)
        assertEquals(null, resultActual)
    }

    @Test
    fun returnRepeated(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(1)
        teste.add(4)
        teste.add(3)
        teste.add(4)
        teste.add(4)
        val resultActual = functionsTest.returnRepeated(teste,4)
        assertEquals(3, resultActual)
    }

    @Test
    fun returnRepeatedNoRepeated(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(1)
        teste.add(4)
        teste.add(3)
        teste.add(4)
        teste.add(4)
        val resultActual = functionsTest.returnRepeated(teste,3)
        assertEquals(1, resultActual)
    }

    @Test
    fun returnSum(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(1)
        teste.add(2)
        teste.add(3)
        val resultActual = functionsTest.returnSum(teste)
        assertEquals(6, resultActual)
    }
//
//    @Test
//    fun returntralalala(){
//        val teste = ArrayList<Int>()
//        // adding elements
//        teste.add(1)
//        teste.add(2)
//        teste.add(3)
//        val resultActual = functionsTest.returntralalala(teste,2)
//        assertEquals(6, resultActual)
//    }
}