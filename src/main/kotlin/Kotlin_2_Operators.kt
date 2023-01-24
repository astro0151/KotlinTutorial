/*
*  ---------------------------Operators in kotlin-----------------------------------------------
* ----------------------------
* > Operators are used to perform operations on variables and values........
*  > Arithmetic operators --> +, -, *, /, %, i++, i--  :> i refer to any value, which increase or decrease by 1;
   > Assignment operators --> =, +=, -=, /=, %=, *=
   > Comparison operators --> ==, !=, <,>, <=, >=
   > Logical operators    --> && , || , !
   > bit wise operators   --> .......to study
_________________________________________________________________________________________________________
 */

fun operator() {
    var a:Int
    var b:Int
    a=5
    b=4
    var sum=a+b
    println(sum)
    a=10
    a++
    b=2
    b--
    a+=10
     var sub= a-b
     var div=a/b
    var multi = a*b
    println(sub)
    println(div)
    println(multi)
    a++
 if(a==22){
     println(true)
 }

}

fun main() {
    operator()
}