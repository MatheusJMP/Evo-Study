package com.example.study_evo

data class CardListPurchases(
    val title: String,
    val date: String,
    val value: String
)

class CardBuilder {
    var title: String = ""
    var date: String = ""
    var value: String = ""

    fun build(): CardListPurchases = CardListPurchases(title, date, value)
}

fun card(block: CardBuilder.() -> Unit): CardListPurchases = CardBuilder().apply(block).build()

fun fakeCards(): MutableList<CardListPurchases> = mutableListOf(
    card {
        title = "Sport"
        date = "Jul 05, 21, 3:33 PM"
        value = "-$4.500"
    },
    card {
        title = "Shopping"
        date = "Jun 20, 21, 15:09 PM"
        value = "-$2.300"
    },
    card {
        title = "Food"
        date = "Jun 20, 21, 12:39 PM"
        value = "-$1.500"
    },
    card {
        title = "Car"
        date = "Jun 20, 21, 12:39 PM"
        value = "-$5.500"
    },
    card {
        title = "Phone"
        date = "Jul 01, 01, 22:39 PM"
        value = "-$2.000"
    }


)