package herramentas;

import java.io.File;
import java.util.Scanner;

public class archivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int a = 0, i = 0, l = 0;

        System.out.println("ingrese 1 para mostrar  archivos de escritorio");
        System.out.println("ingrese 2 para mostrar  archivos de documentos");
        System.out.println("ingrese 3 para mostrar  archivos de: imagenes");
        System.out.println("ingrese 4 para mostrar  archivos de videos");
        System.out.println("ingrese 5 para mostrar  archivos de musica");

        try {
            a = entrada.nextInt();

        } catch (Exception c) {
            System.out.println("ingrese numeros no letras");
            a = entrada2.nextInt();

        } finally {
            System.out.println("Ingrece un número del 1-5");
            l = entrada.nextInt();
        }
        try {
            switch (a) {
                case 0:
                    System.out.println("Ingrece un número mayor a (0)");
                    a = entrada.nextInt();
            }
        } catch (Exception b) {

        } finally {
            System.out.println("ingrese numeros no letras");
            a = entrada.nextInt();
        }

        switch (a) {

            case 1:
                try {
                    File carpeta = new File("C:\\\\Users\\\\USUARIO\\\\Desktop");

                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        l = i;
                        System.out.println(archivos[i]);

                        System.out.println("total  archivos de escritorio : " + l);

                    }
                    break;
                } catch (Exception b) {

                }

            case 2:
                try {

                    File carpeta = new File("C:\\\\Users\\\\USUARIO\\\\Desktop\\Documents");
                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        l = i;
                        System.out.println(archivos[i]);

                    }

                    System.out.println("total archivos de documentos: " + l);
                    break;
                } catch (Exception h) {

                }
            case 3:
                try {

                    File carpeta = new File("C:\\\\Users\\\\USUARIO\\\\DesktopPictures");
                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        l = i;
                        System.out.println(archivos[i]);

                    }

                    System.out.println("total  archivos de imagenes: " + l);
                    break;
                } catch (Exception h) {

                }
            case 4:
                try {

                    File carpeta = new File("C:\\\\Users\\\\USUARIO\\\\DesktopVideos");
                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        l = i;
                        System.out.println(archivos[i]);

                    }

                    System.out.println("total  archivos de videos: " + l);
                    break;
                } catch (Exception h) {

                }
            case 5:
                try {

                    File carpeta = new File("C:\\\\Users\\\\USUARIO\\\\DesktopMusic");
                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        l = i;
                        System.out.println(archivos[i]);

                    }

                    System.out.println("total  archivos de musica: " + l);
                    break;
                } catch (Exception h) {

                }
        }
    }
}
