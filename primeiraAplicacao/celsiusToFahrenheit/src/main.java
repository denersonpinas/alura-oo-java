public class main {
    public static void main(String[] args) {
        int temperaturaCelsius = 37;

        double convert = (temperaturaCelsius * 1.8) + 32;
        System.out.println(convert);

        int temperaturaFahrenheit = (int) convert;
        System.out.println(temperaturaFahrenheit);
    }
}
