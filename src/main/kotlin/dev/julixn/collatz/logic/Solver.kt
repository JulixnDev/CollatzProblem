package dev.julixn.collatz.logic

/**
 *
 * @author Julian Salfeld
 * Created on 29.08.2022 17:45
 * Project: CollatzProblem
 */
class Solver {

    fun solveAndGetStepCount(number: Long): Int {
        val numberList = ArrayList<Long>(listOf(number))
        var prevLastNumber: Long
        var lastNumber: Long = number

        println("CollatzProblem -> Starting at $number")

        while (!isInLoop(numberList.toTypedArray())) {
            prevLastNumber = lastNumber
            lastNumber = getNextNumber(lastNumber)
            numberList.add(lastNumber)
            println("CollatzProblem -> Last: $lastNumber")
            if (lastNumber == prevLastNumber) {
                println("CollatzProblem -> Error")
                break
            }
        }

        return numberList.size
    }

    private fun getNextNumber(current: Long): Long {
        if (current % 2 == 0L) {
            return current / 2
        } else {
            return (3 * current) + 1
        }
    }

    private fun isInLoop(array: Array<Long>): Boolean {
        if (array.size <= 5) return false

        val lastNumberCorrect = array[array.size - 1] == 1L
        val secondLastNumberCorrect = array[array.size - 2] == 2L
        val thirdLastNumber = array[array.size - 3] == 4L
        val fourthLastNumberCorrect = array[array.size - 4] == 1L

        return (lastNumberCorrect && secondLastNumberCorrect && thirdLastNumber && fourthLastNumberCorrect)
    }

}