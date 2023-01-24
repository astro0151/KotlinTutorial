/**
 * ----------------------------------ARRAY IN KOTLIN---------------------------------------------------------------
 *   Note:> Arrays are used to store multiple values in a single variable,
 *           instead of creating separate variables for each value.
 *           >To create an array, use the arrayOf() function
 *           --> var arr= arrayOf(1,2,3,4,5)
 *           You can access an array element by referring to the index number, inside square brackets.
 */

  fun main(){
       val arr = arrayOf('a','b','c')
    println(arr[1])
    arr[1]='c'
    println(arr[1])
    println(arr.size)
    forLoop()
  }
/*-------------------------------------FOR LOOP------------------------------------------
  Note:> Unlike Java and other programming languages, there is no traditional for loop in Kotlin.
          >In Kotlin, the for loop is used to loop through arrays, ranges, and
          other things that contains a countable number of values.

 */

fun forLoop(){
    var arr= arrayOf("mr.","ali","gulbahar","and","sarah","babe")
    for(x in arr) {
        print(x+" ")
    }
}