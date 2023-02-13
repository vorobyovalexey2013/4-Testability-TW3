public class CreditPaymentService {
    public int calculate(int month, double percent, int summa)
    {
        double persMonht = (percent/12)/100;
        double onePersMonth = 1 + persMonht;
        double numerator = (summa*persMonht)*Math.pow(onePersMonth, month);
        double denominator = Math.pow(onePersMonth, month)-1;
        double pay = numerator/denominator;
        return (int) pay;
    }


}
