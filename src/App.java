import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {
        calculaImprimeConta(80, "Pedro");
        calculaImprimeConta(50, "André");
        calculaImprimeConta(30, "Montanha");
        calculaImprimeConta(100, "Amanda");
    }

    public static void calculaImprimeConta(double conta, String Nome ) {
        double gurjeta = conta * 0.1;
        double couvert = conta * 0.2;
        double total = conta + gurjeta + couvert;
        System.out.println("Discriminação Conta do " + Nome);
        System.out.println("Total Consumido R$ " + conta);
        System.out.println("Gujeta R$ " + gurjeta);
        System.out.println("Couvert R$ " + couvert);
        System.out.println("Total Geral do "+ Nome + " R$ " + total);
        System.out.println("");
    }



}
