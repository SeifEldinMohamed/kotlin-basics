import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*
import javax.swing.text.View


fun main() {


//    val calendar = Calendar.getInstance()
//    println(calendar.toString())
//    val currentDate = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Date())
//    println(currentDate)
//    val day = "17"
//    val month = "1"
//    val year = "2022"
//    if (calendar.get(Calendar.MONTH).toString() == month &&
//            calendar.get(Calendar.DAY_OF_MONTH).toString() == day &&
//            calendar.get(Calendar.YEAR).toString() == year){
//        println("update day came")
//    }
//    val tommorow =  Calendar.getInstance()
//    println(Calendar.DATE)
//    tommorow.add(Calendar.DATE, 7)
//    println(tommorow.get(Calendar.DAY_OF_MONTH))
//    println(SimpleDateFormat("EEEE", Locale("ar")).format(tommorow.time))

//    val currentDate = Calendar.getInstance()
//    val weekDate = ArrayList<MyDate>()
//    val daysOfWeek = ArrayList<String>()
//
//    for (i in 0..6 step 1) {
//        currentDate.add(Calendar.DATE, 1)
//        val day = currentDate.get(Calendar.DAY_OF_MONTH).toString()
//        val month = currentDate.get(Calendar.MONTH) + 1
//        val year = currentDate.get(Calendar.YEAR).toString()
//        weekDate.add(MyDate(day, month.toString(), year))
//        daysOfWeek.add(SimpleDateFormat("EEEE", Locale("ar")).format(currentDate.time))
//        println("${weekDate.toString()} \n ${daysOfWeek.toString()}")
//    }
//     currentDate.add(Calendar.DATE, 7)
//    val month = currentDate.get(Calendar.MONTH) + 1
//    val date = MyDate(
//            currentDate.get(Calendar.DAY_OF_MONTH).toString(),
//            month.toString(),
//            currentDate.get(Calendar.YEAR).toString()
//    )
//    println(date.toString())
//
//    val currenDate = Calendar.getInstance()
//    currentDate.set(2022, 3, 15)
//
//    for (i in 0..6 step 1) {
//           println(currenDate.get(Calendar.DATE))
//           println((SimpleDateFormat("EEEE", Locale("ar")).format(currentDate.time)))
//        currenDate.add(Calendar.DATE, 1)
//
//       }
//
//    val daysOfWeek = arrayOfNulls<String>(7)
//    val calendar = Calendar.getInstance()
//    calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
//    calendar.set(Calendar.WEEK_OF_MONTH, currentWeek)
//    for (i in 0..6) {
//        daysOfWeek[i] = changeDateFormat(LocalDate(calendar.time))
//        calendar.add(Calendar.DAY_OF_MONTH, 1)
//    }
//    println( daysOfWeek)

    // var currentDate: Calendar = Calendar.getInstance()


//    if (lastAzkarDay.currentDay == 31 && lastAzkarDay.currentMonth == 12) {
//        currentDate.set(
//                2023,
//                1,
//                1
//        )
//        println("31 and 12 ${currentDate.toString()}")
//
//    }
//
//    else if (lastAzkarDay.currentDay == 31) {
//        currentDate.set(
//                lastAzkarDay.currentYear,
//                lastAzkarDay.currentMonth,
//                lastAzkarDay.currentDay
//        )
//        println("31")
//    } else if ((lastAzkarDay.currentMonth == 11 ||
//                    lastAzkarDay.currentMonth == 9 ||
//                    lastAzkarDay.currentMonth == 6 ||
//                    lastAzkarDay.currentMonth == 4)
//            && lastAzkarDay.currentDay == 30
//    ) {
//        currentDate.set(
//                lastAzkarDay.currentYear,
//                lastAzkarDay.currentMonth,
//                lastAzkarDay.currentDay + 2
//        )
//        println( "30")
//    } else if (lastAzkarDay.currentMonth == 2 && lastAzkarDay.currentDay == 28) {
//        currentDate.set(
//                lastAzkarDay.currentYear,
//                lastAzkarDay.currentMonth,
//                lastAzkarDay.currentDay + 4
//        )
//        println("28 / 2")
//    } else if (lastAzkarDay.currentMonth == 2 && lastAzkarDay.currentDay == 29) {
//        currentDate.set(
//                lastAzkarDay.currentYear,
//                lastAzkarDay.currentMonth,
//                lastAzkarDay.currentDay + 3
//        )
//        println("29 / 2")
    //  } else {

    val lastAzkarDay = LastAzkarDay(
            5,
            4,
            2022
    )

    var date = LocalDate.now()
    date = date.plusDays(1L)

    //println("${date.dayOfMonth} - ${date.monthValue} - ${date.year}")

//    val weekDate = ArrayList<MyDate>()
//    val daysOfWeek = ArrayList<String>()
//
//    for (j in 0..600){
//        for (i in 0..6 step 1) {
//            val day = date.dayOfMonth.toString()
//            val month = date.monthValue.toString()
//            val year = date.year.toString()
//            println("$day - $month - $year")
//
//            weekDate.add(MyDate(day, month, year))
//            daysOfWeek.add(getDayNameInArabic(date.dayOfWeek.toString()))
//            date = date.plusDays(1L)
//        }
//    }
//
//    println( weekDate.toString())
//    println( daysOfWeek.toString())

//    val sdf = SimpleDateFormat("EEEE dd-MMM-yyyy")
//    for (i in 0..6) {
//        val calendar: Calendar = GregorianCalendar()
//        calendar.set(2022, 4, 21)
//        calendar.add(Calendar.DATE, i)
//        val day = sdf.format(calendar.time)
//        println(day)
//
//    }

//    val daysOfWeek = ArrayList<String>()
//    val month = 11
//    for (i in 1..7 step 1) {
//        val currentDate = GregorianCalendar()
//        currentDate.set( 2022, month, 31)
//        currentDate.add(Calendar.DATE, i)
//        val day = currentDate.get(Calendar.DAY_OF_MONTH).toString()
//        val month = currentDate.get(Calendar.MONTH) + 1
//        val year = currentDate.get(Calendar.YEAR).toString()
//        println("$day - $month - $year")
//        daysOfWeek.add(SimpleDateFormat("EEEE", Locale("ar")).format(currentDate.time))
//    println(daysOfWeek)
//    }//////////////////////////////////////////

//    val currentDate = GregorianCalendar()
//    currentDate.set(2022, 0, 3)
//        for (i in 0..6) {
//            currentDate.add(Calendar.DATE,1)
//}
//    println(currentDate.get(Calendar.DATE))
//    println(currentDate.get(Calendar.HOUR))
//    println(currentDate.get(Calendar.HOUR_OF_DAY))
//    println(currentDate.get(Calendar.WEEK_OF_YEAR))
//    println(currentDate.get(Calendar.WEEK_OF_MONTH))
//    println(currentDate.get(Calendar.DAY_OF_YEAR))





//    val format: DateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
//    val calendar = Calendar.getInstance()
//
//    val days= ArrayList<String>()
//    val daysName = ArrayList<String>()
//    for (i in 0..600){
//        for (i in 0..6) {
//            days.add(format.format(calendar.time))
//            daysName.add(SimpleDateFormat("EEEE", Locale("ar")).format(calendar.time))
//            calendar.add(Calendar.DAY_OF_MONTH, 1)
//
//        }
//        println(days.toString())
//        println(daysName.toString())
//    }
//    println(days.size) // 4207
    var mCalendarr: Calendar = Calendar.getInstance()
        getDatefromTodayToSevenDays(mCalendarr)



}

fun getDayNameInArabic(dayName:String): String {
    var dayNameInArabic = ""
    when(dayName){
        "FRIDAY" -> dayNameInArabic = "الجمعة"
        "SATURDAY" -> dayNameInArabic = "السبت"
        "SUNDAY" -> dayNameInArabic = "الأحد"
        "MONDAY" -> dayNameInArabic = "الاثنين"
        "TUESDAY" -> dayNameInArabic = "الثلاثاء"
        "WEDNESDAY" -> dayNameInArabic = "الأربعاء"
        "THURSDAY" -> dayNameInArabic = "الخميس"
    }
   return dayNameInArabic
}


data class LastAzkarDay(
        val currentDay:Int = 28,
        val currentMonth:Int = 1,
        val currentYear:Int = 2022
)

 fun getDatefromTodayToSevenDays(mCalendar: Calendar) {
     val dateList = ArrayList<String>()
     val dayList= ArrayList<String>()
     val mFormat: SimpleDateFormat = SimpleDateFormat("EEE,dd/MM/yyyy", Locale("ar"))

    for (i in 0..6) {
        // Add name of day and date to array
        val dateAndDayList: List<String> = mFormat.format(mCalendar.time).split(",")
        dateList.add(dateAndDayList[1])
        dayList.add(dateAndDayList[0])
        // Move next day
        mCalendar.add(Calendar.DAY_OF_MONTH, 1)
    }
     println(dateList)
     println(dayList)
}
