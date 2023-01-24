/**
 * -----------Strings in Kotlin-------------------------------------------------------------
 *  > Strings are used for storing text.
 *  > A string contains a collection of characters surrounded by double quotes:
 *    var name ="ali_baba"
 *    var lastName:String= "gulbahar"
 *
 *    Note:> String indexes start with 0.........
 *         > we can access string chars by giving index value[]
 *         var fChar = name[0]
 *         var lChar = name[strLength-1]
 *         print(fchar+ lChar)
 *
 *
 *   >A String in Kotlin is an object......
 *
 *   ____________________________STRING FUNCTIONS__________________________________________________________________________
 *   1. str.length  --> returns length of string
 *   2. str.toUpperCase() --> returns capitalized string all chars
 *   3. str.toLowerCase() --> returns small letters in string
 *   4. str.compareTo(string-to-compare) -- RETURNS 0 if equal
 *                                                    else negative value
 *   5. str.indexOf(string) --> returns int, index place of string specified
 *   6. str.plus(string) --> returns concatenated string
 */
fun main() {
    var str = "i"
    var str1="ali"
    var str2 = "sarah babe"
    var str3 = "ali"
    var str4 = "dsasd"
    var compare1= str1.compareTo(str2)  // negative -18
    var compare2= str1.compareTo(str3)  // zero      0
    var compare3= str1.compareTo(str4)  // negative -3
    var fullName= str1.plus(str2)
    println(compare1)
    println(compare2)
    println(compare3)
    println(str1.indexOf(str))    // 2
    println(fullName)

    strTemplate("Ali gulbahar ", "Uttar Prdesh", 28)
}
/***
 * -----------------STRING TEMPLATES OR INTERPOLATION-----------------------------------------------------------------------
 *  Note:> Instead of concatenation, you can also use "string templates",
 *         which is an easy way to add variables and expressions inside a string.
 */

fun strTemplate(a:String, b:String, c:Int) {
    var myProfile = "My name is $a, and i am $c yrs old. From $b"
    println(myProfile)
}