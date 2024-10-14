import java.util.Arrays;

public class MetodosdeOrdenamiento{
    
    //METODO DE ORDENAMIENTO BURBUJA
    public int[] burbuja(int[] arregloOriginal, boolean ascendente, boolean mostrarPasos) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //INTERCAMBIO DE VALORES DEPENDIENDO DE LA CONDICION
                if ((ascendente && arreglo[j] > arreglo[j + 1]) || (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
                //IMPRESION DE LAS POSICIONES, VALORES A COMPARAR EN CADA ITERACION DEL ARREGLO
                if (mostrarPasos) {
                    System.out.println(Arrays.toString(arreglo) + "\t Posicion I= " + i + "   Posicion J= " + j +
                    "    ||    Valor [I] = " + arreglo[j] + "   Valor [J] = " + arreglo[j + 1]);     
                }
            }
        }
        return arreglo;
    }


    //METODO DE ORDENAMIENTO SELECCION  
    public int[] seleccion(int[] arregloOriginal, boolean ascendente, boolean mostrarPasos) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {

            int indiceMinimoMaximo = i;

            for (int j = i + 1; j < n; j++) {
                if ((ascendente && arreglo[j] < arreglo[indiceMinimoMaximo]) || 
                    (!ascendente && arreglo[j] > arreglo[indiceMinimoMaximo])) {
                    indiceMinimoMaximo = j;
                }
                //IMPRESION DE LAS POSICIONES, VALORES A COMPARAR EN CADA ITERACION DEL ARREGLO
                if (mostrarPasos) {
                System.out.println(Arrays.toString(arreglo) + "\t Posicion I= " + i + "   Posicion J= " + j + 
                "    ||    Valor [I] = " + arreglo[i] + "   Valor [J] = " + arreglo[j]);
                }
            }
            //INTERCAMBIO DE VALORES DEL ARREGLO
            int temp = arreglo[indiceMinimoMaximo];
            arreglo[indiceMinimoMaximo] = arreglo[i];
            arreglo[i] = temp;
            //IMPRESION DEL ARREGLO DESPUES DEL INTERCAMBIO
            if (mostrarPasos) {
                System.out.println("\nIntercambio de valores: " + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }


    //METODO DE ORDENAMIENTO INSERCION
    public int[] insercion(int[] arregloOriginal, boolean ascendente, boolean mostrarPasos) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;

        for (int i = 1; i < n; i++) {

            int key = arreglo[i];
            int j = i - 1;

            //INTERCAMBIO DE VALORES
            while (j >= 0 && ((ascendente && arreglo[j] > key) || (!ascendente && arreglo[j] < key))) {
                arreglo[j + 1] = arreglo[j];
                //IMPRESION DE LAS POSICIONES, VALORES A COMPARAR EN CADA ITERACION DEL ARREGLO
                if (mostrarPasos) {
                    System.out.println(Arrays.toString(arreglo) + "\t Posicion I= " + i + "   Posicion J= " + j +
                    "    ||    Valor [I] = " + key + "   Valor [J] = " + arreglo[j]); 
                }
                j--;
            }
            arreglo[j + 1] = key;
            //IMPRESION DEL ARREGLO DESPUES DEL INTERCAMBIO
            if (mostrarPasos) {
                System.out.println("\nIntercambio de valores: " + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }


    //METODO DE ORDENAMIENTO BURBUJA-MEJORADO
    public int[] burbujaAjuste(int[] arregloOriginal, boolean ascendente, boolean mostrarPasos) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {

            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                //INTERCAMBIO DE VALORES
                if ((ascendente && arreglo[j] > arreglo[j + 1]) || (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true; 
                }
                //IMPRESION DE LAS POSICIONES, VALORES A COMPARAR EN CADA ITERACION DEL ARREGLO
                if (mostrarPasos) {
                    System.out.println(Arrays.toString(arreglo) + "\t Posicion I= " + i + "   Posicion J= " + j + 
                    "    ||    Valor [I] = " + arreglo[j] + "   Valor [J] = " + arreglo[j+1]);
                }
            }
            if (!intercambiado) {
                break;
            }
        }
        return arreglo;
    }

}