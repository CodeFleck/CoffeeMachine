package machine

fun main() {

    val currentMoney = 550
    val currentWater = 400
    val currentMilk = 540
    val currentBeans = 120
    val currentCups = 9
    val coffeeMachine = CoffeeMachine(currentWater, currentMilk, currentBeans, currentCups, currentMoney)

    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readLine()
        if (action == "take") {
            coffeeMachine.take()
        } else if (action == "fill") {
            coffeeMachine.fill()
        } else if (action == "buy") {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, - back:")
            val coffeeType = readLine()!!
            if (coffeeType == "back") {
                continue
            }
            coffeeMachine.buy(coffeeType)
        } else if (action == "remaining") {
            coffeeMachine.remaining()
        } else if (action == "exit") {
            println("Goodbye!")
            break
        } else {
            println("Invalid action!")
        }
    } while (true)
}

