package Udemy.Java.course_Dolar.src.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double dollarPrice;
    public static double dollarAmount;

    public static double reaisAmount(){
        return dollarPrice*dollarAmount;
    }
    public static double amountToBePaid(){
        return reaisAmount()+(reaisAmount()*IOF);
    }
    
}