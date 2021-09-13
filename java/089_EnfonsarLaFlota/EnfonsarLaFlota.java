import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class EnfonsarLaFlota {
    public static Scanner TStr = new Scanner(System.in);
    public static void StartUp(char matriu[][]) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[0].length; j++) {
                matriu[i][j] = 'a';
            }
        }
    }
    public static void mostrarMatriu(char matriu[][]) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[0].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[] demanaPosicio() {
        int[] arrayPosicio = new int[2];
        int fila=0, columna=0;
        boolean b = false;
        do {
            try{
            System.out.print("Entra la posició (fila) a on vols un vaixell (màxim " + 8 + "): ");
            fila = Integer.parseInt(TStr.nextLine());
            System.out.print("Entra la posició (columna) a on vols un vaixell (màxim " + 8 + "): ");
            columna = Integer.parseInt(TStr.nextLine());
            fila --;
            columna --;
            if ((fila >= 0 && fila < 8) && (columna >= 0 && columna < 8)) {
                b = true;
            } else {
                System.out.println("La posició NO ÉS correcte!");
            }
            }catch(Exception e){
            }
        } while (b == false);
        arrayPosicio[0] = fila;
        arrayPosicio[1] = columna;
        return arrayPosicio;
    }
    public static void poasrVaixell(char matriuRebuda[][], int[] arrayRebut) {
        boolean sortida = false;
        do {
            if (matriuRebuda[arrayRebut[0]][arrayRebut[1]] == 'a') {
                matriuRebuda[arrayRebut[0]][arrayRebut[1]] = 'v';
                sortida = true;
                System.out.println("Vaixell colocat correctament!");
            } else {
                System.out.println("Ja tens un vaixell! torn-hi");
                arrayRebut = demanaPosicio();
            }
        } while (sortida == false);
    }
    public static void save(char[][] a,String NF) {
        try {
            FileWriter e=new FileWriter(NF);
            for(int i=0;i!=a.length;i++) {
                for(int j=0;j!=a.length;j++) {
                    e.write(a[i][j]);
                }
                e.write("\n");
            }
            e.close();
        } catch (Exception E) {
            System.out.print("ERROR! "+E.getMessage());
        }
    }
    public static int[] jugar() {
        int[] arrayPosicio = new int[2];
        int fila=0, columna=0;
        boolean b = false;
        do {
            try{ 
            System.out.print("Entra la posició on vols disparar (fila): ");
            fila = Integer.parseInt(TStr.nextLine());
            System.out.print("Entra la posició on vols disparar (columna): ");
            columna = Integer.parseInt(TStr.nextLine());
            if ((fila >= 0 && fila < 8) && (columna >= 0 && columna < 8)) {
                b = true;
            } else {
                System.out.println("Posicio incorrecte!");
            }
            }catch(Exception e){
            }
        } while (b == false);
        arrayPosicio[0] = fila;
        arrayPosicio[1] = columna;
        return arrayPosicio;
    }
    public static void treureVaixell(char matriu[][], int[] array) {
        boolean boolea=false;
        for (int i=-1;i!=1;i++){
            if (array[0]+i>=0 && array[0]+i<=11){
                for(int j=-1;j!=1;j++){
                    if (array[1]+j>=0 && array[1] +j<=8){
                        if (matriu[array[0]+i][array[1]+j]==('v')){
                            boolea=true;  
                        }
                    }
                }
            }
        }
        if (matriu[array[0]][array[1]] == 'v') {
            matriu[array[0]][array[1]] = 'a';
            System.out.println("Vaixell enfonsat!");
        } else {
            System.out.println("no has tingut sort!");
            if (boolea==true){
                System.out.println("Pero t'has acostat, mes bona sort el seguent cop");
            }
        } 
    }
    public static void view(char[][] matriu1,char[][] matriu2){
        System.out.println("Matriu 1");
        System.out.println("---------------------------");
        mostrarMatriu(matriu1);
        System.out.println("Matriu 2");
        System.out.println("---------------------------");
        mostrarMatriu(matriu2);
    }
    public static void main(String[] args) {
        char matriu1[][] = new char[8][8];
        char matriu2[][] = new char[8][8];
        StartUp(matriu1);
        StartUp(matriu2);
        view(matriu1,matriu2);
        System.out.println("torn del jugador 1");
        for (int y = 0; y != 2; y++) {
            poasrVaixell(matriu1, demanaPosicio());
        }
        System.out.println("torn del jugador 2");
        for (int y = 0; y != 2; y++) {
            poasrVaixell(matriu2, demanaPosicio());
        }
        view(matriu1,matriu2);
        System.out.println("torn del jugador 1");
        for (int y = 0; y != 2; y++) {
            treureVaixell(matriu1, jugar());
        }
        System.out.println("torn del jugador 2");
        for (int y = 0; y != 2; y++) {
            treureVaixell(matriu2, jugar());
        }
        view(matriu1,matriu2);
        save(matriu1,"save1.txt");
        save(matriu2,"save2.txt");
    }
}
