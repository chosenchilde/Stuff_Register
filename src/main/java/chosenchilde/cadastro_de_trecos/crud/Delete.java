package chosenchilde.cadastro_de_trecos.crud;

import static chosenchilde.cadastro_de_trecos.Cadastro_de_trecos.clearScreen;
import static chosenchilde.cadastro_de_trecos.Cadastro_de_trecos.mainMenu;
import chosenchilde.cadastro_de_trecos.db.DbConnection;
import chosenchilde.cadastro_de_trecos.setup.AppSetup;
import java.sql.SQLException;

public class Delete extends AppSetup {

    public static void delete() {

        // Reserva recursos para o banco de dados.
        int id = 0;
        String sql = "";

        // Cabeçalho da seção.
        System.out.println(appName + "\n" + appSep);
        System.out.println("Lista um registro");
        System.out.println(appSep);

        try {

            // Recebe o Id do teclado.
            System.out.print("Digite o ID para apagar ou [0] para retornar: ");
            id = Integer.parseInt(scanner.next());
            if (id == 0) {
                clearScreen();
                mainMenu();
            }
        } catch (NumberFormatException e) {

            // Quando opção é inválida.
            clearScreen();
            System.out.println("Oooops! Opção inválida!\n");
            delete();
        }

        try {
            sql = "SELECT FROM" + DBTABLE + "WHERE id = ?";
            conn = DbConnection.dbConnect();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            res = pstm.executeQuery();

            if (res.next()) {

            } else {
                clearScreen();
                System.out.println("Ooops! Não achei nada!\n");
                delete();
            }

        } catch (SQLException e) {
        }
    }

}
