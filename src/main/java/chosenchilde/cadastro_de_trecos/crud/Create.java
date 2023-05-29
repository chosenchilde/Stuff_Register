package chosenchilde.cadastro_de_trecos.crud;

import static chosenchilde.cadastro_de_trecos.Cadastro_de_trecos.*;
import chosenchilde.cadastro_de_trecos.db.DbConnection;
import chosenchilde.cadastro_de_trecos.setup.AppSetup;
import java.sql.SQLException;
import java.util.Scanner;

public class Create extends AppSetup {

    public static void create() {

        String sql;

        // Cabeçalho da view.
        System.out.println(appName + "\n" + appSep);
        System.out.println("Cadastrar registro");
        System.out.println(appSep + "\n");

        try {

            Scanner keyboard = new Scanner(System.in, "latin1");

            System.out.print("\tNome: ");
            String itemName = keyboard.nextLine().trim();

            System.out.print("\tDescrição: ");
            String itemDescription = keyboard.nextLine().trim();

            System.out.print("\nOs dados acima estão corretos? [s/N] ");
            if (keyboard.next().trim().toLowerCase().equals("s")) {

                sql = "INSERT INTO " + DBTABLE + " (name, description) VALUES (?, ?)";
                conn = DbConnection.dbConnect();
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, itemName);
                pstm.setString(2, itemDescription);
                if (pstm.executeUpdate() == 1) {
                    System.out.println("\nRegistro cadastrado!");
                } else {
                    System.out.println("Oooops! Algo deu errado!");
                }

            } else {
                System.out.println("\nNada aconteceu!");
            }

            // Fecha banco de dados.
            DbConnection.dbClose(res, stmt, pstm, conn);

            // Menu inferior da seção.
            System.out.println(appSep);
            System.out.println("Menu:\n\t[1] Menu principal\n\t[2] Cadastrar outro\n\t[0] Sair");
            System.out.println(appSep);

            // Recebe opção do teclado.            
            System.out.print("Opção: ");
            String option = scanner.next();

            // Executa conforme a opção.
            switch (option) {
                case "0" ->
                    exitProgram();
                case "1" -> {
                    clearScreen();
                    mainMenu();
                }
                case "2" -> {
                    clearScreen();
                    create();
                }
                default -> {
                    clearScreen();
                    System.out.println("Oooops! Opção inválida!\n");
                    create();
                }
            }

        } catch (SQLException error) {

            // Tratamento de erros.
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }

    }

}
