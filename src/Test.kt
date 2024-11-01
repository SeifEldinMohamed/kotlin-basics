fun main() {
    // println(CodelandUsernameValidation("_Seif"))
    println(firstFactorial(9))
}

fun CodelandUsernameValidation(str: String): Boolean {
    val regex = "^(?=.{4,25}\$)[a-zA-Z][\\w_]*(?!_)\$".toRegex()
    return regex.matches(str)
}

fun LongestWord(sen: String): String {

    // code goes here
    val newSen = sen.replace(Regex("[^A-Za-z0-9 ]"), "")
    val wordList = newSen.split(" ")
    var topWordLength = 0
    var topWordPos = 0

    wordList.forEachIndexed { index, string ->
        if (string.length > topWordLength) {
            topWordLength = string.length
            topWordPos = index
        }
    }
    return wordList[topWordPos]
}

fun firstFactorial(num: Int): Int {
    var factorialValue = num
    for (i in num-1 downTo 1) {
        factorialValue *= i
    }
    return factorialValue

}
