
private  var number:Int? = null
private var i:Int = 0
fun main() {
   val y = number?.let {// return what in the last line
        val x = it + 1
       x
    } ?: 3 // use elvis operator as else number is equals to null

   var n = number.apply {// returns the object was called on after modifications
        arrayOf("")
        hashCode()
    }

    fun getSquaredI() = (i * i).also { // return the object that was called on
        i++
    }
}