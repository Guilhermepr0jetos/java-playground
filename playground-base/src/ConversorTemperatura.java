public class ConversorTemperatura {
    public static void main(String[] args) {
        System.out.println("\ntemperatura em kelvin: "+celsiusparaKelvin(40));
    }

    public static int celsiusparaKelvin (int celsius) {
        return celsius+273;
    }
}
