/*
----------------------------Type Casting/Conversion of data type------------------
Note:>  type conversion in kotlin is not same like java, its different......
      > to convert any data type into different we have to use the in-built functions in kotlin
      type conversion functions:-
    :>To convert a numeric data type to another type, you must use one of the following functions:
      1. toByte()
      2. toShort()
      3. toInt()
      4. toLong()
      5. toFloat()
      6. toDouble()
      7. toChar()
 */
fun typeCasting(){
    var a= "1141"
    println("var a is string type : $a")
    var b = a.toInt();
    println("now $a is integer type output")

    var str= "ali"    /// Tip:> var in kotlin behave same like let in javascript......
 //   var inte=str.toInt()  /// err becoz a string with chars can not be converts into integer number,
   // println(inte)
     str = "ali_baba"
    println(str)
}
// the main function can be written at top of all function or bottom or in anywhere in program
// but recommended is at the end of the program................
// Note:> remember we need main() function in our program, it is compulsory..........
fun main(){
    typeCasting()
}