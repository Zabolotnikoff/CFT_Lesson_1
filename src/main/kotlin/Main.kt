fun main() {
    val townName = getTownName()
    val temperature = getTemperature(townName)

    val townWeather = TownWeather(townName, temperature)
    println("В городе $townName сейчас " + getWeatherResult(townWeather) + "!")
}

private fun getTemperature(townName: String): Int {
    println(
        "В городе $townName? Отличный город! \nКакая температура сейчас в городе $townName?"
    )
    return readLine()?.toIntOrNull() ?: throw error("Укажите температуру в виде целого числа!")
}

private fun getTownName(): String {
    println(
        "Привет! В каком городе ты находишься?"
    )
    return readLine() ?: throw error("Укажите название Вашего города!")
}

fun getWeatherResult(townWeather: TownWeather): String {
    return when (townWeather.temperature) {
        in -50..14 -> "холодно"
        in 15..24 -> "нормально"
        in 25..50 -> "жарко"
        else -> "катастрофа"
    }
}
