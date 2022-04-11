import org.junit.Assert.*
import org.junit.Test
import ru.netology.sizeCommission

class MainKtTest {

    @Test
    fun commissionMastercard() {
        val amount = 150_000
        val sumAmountMonth = 1_500_500
        val typeCard = "Mastercard"
        val expectedCommission = 3_500

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
        val amount = 170_000
        val sumAmountMonth = 3_000_000
        val typeCard = "Maestro"
        val expectedCommission = 0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }


    @Test
    fun commissionMaestroWithExceeding() {
        val amount = 200_000
        val sumAmountMonth = 8_000_000
        val typeCard = "Maestro"
        val expectedCommission = 3_200.0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }


    @Test
    fun commissionVisaMin() {
        val amount = 100_000
        val sumAmountMonth = 5_000_000
        val typeCard = "Visa"
        val expectedCommission = 3_500

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }


    @Test
    fun commissionVisa() {
        val amount = 1_000_000
        val sumAmountMonth = 4_000_000
        val typeCard = "Visa"
        val expectedCommission = 7_500.0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionMirMin() {
        val amount = 165_000
        val sumAmountMonth = 3_500_000
        val typeCard = "Мир"
        val expectedCommission = 3_500

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionMir() {
        val amount = 1_000_000
        val sumAmountMonth = 7_000_000
        val typeCard = "Мир"
        val expectedCommission = 7_500.0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }


    @Test
    fun commissionVKPay() {
        val amount = 100_000
        val sumAmountMonth = 1_000_000
        val typeCard = "VkPay"
        val expectedCommission = 0

        val commission = sizeCommission(amount, sumAmountMonth, typeCard)

        assertEquals(expectedCommission, commission)
    }


    @Test
    fun commissionAmount() {
        val amount = 100_000
        val expectedCommission = 0

        val commission = sizeCommission(amount)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionAmountWithSumAmountMonth() {
        val amount = 100_000
        val sumAmountMonth = 1_000_000
        val expectedCommission = 0

        val commission = sizeCommission(amount, sumAmountMonth)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionAmountWithTypeCardMaestro() {
        val amount = 700_000
        val typeCard = "Maestro"
        val expectedCommission = 0

        val commission = sizeCommission(amount, typeCard = typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionAmountWithTypeCardVisa() {
        val amount = 150_000
        val typeCard = "Visa"
        val expectedCommission = 3_500

        val commission = sizeCommission(amount, typeCard = typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionAmountWithTypeCardMastercard() {
        val amount = 150_000
        val typeCard = "Mastercard"
        val expectedCommission = 0

        val commission = sizeCommission(amount, typeCard = typeCard)

        assertEquals(expectedCommission, commission)
    }

    @Test
    fun commissionAmountWithTypeCardMir() {
        val amount = 150_000
        val typeCard = "Мир"
        val expectedCommission = 3_500

        val commission = sizeCommission(amount, typeCard = typeCard)

        assertEquals(expectedCommission, commission)
    }


    @Test
    fun commissionAmountWithCard() {
        val amount = 1_500_000
        val typeCard = "Card"
        val expectedCommission = 0

        val commission = sizeCommission(amount, typeCard = typeCard)

        assertEquals(expectedCommission, commission)
    }


}