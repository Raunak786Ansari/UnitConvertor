

package com.physphil.android.unitconverterultimate.api.models

data class Currencies(val currencies: List<Currency>) {
    fun toMap(): Map<Country, Double> {
        val map = mutableMapOf<Country, Double>()
        currencies.forEach {
            try {
                map[Country.valueOf(it.currency)] = it.rate
            } catch (ignored: IllegalArgumentException) {}
        }
        return map
    }
}

data class Currency(val currency: String, val rate: Double)

enum class Country {
    AUD,
    BGN,
    BRL,
    CAD,
    CHF,
    CNY,
    CZK,
    DKK,
    GBP,
    HKD,
    HRK,
    HUF,
    IDR,
    ILS,
    INR,
    ISK,
    JPY,
    KRW,
    MXN,
    MYR,
    NOK,
    NZD,
    PHP,
    PLN,
    RON,
    SEK,
    SGD,
    THB,
    TRY,
    USD,
    ZAR
}