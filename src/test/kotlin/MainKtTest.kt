package ru.netology

import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun getVisaCommission() {
        val card = "VISA"
        val sum = 50_000
        val monthTransfer = 75_000
        val result = getCommission(
            cardType = card,
            monthSum = monthTransfer,
            transferAmount = sum
        )
        assertEquals(375, result)
    }

    @Test
    fun getMirCommission() {
        val card = "Мир"
        val sum = 50_000
        val monthTransfer = 75_000
        val result = getCommission(
            cardType = card,
            monthSum = monthTransfer,
            transferAmount = sum
        )
        assertEquals(375, result)
    }

    @Test
    fun getVkPayCommission() {
        val card = "Vk Pay"
        val sum = 5_000
        val monthTransfer = 70_000
        val result = getCommission(
            cardType = card,
            monthSum = monthTransfer,
            transferAmount = sum
        )
        assertEquals(0, result)
    }

    @Test
    fun getMaestroCommission() {
        val card = "Maestro"
        val sum = 5_000
        val monthTransfer = 70_000
        val result = getCommission(
            cardType = card,
            monthSum = monthTransfer,
            transferAmount = sum
        )
        assertEquals(0, result)
    }

    @Test
    fun getVisaCommissionWhen35() {
        val sum = 100
        val result = ru.netology.getVisaCommission(
            transferAmount = sum
        )
        assertEquals(35, result)
    }

    @Test
    fun getMasterCommission() {
        val sum = 5_000
        val monthTransfer = 76_000
        val result = getMasterCardCommission(
            monthSum = monthTransfer,
            transferAmount = sum
        )
        assertEquals(50, result)
    }

    @Test
    fun getMasterCommissionLess75000() {
        val sum = 5_000
        val monthTransfer = 70_000
        val result = getMasterCardCommission(
            monthSum = monthTransfer,
            transferAmount = sum
        )
        assertEquals(0, result)
    }
}