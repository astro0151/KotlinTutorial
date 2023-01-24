/*================ Notes
______------------------------Variables in kotlin-------------------------------------------------______
________________________________________________________________________________________________________
in kotlin we can declare variable two types
--------------------------------------------------------------------------------------------------------
1 var keyword
2 val keyword
var--> behave same like javascript language , can be mutable .
val--> val type variable is immutable so can not  modify according our need
types of declaring variables;
we can set data type to variable by ourselves or
variable can be declared in dynamic way
-----------------------------------------------------------------------------------------------------------

like :
var a = ?  now the value assigned is dynamic , if you do not tell to compiler the data type

then compiler well check it with itself what type of data type it is.
var a= ' c ';
var a= "String";
var a= 12; // int
var b =12.2 // float;

now developer defined data type to any variable
var a:String= "string"; // now if we will decide to assign a different type than string it will throw error.

 ----------------Data types in kotlin ------------------------------------------------------------------------
 1. Numbers
 2.Characters
 3.Booleans
 4.Strings
 5.Arrays
          --------------------Numbers Type-------------------------------------
          1. Int     // 12334
          2. Byte
          3. Short
          4. Float   // decimal vale like 11.42f
          5. Double    // a very big decimal value like 58921743081.321454215d
          6. Long  // a very long integer value 7817328147L
          ---------------------Boolean Type-----------------------------------
          1. True
          2. False
          ---------------------Character Type--------------------------------
          1. Char --> used to store the single character
             var myVar = 'a'   :> declared in single quotes, do not use double quotes otherwise it will be string.
          ---------------------String Type-----------------------------------
          1. String ---> used to store sequence of character inside the double quotes ""
                         -> remember single quote for char type is used
                         var name ="Gul"
          ----------------------Array Types---------------------------------
          Array:> used to store the multiple values in a single variable
          Note:> arrays are 0 based indexing
__________________________________End of Notes__________________________________________________________________

 */

/*
THE main() function in previous version 1.3 have different function

fun main(args : Array<String>) {
    // code to be executed or function to call
}
Note: this syntax is no more required in latest kotlin ..........
semicolon ( ; ) not required in kotlin................
 */
fun main(){
    var firstVar="Hello this is gulbahar ali"
    val lastName="ali"
    var a:String= "1141"
    println("$firstVar and last name is: $lastName");
    //printing var a
    println(a)
    myfun("Gulbahar",28)
}
// if we only want to declare a variable but not want to assign any value to it
// then we need to specify the type of varible
fun myfun(a:String,b:Int){
    var myName:String
    var myAge: Int
    myName=a;
    myAge=b
    print(myName+" "+myAge)
}
//fun main() {
//  a file can not contains main() fun more than once
//}

//----------val keyword
fun valVar() {
    val name="ali"
  //  name="gulbahar"  // it is throwing err becoz val can not reinitalize.............
    println(name)
}

//---------------------Rules for Variables declarations------------------------
/*________________________________________________________________________________________________________________
    1.can contain letters, digits, underscores, and dollar signs...............
    2.should start with a letter
    3.can also begin with $ and _
    4.Names are case-sensitive ("myVar" and "myvar" are different variables)
    5. should start with a lowercase letter, and it cannot contain whitespace
    */
