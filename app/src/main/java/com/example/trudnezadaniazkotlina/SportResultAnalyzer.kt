package com.example.trudnezadaniazkotlina

class Match(val matchName : String, val matchScore : Int){
    constructor() : this ("unknown", 0)
}

object MatchPlayed
{
    val matchList = mutableListOf<Match>()

    fun addMatch(inputMatch: String, inputScore: Int){
        matchList.add(Match(inputMatch, inputScore))
        println("Dodano mecz do listy")
    }

    fun filter(pointTreshold : Int){

    }

    fun addBonusPoints(bonusPoints : Int){

    }

    fun sumScore(){

    }

    fun highestScore(){

    }

    fun biggestDif(){

    }

    fun countFilter(pointTreshold : Int){

    }


}





fun main(){

}