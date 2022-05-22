fun main() {
    val listOfString = readln()
    println(countSmallLetterA(listOfString))
}

fun countSmallLetterA(str: String): Double {
    val str2 = str.replace("\\s".toRegex(),"")
    val oldLength = str2.length.toDouble()
    str2.map {
        if (it !in 'a'..'b') {
            return -1.0
        }
    }
    println(str2)
    val newLength = str2.replace("b".toRegex(), "").length.toDouble()
    return String.format("%.1f",((newLength/oldLength)*100)).toDouble()
}