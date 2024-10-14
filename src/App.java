import java.util.Scanner;
import java.util.Arrays;

//REALIZADO POR PATRICIO ALEXANDER MASHINKIASH MORA

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        int op;
        int tm;
        int[] arreglo=null;

        do{
            System.out.println("\n----Menu principal----");
            System.out.println("1. Ingrese un arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("0. Salir");

            System.out.print("\nIngrese una opcion: ");
            op = s.nextInt();

            switch (op) {
                case 0:

                System.out.println("\nRzd por Patricio Mashinkiash");
                System.out.println("Terminando programa...");
                
                break;

                case 1:

                System.out.print("\nIngrese el tamaño del arreglo: ");
                tm = s.nextInt();

                arreglo = new int[tm];
                for (int i = 0; i < tm; i++) {
                    System.out.print("Valor #"+(i+1)+": ");
                    arreglo[i] = s.nextInt();
                }
                System.out.println("\nArreglo ingresado: "+Arrays.toString(arreglo)+"\n");

                break;
            
                case 2:

                System.out.println("\nEscoja un metodo de ordenamiento");
                System.out.println("1. Metodo Burbuja");
                System.out.println("2. Metodo Seleccion");
                System.out.println("3. Metodo Insercion");
                System.out.println("4. Metodo Burbuja Ajuste");

                int opM;
                System.out.print("\nIngrese una opcion: ");
                opM = s.nextInt();

                int orden;
                System.out.println("\nEscoja el orden de ordenamiento");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");

                System.out.print("\nIngrese una opcion: ");
                orden = s.nextInt();

                int mostrarPasos;
                System.out.println("\nDesea ver cada paso?");
                System.out.println("1. Si");
                System.out.println("2. No");
                    
                System.out.print("\nIngrese una opcion: ");
                mostrarPasos = s.nextInt();

                boolean ascendente = (orden == 1);
                boolean mostrar = (mostrarPasos == 1);

                MetodosdeOrdenamiento mO = new MetodosdeOrdenamiento();

                switch (opM) {
                    case 1:

                    int[] arregloBurbuja = mO.burbuja(arreglo, ascendente, mostrar);
                    System.out.println("Arreglo ordenado: " + Arrays.toString(arregloBurbuja));

                    break;
                        
                    case 2:

                    int[] arregloSeleccion = mO.seleccion(arreglo, ascendente, mostrar);
                    System.out.println("Arreglo ordenado: " + Arrays.toString(arregloSeleccion));
                    
                    break;
                        
                    case 3:
                    
                    int[] arregloInsercion = mO.insercion(arreglo, ascendente, mostrar);
                    System.out.println("Arreglo ordenado: " + Arrays.toString(arregloInsercion));
                    
                    break;
                        
                    case 4:
                    
                    int[] arregloBurbujaAjuste = mO.burbujaAjuste(arreglo, ascendente, mostrar);
                    System.out.println("Arreglo ordenado: " + Arrays.toString(arregloBurbujaAjuste));
                    break;
                    
                    default:
                    
                    System.out.println("\nOpcion incorrecta: Selecciona una opcion valida");
                    
                    break;
                }

                break;
                    
            default:
            
            System.out.println("\nOpcion incorrecta: Selecciona una opcion valida");
            
            break;
            
            }

        }while(op!=0);

        s.close();

    }
}
