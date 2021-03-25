package com.yagmurerdogan.abstractclass

/*
When we were using "open class", we can create a class like below

class PremiumCoffeeMachine(
    price: Double, color: String
): BaseCoffeeMachine(price,color) {
}

But with abstract class it would be like that;
 */

// rule 1:  you should make child class as a "abstract"
abstract class PremiumCoffeeMachine(
    price: Double, color: String
): BaseCoffeeMachine(price, color) {

}

// if you don't want to make child class as a "abstract" you should override members and functions
 class PremiumCoffeeMachine2(
     price: Double, color: String
 ): BaseCoffeeMachine(price, color) {
     override val brand: String
         get() = "Brand X"

     override fun makeCoffee(type: String): String {
        return "Your $type is Ready! ☕️"
     }
 }
