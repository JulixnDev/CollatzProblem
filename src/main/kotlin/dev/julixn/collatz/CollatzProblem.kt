package dev.julixn.collatz

import dev.julixn.collatz.logic.Solver

/**
 *
 * @author Julian Salfeld
 * Created on 29.08.2022 17:44
 * Project: CollatzProblem
 */
class CollatzProblem {

    private val solver = Solver()

    fun startup() {
        val number: Long = 33

        println("CollatzProblem -> Starting...")
        println("CollatzProblem -> $number was solved in ${solver.solveAndGetStepCount(number)} steps.")
    }

}