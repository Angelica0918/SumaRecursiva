public class sumar {
    
    static int suma(int n) {
        if (n <= 0) return n; 
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        int numero = 6;
        int resultado = suma(numero);
        System.out.println("La suma del número " + numero + " es = " + resultado);
    }
}
