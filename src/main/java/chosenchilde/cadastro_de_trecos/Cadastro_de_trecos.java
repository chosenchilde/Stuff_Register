/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package chosenchilde.cadastro_de_trecos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 16128412023.1
 */
public class Cadastro_de_trecos {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        clearScreen();
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Cadastro de Trecos \n\n Menu: \n\t [1] Listar todos \n\t [2] Listar \n\t [3] Novo \n\t [4] Editar \n\t [5] Apagar \n\t [0] Sair");
        System.out.print("\n Opção:");

        String option = scanner.next();

        // Executa o método conforme a opção escolhida.
        switch (option) {
            case "0" ->
                exitProgram();
            case "1" ->
                listAll();
            case "2" ->
                listOne();
            case "3" ->
                newThing();
            case "4" ->
                editThing();
            case "5" ->
                deleteThing();
            default ->
                reloadMenu();
        }

    }

    // Encerra o programa.
    public static void exitProgram() {
        scanner.close();
        clearScreen();
        System.out.println("\n\nFui\n\n");
        System.exit(0);
    }

    // Lista todos os trecos cadastrados.
    public static void listAll() {

        try {
            String sql = "SELECT * FROM things";
            Connection conn = DbConnection.dbConnect();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(
                        "ID: " + res.getString("id") + "\n"
                        + "Nome: " + res.getString("name") + "\n"
                        + "Descrição: " + res.getString("description") + "\n"
                );
            }

            conn.close();
            stmt.close();
            res.close();

            System.out.println("Menu:\n\t[1] Menu principal\n\t[0] Sair");
            System.out.print("\nOpção:");

            String option = scanner.next();
            
            switch (option) {
                case "0" ->
                    exitProgram();
                case "1" ->{
                    clearScreen();
                    mainMenu();
                }
                default ->
                    reloadMenu();
            }

        } catch (SQLException error) {
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }
    }

    // Lista um treco especifico pelo ID.
    public static void listOne() {

    }

    // Cadastra um novo treco.
    public static void newThing() {

    }

    // Edita o treco pelo ID.
    public static void editThing() {

    }

    // Deleta um treco pelo ID.
    public static void deleteThing() {

    }

    // Recarrega o menu.
    public static void reloadMenu() {
        clearScreen();
        System.out.println("Opção errada");
        mainMenu();
    }

    // Edita os trecos
    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }
}
