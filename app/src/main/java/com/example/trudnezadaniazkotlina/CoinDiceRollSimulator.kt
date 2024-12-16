package com.example.trudnezadaniazkotlina

interface RollingTool{
    fun roll()
}

class Coin : RollingTool{

        override fun roll(){
            val coinThrow: Int = (1..2).random()
            if (coinThrow == 1){
                println("Rzut monetą: orzeł")
            }
            else{
                println("Rzut monetą: reszka")
            }
        }

}

class Dice : RollingTool{
    override fun roll(){
        val diceRoll: Int = (1..6).random()
        println("Twoja kostka wylosowała: $diceRoll")
    }
}

fun main(){
    while (true){
        println("Rzut monetą: C, Rzut kostką: D, Zakończenie programu: E: ")
        val dzialanie: String = readln()

        if (dzialanie == "C")
        {
            val coinThrow = Coin()
            coinThrow.roll()
        }

        else if(dzialanie == "D")
        {
            val diceThrow = Dice()
            diceThrow.roll()
        }

        else
        {
            break
        }


    }
}
