package com.example.estudos_testes

import kotlin.collections.ArrayList

class Funcoes {

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
    fun returnArray(firstValue: Int?, secondValue: Int?): String? {
        val numbers: MutableList<Int> = mutableListOf()
        if (firstValue != null && secondValue != null) {
            if (firstValue >= secondValue) {
                for (i in secondValue..firstValue) {
                    numbers.add(i)
                }
            } else {
                for (i in firstValue..secondValue) {
                    numbers.add(i)
                }
            }
                return numbers.toString()
        } else {
            return null
        }
        return numbers.toString()
    }

    /**
     * versão com forEach com lambda= {}
     * @return retorna uma lista em ordem crescende de fisrtValue até secondValue e vice e versa
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     * @param secondValue: recebe um inteiro como parametro podende ser null ou nao
     */
    fun returnArrayTwo(firstValue: Int?, secondValue: Int?): String? {
        val numbers: MutableList<Int> = mutableListOf()
        if(firstValue != null && secondValue != null ){

            (firstValue..secondValue).forEach {
                numbers.add(it)
            }
        }else {
            return null
        }
            return numbers.toString()
    }

    /**
     * versão com toList()
     * @return retorna uma lista em ordem crescende de fisrtValue até secondValue e vice e versa
     * @param firstValue: recebe um inteiro como parametro podendo ser null ou nao
     * @param secondValue: recebe um inteiro como parametro podende ser null ou nao
     */
    fun returnArrayThird(firstValue: Int?, secondValue: Int?): String?{
        val numbers: MutableList<Int> = mutableListOf()
        if(firstValue != null && secondValue != null){
            (firstValue..secondValue).toList().forEach { //gambis
                numbers.add(it)
            }
        }else{
            return null
        }
        return numbers.toString()
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
        if(array != null) {
            return array == sortedDesc
        }else {
            return null
        }
    }

    /**
     * Escreva uma função que recebe um array de inteiros e
     * um inteiro como parâmetro, e retorne um array com todos
     * os elementos que se repetem no minimo um numero de vzes igual
     * ao segundo parâmetro // Ex: recebe [1,2,3,1,1,2,3,2] e 3, e
     * retorna [1,2]
     */
    fun returnRepeated(array: ArrayList<Int>, a: Int): Int {
        var qtd = 0
        for (i in array){
            val teste = array.filter { a == i }
            if (teste == array) {
                qtd += 1
            }
        }
        return qtd
    }

    fun returnSum(array: ArrayList<Int>): Int {
        var sum = 0
        for (i in array){
                sum += i
        }
        return sum
    }

}
