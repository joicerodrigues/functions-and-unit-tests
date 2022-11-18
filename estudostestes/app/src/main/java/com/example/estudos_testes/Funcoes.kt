package com.example.estudos_testes

import kotlin.collections.ArrayList

class Funcoes() {

    /**
     * versão com exception
     * @return o valor da multiplicação dos parametros firstValue e secondValue
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     * @param secondValue: recebe um inteiro como parametro podende ser null ou nao
     * @return se os parametros receberem null, a função irá trazer uma exception
     * @exception MultiplicacaoException: execption espressifica para a exception null do multiplicação
     */
    fun multiplicacao(firstValue: Int?, secondValue: Int?): Int {
        if (firstValue == null || secondValue == null) {
            throw MultiplicacaoException()
        }
        return firstValue * secondValue
    }

    /**
     * versão com exception
     * @return o valor da multiplicação dos parametros firstValue e secondValue
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     * @param secondValue: recebe um inteiro como parametro podende ser null ou nao
     * @return se os parametros receberem null, a função irá retornar null
     */
    fun multicacaoNull(firstValue: Int?, secondValue: Int?): Int? {
        if (firstValue == null || secondValue == null) {
            return null
        }
        return firstValue * secondValue
    }

    /**
     * versão com array
     * @return retorna a palavra easy repetidamente = o valor do parametro firstValue
     * só ocorre somente se o parametro receber um valor par
     * @return se firstValue recebe null a função irá retornar null
     * @return se firstValue receber ímpar a função irá retornar null
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     */

    fun returnEasy(firstValue: Int?): String? {
        val txt = "easy"
        val txtArray: ArrayList<String> = ArrayList()
        if (firstValue != null && firstValue % 2 == 0) {
            for (i in 1..firstValue) {
                txtArray.add(txt)
            }
        } else {
            return null
        }
        return txtArray.toString()
    }

    /**
     * versão com string
     * @return retorna uma lista repetindo "easy" de acordo com o inteiro passado como parametro
     * @return se firstValue recebe null a função retorna null
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     * */

    fun returnEasyString(firstValue: Int?): String? {
        var txt = ""
        if (firstValue != null && firstValue % 2 == 0) {
            for (i in 1..firstValue) {
                //txt = "easy$txt"
                txt += "easy"
            }
        } else {
            return null
        }
        return txt
    }

    /**
     * versão inicial com for
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     * @param secondValue: recebe um inteiro como parametro podende ser null ou nao
     */
    fun returnArray(firstValue: Int?, secondValue: Int?): MutableList<Int>? {
        val numbers: MutableList<Int> = mutableListOf()
        if (firstValue != null && secondValue != null) {
            if (firstValue < secondValue) {
                for (i in firstValue..secondValue) {
                    numbers.add(i)
                }
            } else {
                for (i in secondValue..firstValue) {
                    numbers.add(i)
                }
            }
            return numbers
        } else {
            return null
        }
    }

    /**
     * versão com forEach com lambda= {}
     * @return retorna uma lista em ordem crescende de fisrtValue até secondValue e vice e versa
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     * @param secondValue: recebe um inteiro como parametro podende ser null ou nao
     */
    fun returnArrayTwo(firstValue: Int?, secondValue: Int?): MutableList<Int>? {
        val numbers: MutableList<Int> = mutableListOf()
        if (firstValue != null && secondValue != null) {
            if (firstValue < secondValue) {
                (firstValue..secondValue).forEach {
                    numbers.add(it)
                }
            } else {
                (secondValue..firstValue).forEach {
                    numbers.add(it)
                }
            }
        } else {
            return null
        }
        return numbers
    }

    /**
     * versão com toList()
     * @return retorna uma lista em ordem crescende de fisrtValue até secondValue e vice e versa
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     * @param secondValue: recebe um inteiro como parametro podende ser null ou nao
     */
    fun returnArrayThird(firstValue: Int?, secondValue: Int?): MutableList<Int>? {
        val numbers: MutableList<Int> = mutableListOf()
        if (firstValue != null && secondValue != null) {
            if (firstValue < secondValue) {
                (firstValue..secondValue).toList().forEach { //gambis
                    numbers.add(it)
                }
            } else {
                (secondValue..firstValue).toList().forEach { //gambis
                    numbers.add(it)
                }
            }
        } else {
            return null
        }
        return numbers
    }


    //(1..thirdValue).toList()

//    (1..thirdValue).forEach {
//        numbers.add(it)
//    }
    /**
     * Escreva uma função que recebe um array de
     * inteiros com parametro, e retorna um bool que
     * indica se o array está em ordem crescente ou não
     * // Ex: recebe [2,1,3] e 6retorna false
     */
    fun returnBoolean(array: ArrayList<Int>?): Boolean? {
        val sortedDesc = array?.sorted() //ordenando do maior para o menor
        if (array != null) {
            return array == sortedDesc
        } else {
            return null
        }
    }

    fun returnArrayGrowing(array: ArrayList<Int>?): ArrayList<Int>? {
        //val teste = array
        var temp = ArrayList<Int>()
        temp.add(0)
        temp.add(0)
        temp.add(0)
        if (array != null) {
            if (array[0] > array[1]) {
                temp[0] = array[1]
                array[1] = array[0]
                array[0] = temp[0]
            }

            if (array[1] > array[2]) {
                temp[1] = array[2]
                array[2] = array[1]
                array[1] = temp[1]
            }

        }
        return array
    }

    fun returnArrayGrowingV2(listArray: ArrayList<Int>): ArrayList<Int> {
        //var teste = array
        var temp: Int
        for (i in 0..(listArray.size - 1)) {
            for (j in (listArray.size - 1)..0)
                if (listArray[i] < listArray[j]) {
                    temp = listArray[j]
                    listArray[j] = listArray[i]
                    listArray[i] = temp
                    //print(temp)
                }
        }

        return listArray

    }

    fun returnArrayBooleanTrueorFalse(listArray: ArrayList<Int>): Boolean {
        //print(listArray)
        for (i in 1..(listArray.size-1)) {
//            for (j in (listArray.size - 1) downTo 0)

            //   if (listArray[i] < listArray.size) { // esta comparando apenas a posição 4
//            {
//                if (listArray[i] < listArray[j]) {
//                    print(listArray[i])
//                    print(listArray[j])
//                    return true
//
//                } else if (listArray[i] < listArray[j]) {
//                    print(listArray[i])
//                    print(listArray[j])
//                    return false
//                }
//            }
            if (listArray[0] <= listArray[i]) {
                print(listArray[i])
                print(listArray[0])
                return true
            } else {
                return false
            }

        }
        return false
    }


    fun returnBooleanV2(array: ArrayList<Int>): Boolean {
        val arrayteste = array
        //val sortedDesc = returnBooleanTwoV2(array)
        if (array.equals(returnArrayGrowingV2(arrayteste))) {
            print(array)
            print(arrayteste)
            //print(sortedDesc)
            return true
        } else {
            return false
        }
    }

    /**
     * Escreva uma função que recebe um array de inteiros e
     * um inteiro como parâmetro, e retorne um array com todos
     * os elementos que se repetem no minimo um numero de vzes igual
     * ao segundo parâmetro // Ex: recebe [1,2,3,1,1,2,3,2] e 3, e
     * retorna [1,2]
     */
    fun returnRepeated(array: ArrayList<Int>, a: Int): List<String> {
        var qtd = ArrayList<Int>()
        var testes = 0
        var tester = listOf("")
        for (i in array) {
            val teste = array.filter { a == i }
            if (teste == array) {
                qtd.add(i) //+= 1
                testes += 1
                tester = listOf("$qtd  =   $testes")
            }
        }
        return tester
    }

    fun returnSum(array: ArrayList<Int>): Int {
        var sum = 0
        for (i in array) {
            sum += i
        }
        return sum
    }

    fun returnDivision(array: ArrayList<Int>?, a: Int?): ArrayList<Int>? {
        val resultFinal = ArrayList<Int>()
        if (array != null && a != null) {
            for (i in 0..array.size - 1) {
                if (array[i] % a == 0 && array[i] != 0)
                    resultFinal.add(array[i])
            }
        }else{
            return null
        }
        return resultFinal
    }
}


