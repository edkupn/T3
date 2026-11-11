public class Main {
    public static double promedio(double[] notas) {
        if (notas.length == 0) return 0;
        double suma = 0;
        for (double n : notas) suma += n;
        return suma / notas.length;
    }

    public static void main(String[] args) {
        double[] notas = {15, 18, 14};
        double p = promedio(notas);
        System.out.println("Promedio: " + p);
        if (Math.abs(p - 15.6667) > 0.001) {
            System.out.println("Prueba fallida");
            System.exit(1);
        }
        System.out.println("Prueba exitosa");
    }
}