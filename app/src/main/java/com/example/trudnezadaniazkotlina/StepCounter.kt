package com.example.trudnezadaniazkotlina

object StepCounter{
    var counterSteps : Int= 0

    fun doStep(){
        counterSteps +=1
        println("Zrobiles krok")
    }

    fun resetSteps(){
        counterSteps = 0
        println("Zresetowales swoje kroki")
    }

    fun showSteps(){
        println("Zrobiles juz: $counterSteps krokow")
    }
}




fun main() {


    while (true)
    {
        println("Wybierz co chcesz zrobic: Zrob krok: step, Zresetuj kroki: reset, Pokaz kroki: show, Zakoncz program: end")
        val operation: String = readln()

        if(operation == "end" || operation =="")
        {
            break
        }
        else
        {
            when (operation)
            {
                "step" -> StepCounter.doStep()
                "reset"-> StepCounter.resetSteps()
                "show"->StepCounter.showSteps()
            }

        }




    }




}

