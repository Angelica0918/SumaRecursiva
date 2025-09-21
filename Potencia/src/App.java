public class App {
    static int potencia (int numero, int exponente) {
        int resultado;
        if (exponente==0)
        return 1;

        else{

            resultado=numero*potencia(numero, exponente-1);
        }
        return resultado;

    }  

    public static void main(String[] args) throws Exception {
        
        int numero = 2;
        int exponente = 3;
        int resultado= potencia(numero, exponente);
        
        
        System.out.println("Resultado =  "+ resultado);
        
    }
}
