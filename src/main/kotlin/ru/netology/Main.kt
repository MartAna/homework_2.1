package ru.netology

fun main() {
    println(sizeCommission(100_000, 0, "Mastercard"))
    println(sizeCommission(100_000, 8_000_000, "Maestro"))
    println(sizeCommission(100_000, typeCard = "Visa"))
    println(sizeCommission(100_000, 0, "Мир"))
    println(sizeCommission(100_000))

}
 fun sizeCommission(
    amount: Int,
    sumAmountMonth: Int = 0,
    typeCard: String = "VkPay"
): Number {
    val minCommissionVisa = 3_500
    val sizeCommissionVisa = 0.0075
    val sizeCommissionMastercard = 0.006
    val necessaryCommissionMastercard = 2_000

    return when (typeCard) {
        "Mastercard", "Maestro" -> if (sumAmountMonth < 7_500_000) 0 else amount * sizeCommissionMastercard + necessaryCommissionMastercard
        "Visa", "Мир" -> if (amount * sizeCommissionVisa > minCommissionVisa) amount * sizeCommissionVisa else minCommissionVisa
        else -> 0
    }

}