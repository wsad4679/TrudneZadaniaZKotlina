package com.example.trudnezadaniazkotlina

class Book(val author : String, val year : Int, val title : String){

    constructor() : this("Unknown", 0, "No title")
}




object FavoriteBooks{
    private val bookList = mutableListOf<Book>()

    fun addBook(inputAuthor : String, inputYear: String, inputTitle: String){
        bookList.add(Book(inputAuthor, inputYear.toInt(), inputTitle))
    }

    fun filterBooks(option : String){

        when (option) {
            "author" -> {
                print("podaj imie autora jakiego książki chesz wyświetlić: ")
                val authorName : String = readln()
                val filteredBooks = bookList.filter { it.author == authorName}
                filteredBooks.forEach { it -> println("Autor: ${it.author}, tytuł: ${it.title}, rok: ${it.year}") }
            }
            "year" -> {
                print("podaj rok z jakiego książki chesz wyświetlić: ")
                val inputBookYear : String = readln()
                val bookYear : Int = inputBookYear.toInt()
                val filteredBooks = bookList.filter { it.year== bookYear}
                filteredBooks.forEach { it -> println("Autor: ${it.author}, tytuł: ${it.title}, rok: ${it.year}") }
            }
            else -> {
                println("Brak wyboru filtrownia")
            }
        }

    }

    fun sortBooks(option: String){

        when (option)
        {
            "title" -> bookList.sortedBy { it.author }.forEach{ it -> println("Autor: ${it.author}, tytuł: ${it.title}, rok: ${it.year}") }

                "all" -> bookList.forEach { it -> println("Autor: ${it.author}, tytuł: ${it.title}, rok: ${it.year}") }

            else -> println("Nie wybrano metody sortowania")
        }
    }
}


fun main(){


    while (true)
    {
        println("Dodaj książkę: add, Filtruj książki: filter, Sortuj książki: sort, Zakończ program: end")
        val choice : String = readln()
        when (choice) {
            "add" -> {
                print("Podaj imie autora: ")
                val inputAuthor : String = readln()
                print("Podaj tytuł: ")
                val inputTitle : String = readln()
                print("Podaj rok wydania: ")
                val inputYear : String = readln()
                FavoriteBooks.addBook(inputAuthor, inputYear, inputTitle)

            }


            "filter" -> {
                println("Filtruj po autorze: author, Filtruj po roku wydania: year")
                val option : String = readln()
                FavoriteBooks.filterBooks(option)

            }
            "sort" -> {
                println("Sortuj po tytule: title, Wyświetl wszytskie: all")
                val option : String = readln()
                FavoriteBooks.sortBooks(option)

            }
            else -> break

        }
    }

}