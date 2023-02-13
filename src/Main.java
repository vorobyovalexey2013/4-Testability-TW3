public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summa = 5_000_000; // рублей
        int month = 12; // месяцев
        double percent = 9.99; // процентов годовых
        double myPay = service.calculate(month, percent, summa);
        System.out.println();
        System.out.println("Если взять кредит 5 млн.руб на 12 месяцев под 9,9% годовых, то:");
        System.out.println("Ежемесячный платёж - " + myPay + " рублей");
        System.out.println();
        System.out.println();
        //
        System.out.println("Если взять кредит 1 млн.руб на 12 месяцев под 9,99% годовых, то:");
        System.out.print("Ежемесячный платёж - " + service.calculate(12, 9.99, 1000000) + " рублей");
        System.out.println();
        System.out.println();
        //
        System.out.println("Если взять кредит 1 млн.руб на 24 месяца под 9,99% годовых, то:");
        System.out.print("Ежемесячный платёж - " + service.calculate(24, 9.99, 1000000) + " рублей");
        System.out.println();
        System.out.println();
        //
        System.out.println("Если взять кредит 1 млн.руб на 36 месяцев под 9,99% годовых, то:");
        System.out.print("Ежемесячный платёж - " + service.calculate(36, 9.99, 1000000) + " рублей");
    }
}