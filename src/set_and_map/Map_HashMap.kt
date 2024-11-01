package set_and_map

fun main() {
    // Immutable Map
    val map: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3)

    // Mutable Map
    val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2, "three" to 3)

    println(map)
    val value2 = map["one"] // 1

    mutableMap["four"] = 4 // mutable map only
    mutableMap.remove("two") // mutable map only

    for ((key, value) in mutableMap) {
        println("$key = $value")
    }

}