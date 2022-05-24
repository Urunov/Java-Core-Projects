package uz.exceptionHandler.enums;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Exception-Lesson1}
 * @Date: {2022/05/14 && 9:56 AM}
 */
public enum CardType {
    //
    UZCARD("SUM"),
    HUMO("SUM"),
    VISA("USD"),
    UNIONPAY("YNE"),
    SIMPLECARD("SUM");

    private String currency;

    CardType(String currency) {
        this.currency = currency;
    }

    CardType() {
    }

    public String getCurrency() {
        return currency;
    }
}
