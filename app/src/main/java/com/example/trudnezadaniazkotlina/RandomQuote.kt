package com.example.trudnezadaniazkotlina

object Quotes{

    val quotesList = mutableListOf("Nie czekaj na idealny moment, weź ten moment i spraw, by był idealny. – „Anonim”",
        "Nie zmieniaj siebie, by zadowolić innych. Zmieniaj się, by być lepszym dla siebie. – „Anonim”",
        "Siła nie pochodzi z wygranej. Twoje zmagania rozwijają Twoje największe atuty. – „Arnold Schwarzenegger”",
        "Każdy dzień to nowa szansa na to, by stać się lepszym. – „Anonim”",
        "Szczęście nie jest czymś gotowym. To zależy od twoich działań. – „Dalajlama”",
        "Jeśli nie podejmujesz ryzyka, to nic się nie zmieni. – „Anonim”",
        "Zwycięzcy nigdy się nie poddają, a ci, którzy się poddają, nigdy nie wygrywają. – „Vince Lombardi”",
        "Życie jest zbyt krótkie, by marnować czas na rzeczy, które nie mają znaczenia. – „Anonim”",
        "Nie ważne, jak powoli idziesz, ważne, byś się nie zatrzymywał. – „Konfucjusz”",
        "Tylko ci, którzy podejmują ryzyko pójścia za daleko, mogą dowiedzieć się, jak daleko mogą dojść. – „T.S. Eliot”")

    fun getRandomQuote(){
        val randomQuote = quotesList.random()
        println("Twój losowy cytat: $randomQuote")
    }

    fun addQuote(inputQuote: String){
        quotesList.add(inputQuote)
        println("Cytat został dodany.")
    }

}


fun main(){
    while(true) {
        println("Wylosuj cytat: rand, Dodaj cytat: add, Zakończ program: end")
        val choice: String = readln()

        if (choice == "rand")
        {
            Quotes.getRandomQuote()
        }

        else if (choice == "add")
        {
            print("Podaj cytat który chcesz dodać: ")
            Quotes.addQuote(inputQuote = readln())
        }

        else {
            break
        }
    }


}