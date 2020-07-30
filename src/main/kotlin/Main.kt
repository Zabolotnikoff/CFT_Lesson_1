fun main() {
    val townName = getTownName()
    val temperature = getTemperature(townName)

    val townWeather = TownWeather(townName, temperature)

    printTownWeatherResult (townWeather)
}

private fun getTemperature(townName: String): Int {
    println(
        "В городе $townName? Отличный город! \nКакая температура сейчас в городе $townName?"
    )
    return readLine()?.toIntOrNull() ?: throw error("Укажите температуру в виде целого числа!")
}

private fun getTownName(): String {
    var townName: String
    println(
        "Привет! В каком городе ты находишься?"
    )
    do {
        townName = readLine() ?: throw error("Укажите название Вашего города!")
    } while (townName.length == 0)

    return townName
}

fun getWeatherResult(temperature: Int): String {
    return when (temperature) {
        in -50..14 -> "холодно"
        in 15..24 -> "нормально"
        in 25..50 -> "жарко"
        else -> "катастрофа"
    }
}

fun printTownWeatherResult (townWeather: TownWeather) {
    println("В городе ${townWeather.townName} сейчас " + getWeatherResult(townWeather.temperature) + "!")
}