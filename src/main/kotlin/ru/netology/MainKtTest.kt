package ru.netology

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun commissionMastercard() {
        val amount = 100_000
        val sumAmountMonth = 0
        val typeCard = "Mastercard"
        val expectedCommission = 0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionMastercardWithExceeding() {
        val amount = 100_000
        val sumAmountMonth = 8_000_000
        val typeCard = "Mastercard"
        val expectedCommission = 2_600.0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionMaestro() {
        val amount = 100_000
        val sumAmountMonth = 0
        val typeCard = "Maestro"
        val expectedCommission = 0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionMaestroWithExceeding() {
        val amount = 100_000
        val sumAmountMonth = 8_000_000
        val typeCard = "Mastercard"
        val expectedCommission = 2_600.0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionVisaMin() {
        val amount = 100_000
        val sumAmountMonth = 0
        val typeCard = "Visa"
        val expectedCommission = 3_500

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionVisa() {
        val amount = 1_000_000
        val sumAmountMonth = 0
        val typeCard = "Visa"
        val expectedCommission = 7_500.0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionMirMin() {
        val amount = 100_000
        val sumAmountMonth = 0
        val typeCard = "Мир"
        val expectedCommission = 3_500

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionMir() {
        val amount = 1_000_000
        val sumAmountMonth = 0
        val typeCard = "Мир"
        val expectedCommission = 7_500.0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionVKPay() {
        val amount = 100_000
        val sumAmountMonth = 0
        val typeCard = "VkPay"
        val expectedCommission = 0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

}