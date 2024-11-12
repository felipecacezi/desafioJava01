package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static boolean continuar = true;
    private static int opcao;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Menu menu = new Menu();

        menu.apresentacaoBanco();
        menu.menuPrincipal();

        while (continuar) {
            opcao = scanner.nextInt();
            continuar = menu.loopSistema(opcao, scanner);
        }
        scanner.close();

    }
}