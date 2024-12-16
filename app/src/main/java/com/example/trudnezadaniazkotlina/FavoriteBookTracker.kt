package com.example.trudnezadaniazkotlina

class Book(val author : String, val year : Int, val title : String){

    constructor() : this("Unknown", 0, "No title")
}




object FavoriteBooks{
    private val bookList = mutableListOf<Book>()

    fun addBook(inputAuthor : String, inputYear: Int, inputTitle: String){
        bookList.add(Book(inputAuthor, inputYear, inputTitle))
    }

    fun filterBooks(option : String){

        when (option) {
            "author" -> {
                print("podaj imie autora jakiego książki chesz wyświetlić: ")
                val authorName : String = readln()
                val filteredBooks = bookList.filter { it.author == authorName}
                println(filteredBooks)
            }
            "year" -> {
                print("podaj rok z jakiego książki chesz wyświetlić: ")
                val inputBookYear : String = readln()
                val bookYear : Int = inputBookYear.toInt()
                val filteredBooks = bookList.filter { it.year== bookYear}
                println(filteredBooks)
            }
            else -> {
                println("Brak wyboru filtrownia")
            }
        }

    }

    fun sortBooks(option: String){

    }
}


fun main(){

}