package com.yagmurerdogan.abstractclass

// you can't create an object from abstract class, but you can do with open class

/*open class BaseCoffeeMachine(
    private val price: Double,
    private val color: String
) {

}*/

abstract class BaseCoffeeMachine(
    private val price: Double,
    private val color: String
) {
    // define members and functions that in abstract as an "abstract"
    abstract val brand: String

    // abstract fun doesn't have a body
    abstract fun makeCoffee(type: String): String

    // if fun is open, we can override if we want. It depends on us
    open fun machineInfo(): String {
        return "Coffee Machine Details: \n" +
                "Price: $price\n" +
                "Color: $color\n"
    }

}

