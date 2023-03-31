package binus.forum;

public class AlatKonversiSuhu {
    public static void main (String[] args) {
        System.out.println("Selamat siang, bu Jenny.");
        double suhucelcius;
        double suhufahrenheit;
        double suhukelvin;

        suhucelcius = 100;
        suhufahrenheit = suhucelcius * 9 /5 + 32;
        suhukelvin = suhucelcius + 273.15;

        System.out.println("Berapa suhu " + suhucelcius + " derajat celcius dalam fahrenheit? Jawabannya adalah " + suhufahrenheit + " derajat.");
        System.out.println("Berapa suhu " + suhucelcius + " derajat celcius dalam kelvin? Jawabannya adalah " + suhukelvin + " derajat.");
    }
}
