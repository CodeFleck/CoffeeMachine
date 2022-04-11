package machine

class CoffeeMachine(water: Int, milk: Int, beans: Int, cups: Int, money: Int) {

    var water = water
    var milk = milk
    var beans = beans
    var cups = cups
    var money = money

    fun buy(type: String) {
        when (type) {
            "1" -> {
                if (water >= 250 && beans >= 16 && cups >= 1) {
                    water -= 250
                    beans -= 16
                    cups -= 1
                    money += 4
                } else {
                    println("Sorry, not enough resources!")
                }
            }
            "2" -> {
                if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                    water -= 350
                    milk -= 75
                    beans -= 20
                    cups -= 1
                    money += 7
                } else {
                    println("Sorry, not enough resources!")
                }
            }
            "3" -> {
                if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                    water -= 200
                    milk -= 100
                    beans -= 12
                    cups -= 1
                    money += 6
                } else {
                    println("Sorry, not enough resources!")
                }
            }
            "back" -> {
                println("")
            }
            else -> {
                println("Invalid option!")
            }
        }
    }

    fun fill() {
        println("Write how many ml of water do you want to add:")
        water += readLine()!!.toInt()
        println("Write how many ml of milk do you want to add:")
        milk += readLine()!!.toInt()
        println("Write how many grams of coffee beans do you want to add:")
        beans += readLine()!!.toInt()
        println("Write how many disposable cups of coffee do you want to add:")
        cups += readLine()!!.toInt()
    }

    fun take() {
        println("I gave you \$$money")
        money = 0
    }

    fun remaining() {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")
    }

    fun makeCoffee(cups: Int): Any {
        return when {
            water < 200 -> "Sorry, not enough water!"
            milk < 100 -> "Sorry, not enough milk!"
            beans < 16 -> "Sorry, not enough beans!"
            cups < 1 -> "Sorry, not enough cups!"
            else -> {
                water -= 200
                milk -= 100
                beans -= 16
                this.cups -= 1
                money += 4
                "I have enough resources, making you a coffee!"
            }
        }
    }

}
