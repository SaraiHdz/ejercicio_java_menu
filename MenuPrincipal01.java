//Menu principal
//limpiar consola multiplataforma, verificar funcionamiento en cualquier SO
import java.util.Scanner;
import java.io.*;

public class MenuPrincipal01{
	public static void main(String [] args){
        //Por hacer: depurar el clear de la pantalla
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else{
                Runtime.getRuntime().exec("clear");
            }

        }catch(IOException | InterruptedException ex ){
            System.out.println("Ocurrio un error al limpiar pantalla");
        }
		System.out.println("Programa demostrativo sobre Tipos de Datos en Java");
        System.out.println("Digite la opcion del menú según corresponda");
        System.out.println("1. Boolean y caracteres");
        System.out.println("2. Double");
        System.out.println("3. Entero Simple");
        System.out.println("4. String");
        System.out.println("5. Not cientifica doble precision");     
        System.out.println("6. Shift Operators");
        System.out.println("7. Salir del Menú");
        System.out.print("Digite opción:");
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int decision = Integer.parseInt(entrada.nextLine());

        while(!salir){

            switch(decision){
                case 1:
                    boolean x;
                    x = false;
                    System.out.println("La variable x es: "+ x);

                    x=true;
                    System.out.println("La variable x es: "+ x);

                    if(x=true){
                    System.out.println("La variable x existe");
                    }
                break;
                
                case 2:
                    Double num1 = 1.25;
                    Double num2 = 2.75;
                    Double num3 = 1.55;

                    Double operacion1 = num1+num2-num3;

                    System.out.println(operacion1);
                break;

                case 3:
                   
                break;

                case 4:
                   
                break;

                case 5:
                   
                break;

                case 6:
                    public class Main {

                        public static void main(String args[]) {
                        int a = 60;	/* 60 = 0011 1100 */ 
                        int b = 13;	/* 13 = 0000 1101 */
                        int c = 0;
                    
                        c = a & b;       /* 12 = 0000 1100 */
                        System.out.println("a & b = " + c );
                    
                        c = a | b;       /* 61 = 0011 1101 */
                        System.out.println("a | b = " + c );
                    
                        c = a ^ b;       /* 49 = 0011 0001 */
                        System.out.println("a ^ b = " + c );
                    
                        c = ~a;          /*-61 = 1100 0011 */
                        System.out.println("~a = " + c );
                    
                        c = a << 2;     /* 240 = 1111 0000 */
                        System.out.println("a << 2 = " + c );
                    
                        c = a >> 2;     /* 215 = 1111 */
                        System.out.println("a >> 2  = " + c );
                    
                        c = a >>> 2;     /* 215 = 0000 1111 */
                        System.out.println("a >>> 2 = " + c );
                        }
                break;

                case 7:
                    salir = true;
                    System.out.println("Saliendo del Menú....");
                break;

                default:
                   System.out.println("Debes de seleccionar una opción valida, entre 1 y 7");
            }       
        }
    }
}