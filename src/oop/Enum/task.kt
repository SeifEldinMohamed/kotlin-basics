package oop.Enum

enum class EducationLevel(val description: String) {
    PRIMARY("Primary Education") {
        override fun ageRange() = "6-11 years"
    },
    SECONDARY("Secondary Education") {
        override fun ageRange() = "12-18 years"
    },
    TERTIARY("Tertiary Education") {
        override fun ageRange() = "18+ years"
    };

    abstract fun ageRange(): String
}

fun main() {
    val currentLevel = EducationLevel.PRIMARY
    println("Level: ${currentLevel.description}, Age Range: ${currentLevel.ageRange()}")

    for (level in EducationLevel.values()) {
        println("Level: ${level.description}, Age Range: ${level.ageRange()}")
    }
}