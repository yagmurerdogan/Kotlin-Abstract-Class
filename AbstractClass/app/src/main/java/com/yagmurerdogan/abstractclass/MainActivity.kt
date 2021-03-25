package com.yagmurerdogan.abstractclass

/*
 You can watch the lesson -> https://www.youtube.com/watch?v=yVVmmVRZbac
 Thanks for "Simplified Coding"!
 */

fun main() {

    val coffeeMachine = PremiumCoffeeMachine2(10000.0,"BROWN")
    val info = coffeeMachine.machineInfo()
    val coffee = coffeeMachine.makeCoffee("CAPPUCINO")
    println(coffee)
    println(info)

    val simpleCoffeeMachine = CoffeeMachine(200.0,"BLACK")
    val coffee1 = simpleCoffeeMachine.makeCoffee("CAPPUCINO")
    println(coffee1)
}