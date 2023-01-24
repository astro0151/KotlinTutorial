/**
 * -------------------------LOOPS IN KOTLIN-----------------------------------------------------------------------
 *  Note:> Loops can execute a block of code as long as a specified condition is reached
 * ------------------------WHILE LOOP-------
 *       > The while loop loops through a block of code as long as a specified condition is true.......
 *        var i=0
 *        while (i<5) {
 *            print(i)
 *            i++
 *            }
 */
       fun main(){
           whileLoop()
         //  dowhile()
       }
       fun whileLoop() {
           var i = 0
           while (i<5){
               if (i==3){
                   i++
                   continue     // continue statement skip one iteration like i=3 will not execute
               }
               print("$i ")
               i++
           }
       }
  // --------------DO WHILE LOOP------------------
  fun dowhile(){
      var j=0
      do {               // do block will always execute once, not matter condition is true
          print("$j ")
          j++
          if (j==5){
              break     // break statement terminates the execution at certain condition like j=5
          }
      } while (j<10)


  }