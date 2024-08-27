public class HolaMundo {
    public static void main(String[] args) {

        String saludar = "Hola Mundo desde java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);
        
        boolean valor = true;
        int numero2 = 10;
        
        if(valor){
            System.out.println("valor = " + valor);
            System.out.println("numero2 = " + numero2);
        }

        System.out.println("numero2 = " + numero2);

        var numero3 = "15";
        System.out.println("numero3 = " + numero3);
        
        String nombre;
        
        nombre = "Miguel";
        
        if (numero > 9){
            nombre = "Antony";
        }

        System.out.println("nombre = " + nombre);
    }
}
