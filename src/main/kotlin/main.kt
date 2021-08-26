package ru.netology

fun main() {

    val transfer: Int = 5_000_000
    val monthSum = 100_000
    val card = "Visa"

    println(
        "Комиссия при переводе $transfer рублей с карты $card равна " +
                "${getCommission(cardType = card, monthSum = monthSum, transferAmount = transfer)} рублей"
    )
}

fun getCommission(cardType: String = "Vk Pay", monthSum: Int = 0, transferAmount: Int): Int {
    return when (cardType) {
        "VISA", "Мир" -> getVisaCommission(transferAmount)
        "MasterCard", "Maestro" -> getMasterCardCommission(monthSum, transferAmount)
        else -> 0
    }
}

fun getMasterCardCommission(monthSum: Int = 0, transferAmount: Int): Int {
    return if (monthSum > 75000) (transferAmount * 0.006).toInt() + 20 else 0
}

fun getVisaCommission(transferAmount: Int): Int {
    val commission = (transferAmount * 0.0075).toInt()
    return if (commission < 35) 35 else commission
}