package com.example.trudnezadaniazkotlina

import kotlin.math.max

class Match(val matchName : String, var matchScore : Int){
    constructor() : this ("unknown", 0)
}

object MatchPlayed
{
    val matchList = mutableListOf<Match>()

    fun addMatch(){
        println("Podaj nazwe meczu ktory chcesz dodac: ")
        val inputMatch: String = readln()

        println("Podaj wynik")
        val inputScore: String = readln()

        matchList.add(Match(inputMatch, inputScore.toInt()))
        println("Dodano mecz do listy")
    }

    fun filter(){
        println("Podaj wynik: ")
        val pointTreshold: String = readln()


        val filteredMatch = matchList.filter { it -> it.matchScore >= pointTreshold.toInt() }
        println("mecze powyzej $pointTreshold punktow")
        filteredMatch.forEach{it -> println("Mecz: ${it.matchName}, Wynik: ${it.matchScore}") }
    }

    fun addBonusPoints(){

        println("Podaj nazwe meczu ktoremu chcesz dodac bonusowe punkty: ")
        val inputMatch: String = readln()

        println("Podaj wynik")
        val bonusPoints: String = readln()

        val indexOfMatch = matchList.indexOfFirst { it -> it.matchName == inputMatch }

        if (indexOfMatch == -1)
        {
            println("Taki mecz nie istnieje")
        }
        else
        {
            matchList[indexOfMatch].matchScore += bonusPoints.toInt()
            println("Dodano bonusowe punkty")
        }
    }

    fun sumScore(){
        val score = matchList.map { it -> it.matchScore }.reduce{acc, element -> acc + element}
        println("Wszystkie zdobyte punkty przez druzyne: $score")
    }

    fun highestScore(){
        val highScore = matchList.map { it -> it.matchScore }.max()
        println("Najwyzszy wynik uzyskany przez druzyne: $highScore")

    }

    fun biggestDif(){
        val highScore = matchList.map { it -> it.matchScore }.max()
        val lowScore = matchList.map { it -> it.matchScore }.min()
        val pointsDiff  = highScore - lowScore
        println("Roznica miedzy najwyzszym a najnizszym wynikiem to: $pointsDiff")
    }

    fun countFilter(){
        println("Podaj wynik: ")
        val pointTreshold: String = readln()

        val filteredMatch = matchList.filter { it -> it.matchScore >= pointTreshold.toInt() }
        val matchCount = filteredMatch.count()
        println("Liczba meczy w ktorych druzyna uzyskala wiecej punktow niz: $pointTreshold to: $matchCount")
    }


}





fun main(){


    while (true){
        println("Wybierz co chcesz zrobic: Dodaj mecz: add, Dodaj bonusowe punkty: bonus, Mecze powyzej punktow: filter, Wszystkie punkty uzyskane: sum, Najwyzszy wynik: max, Najwieksza roznica: diff, Ilosc meczy powyzej: count, Zakoncz program: end")
        val operation: String = readln()

        if(operation == "end" || operation =="")
        {
            break
        }
        else
        {
            when (operation)
            {
                "add" -> MatchPlayed.addMatch()
                "bonus" -> MatchPlayed.addBonusPoints()
                "filter" -> MatchPlayed.filter()
                "sum" -> MatchPlayed.sumScore()
                "max" -> MatchPlayed.highestScore()
                "diff" -> MatchPlayed.biggestDif()
                "count" -> MatchPlayed.countFilter()
            }

        }
    }


}