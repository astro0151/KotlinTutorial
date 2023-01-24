/**
 * ----------------------------BOOLEAN DATA TYPE IN KOTLIN--------------------------------------------------------------
 *     1. True
 *     2. False
 *
 *    > Sometimes we need values like ON/OFF, YES/NO ,1/0,  than comes boolean data types.
 *    > A Boolean expression returns a Boolean value: true or false.
 *
 */ //------------------------------------------------------------------------------------------------------------------
fun main() {
    println("Hi admin! how can i help you.....")
    println("1.start motor 2.stop motor ")

    var input = readln()

    if (input == "start motor") {
        motor(true)


    println("is motor started? y/n")

    var ans = readln()

    if (ans == "y") {
        println("chill")
    } else if (ans == "n") {
        println("restarting motor")
        motor(true)
        println("is motor started now? y/n")
        var ans = readln()
        if (ans == "y") {
            println("wow!! i'm too smart admin.....")
        } else {
            fault()
        }
    }
}// first command ends
    if(input=="stop motor") {
        motor(false)
        println("is motor stopped? y/n")
        var confirm = readln()
        if (confirm == "y") {
            println("thanks admin!! for confirmation")
        } else if (confirm == "n") {
            println("trying to stop again please wait a while....")
            motor(false)
            println(
                "is your fucking motor stopped now? y/n " +
                        "or i should pass very high voltage" +
                        " to burn it"
            )
            var reconfirm = readln()
            if (reconfirm == "y") {
                println("ok admin...thanks for confirmation")
            } else if (reconfirm == "n") {
                println("bhad me jao tum or tumhari motor.")
                fault()  // message to maintenance team
            }
        }
    }

}
fun motor(x:Boolean) {
      var switch =x
    var alert1:String="Motor Started Successfully Yeah......."
    var alert2:String="Motor Stopped Successfully chill dude......."

    if(switch) {
        println(alert1)
    }
    if (!switch) {
        println(alert2)
    }
}

fun fault(){
    var alert3:String="Hi admin! , there is some problem in electric panel or check wiring please......"
    print(alert3)
}