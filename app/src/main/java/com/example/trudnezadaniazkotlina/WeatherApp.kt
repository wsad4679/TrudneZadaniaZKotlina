package com.example.trudnezadaniazkotlina

interface Weather
{
    fun showWeather() : String
}

object Sunny : Weather {
    override fun showWeather() : String{
        return "jest slonecznie"
    }
}

object Rainy : Weather {
    override fun showWeather() : String{
        return "pada deszcz"
    }
}

object Cloudy : Weather {
    override fun showWeather() : String{
        return "jest pochmurnie"
    }
}

object Snowy : Weather {
    override fun showWeather() : String{
       return "pada snieg"
    }
}


data class City(val cityName : String, val weather : Weather){
    override fun toString(): String {
        return "W $cityName dzisiaj ${weather.showWeather()}"
    }
}

fun main (){
    val szczecin = City("Szczecin", Rainy)
    val olsztyn = City("Olsztyn", Sunny)
    val warszawa = City("Warszawa", Cloudy)
    val gdynia = City("Gdynia", Snowy)
    val cityList = listOf<City>(szczecin, olsztyn, warszawa, gdynia)
    println("Lista miast do wyboru")
    cityList.forEach{it -> print(it.cityName+", ") }
    println("W jakim mieście chcesz zobaczyć pogode: ")
    val inputCity = readln()
    println(cityList[cityList.indexOfFirst { it -> it.cityName == inputCity }])
}