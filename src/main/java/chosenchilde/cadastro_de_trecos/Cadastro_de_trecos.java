package chosenchilde.cadastro_de_trecos;

import chosenchilde.cadastro_de_trecos.crud.Create;
import chosenchilde.cadastro_de_trecos.crud.Delete;
import chosenchilde.cadastro_de_trecos.setup.AppSetup;
import chosenchilde.cadastro_de_trecos.crud.Read;

public class Cadastro_de_trecos extends AppSetup {

    public static void main(String[] args) {
        clearScreen();
        mainMenu();
    }

    // Método que exibe o menu principal.
    public static void mainMenu() {

        System.out.println(appName + "\n" + appSep);
        System.out.println("Menu:");
        System.out.println("\t[1] Listar todos");
        System.out.println("\t[2] Listar");
        System.out.println("\t[3] Novo");
        System.out.println("\t[4] Editar");
        System.out.println("\t[5] Apagar");
        System.out.println("\t[0] Sair");
        System.out.println(appSep);
        System.out.print("Opção: ");

        // Recebe a opção do teclado.
        String option = scanner.next();

        // Executa um método conforme a opção escolhida.
        switch (option) {
            case "0" ->
                exitProgram();
            case "1" -> {
                clearScreen();
                Read.readAll();
            }
            case "2" -> {
                clearScreen();
                Read.read();
            }
            case "3" ->{
                clearScreen();
                Create.create();}
            case "4" ->
                editThing();
            case "5" -> {
                clearScreen();
                Delete.delete();
            }
            default ->
                reloadMenu();
        }
    }

    // Encerra o programa.
    public static void exitProgram() {
        scanner.close();
        clearScreen();
        System.out.println("\n\nFui!\n\n");
        System.exit(0);
    }

    // Cadastra um novo treco.
    public static void newThing() {
    }

    // Edita um treco pelo Id.
    public static void editThing() {
    }

    // Recarrega o menu principal.
    public static void reloadMenu() {
        clearScreen(); // Limpa o terminal.
        System.out.println("Oooops! Opção inválida!\n");
        mainMenu();    // Mostra o menu.
    }

    // Limpa a tela do terminal.
    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }

}
