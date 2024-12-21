package com.example.trudnezadaniazkotlina

import com.example.trudnezadaniazkotlina.TrueFalse.answerTrueFalse
import com.example.trudnezadaniazkotlina.TrueFalse.questionTrueFalse

interface Question{

    fun askQuestion():Int

    fun checkAnswer(): Int
}


object TrueFalse : Question{
    val questionTrueFalse = listOf("Slon afrykanski jest wiekszy od slonia indyjskiego. (Prawda/Falsz)",
        "Merkury jest najblizsza planeta slonca. (Prawda/Falsz)",
        "2+2=5. (Prawda/Falsz)",
        "Snieg jest zawsze bialy. (Prawda/Falsz)",
        "Amazonka jest najdluzsza rzeka swiata. (Prawda/Falsz)")
    val answerTrueFalse = mutableListOf<String>("Prawda", "Prawda", "Falsz", "Falsz", "Falsz")
    val inputAnswer = mutableListOf<String>()
    override fun askQuestion(): Int {
        questionTrueFalse.forEach{
            it -> println(it)
            inputAnswer.add(readln())
        }
        return checkAnswer()
    }

    override fun checkAnswer(): Int {
        var i = 0
        var pointsTrueFalse = 0
        answerTrueFalse.forEach{
            it ->
            if(it == inputAnswer[i])
            {
                pointsTrueFalse ++
                i++
            }
            else
            {
                i++
            }
        }
        inputAnswer.clear()
        return pointsTrueFalse
    }

}

object MultipleChoice : Question{
    val questionMultipleChoice = listOf(
        "Kto jest autorem powieści '1984'?" +
                "\nA) George Orwell" +
                "\nB) Aldous Huxley" +
                "\nC) Ray Bradbury" +
                "\nD) J.R.R. Tolkien",

        "Jaki jest najwyższy szczyt na Ziemi?" +
                "\nA) Mount Everest" +
                "\nB) K2" +
                "\nC) Makalu" +
                "\nD) Kilimandżaro",

        "W którym roku rozpoczęła się II wojna światowa?" +
                "\nA) 1914" +
                "\nB) 1939" +
                "\nC) 1941" +
                "\nD) 1945",

        "Jakie zwierzę jest nazywane 'królem dżungli'?" +
                "\nA) Tygrys" +
                "\nB) Lew" +
                "\nC) Słoń" +
                "\nD) Zebra",

        "Jaka jest stolica Japonii?" +
                "\nA) Seul" +
                "\nB) Tokio" +
                "\nC) Pekin" +
                "\nD) Bangkok"
    )

    val answerMultipleChoice = listOf("A", "A", "B", "B", "B")
    val inputAnswer = mutableListOf<String>()
    override fun askQuestion() : Int{
        questionMultipleChoice.forEach{
                it -> println(it)
                inputAnswer.add(readln())
        }
        return checkAnswer()
    }

    override fun checkAnswer() : Int{
        var i = 0
        var pointsMultipleChoice = 0
        answerMultipleChoice.forEach{
                it ->
            if(it == inputAnswer[i])
            {
                pointsMultipleChoice ++
                i++
            }
            else
            {
                i++
            }
        }
        inputAnswer.clear()
        return pointsMultipleChoice
    }

}


fun main(){


    while (true)
    {
        println("Wybierz co chcesz zrobic: Pytania prawda falsz: true/false, Pyatania wielokrotnego wyboru: abcd, Pytania prawda falsz i wielokrotnego wyboru: both Zakoncz program: end")
        val operation: String = readln()

        if(operation == "end" || operation =="")
        {
            break
        }
        else
        {
            when (operation)
            {
                "true/false" -> {
                    val score = TrueFalse.askQuestion()
                    println("Twoj wynik to: $score / ${TrueFalse.questionTrueFalse.count()}")
                }
                "abcd"-> {
                    val score = MultipleChoice.askQuestion()
                    println("Twoj wynik to: $score / ${MultipleChoice.questionMultipleChoice.count()}")
                }
                "both"->{
                    val score = MultipleChoice.askQuestion()
                    val score2 = TrueFalse.askQuestion()
                    println("Twoj wynik to: ${score + score2} / ${MultipleChoice.questionMultipleChoice.count() + TrueFalse.questionTrueFalse.count()}")

                }
            }

        }

    }
}