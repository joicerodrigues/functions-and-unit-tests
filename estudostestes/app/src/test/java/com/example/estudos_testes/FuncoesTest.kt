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
    fun returnArrayFirst(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(4)
        teste.add(5)
        teste.add(6)
        teste.add(7)
        teste.add(8)
        val resultActual = functionsTest.returnArray(8,4)
        assertEquals(teste, resultActual)
    }


    @Test
    fun returnArraySecond(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(4)
        teste.add(5)
        teste.add(6)
        teste.add(7)
        teste.add(8)
        val resultActual = functionsTest.returnArray(4,8)
        assertEquals(teste, resultActual)
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
    fun returnArrayTwoFirst(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(2)
        teste.add(3)
        teste.add(4)
        teste.add(5)
        val resultActual = functionsTest.returnArrayTwo(5,2)
        assertEquals(teste, resultActual)
    }

    @Test
    fun returnArrayTwoSecond(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(2)
        teste.add(3)
        teste.add(4)
        teste.add(5)
        val resultActual = functionsTest.returnArrayTwo(2,5)
        assertEquals(teste, resultActual)
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
    fun returnArrayThirdFirst(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(3)
        teste.add(4)
        teste.add(5)
        val resultActual = functionsTest.returnArrayThird(3,5)
        assertEquals(teste, resultActual)
    }

    @Test
    fun returnArrayThirdSecond(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(3)
        teste.add(4)
        teste.add(5)
        val resultActual = functionsTest.returnArrayThird(5,3)
        assertEquals(teste, resultActual)
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
        teste.add(1)

        val qtd = ArrayList<Int>()
        // adding elements
        qtd.add(1)
        qtd.add(1)

        val ResultFinal = listOf("$qtd  =   2")

        val resultActual = functionsTest.returnRepeated(teste,1)
        assertEquals(ResultFinal, resultActual)
    }

    @Test
    fun returnRepeatedNoRepeated(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(5)
        teste.add(4)
        teste.add(3)
        teste.add(5)
        teste.add(5)
        val qtd = ArrayList<Int>()
        // adding elements
        qtd.add(5)
        qtd.add(5)
        qtd.add(5)

        val ResultFinal = listOf("$qtd  =   3")

        val resultActual = functionsTest.returnRepeated(teste,5)
        assertEquals(ResultFinal, resultActual)
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


    @Test
    fun returnBooleanTwoV2Null(){
        //val resultActual = functionsTest.returnBooleanTwoV2(null)
        //assertEquals(false, resultActual)
    }


    @Test
    fun returnArrayBooleanisTrue(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(1)
        teste.add(2)
        teste.add(3)
        teste.add(4)

        val resultActual = functionsTest.returnArrayBooleanTrueorFalse(teste)
        assertEquals(true, resultActual)
    }

    @Test
    fun returnArrayBooleanisFalse(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(6)
        teste.add(4)
        teste.add(3)
        teste.add(5)

        val resultActual = functionsTest.returnArrayBooleanTrueorFalse(teste)
        assertEquals(false, resultActual)
    }

    @Test
    fun returnDivision(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(9)
        teste.add(0)
        teste.add(6)
        teste.add(2)

        val resultFinal = ArrayList<Int>()
        // adding elements
        resultFinal.add(6)
        resultFinal.add(2)

        val resultActual = functionsTest.returnDivision(teste,2)
        assertEquals(resultFinal, resultActual)
    }

    @Test
    fun returnDivisionOdd(){
        val teste = ArrayList<Int>()
        // adding elements
        teste.add(9)
        teste.add(0)
        teste.add(45)
        teste.add(90)

        val resultFinal = ArrayList<Int>()
        // adding elements
        resultFinal.add(9)
        resultFinal.add(45)
        resultFinal.add(90)

        val resultActual = functionsTest.returnDivision(teste,9)
        assertEquals(resultFinal, resultActual)
    }

}