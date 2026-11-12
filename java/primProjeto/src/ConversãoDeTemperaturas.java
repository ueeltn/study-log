public class ConversãoDeTemperaturas {
    public static void main(String[] args) {
        double temperaturaCelsius = 31.2;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("A temperatura: "+temperaturaCelsius+ " Celsius, equivale à "+temperaturaFahrenheit+" Fahrenheit!");

        int temFahrenheitInt = (int)temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temFahrenheitInt);



    }
}
