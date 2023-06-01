package chosenchilde.cadastro_de_trecos.crud;

import java.sql.SQLException;
import static chosenchilde.cadastro_de_trecos.Cadastro_de_trecos.*;
import static chosenchilde.cadastro_de_trecos.Tools.showRes;
import chosenchilde.cadastro_de_trecos.db.DbConnection;
import chosenchilde.cadastro_de_trecos.setup.AppSetup;

public class ChangeStatus extends AppSetup {

    public static void changeStatus() {
        
        int id = 0;
        String sql;

        // Mostra para o usuário o cabeçalho do aplicativo.
        System.out.println(appName + "\n" + appSep);
        System.out.println("Altera o status de um registro para ATIVO ou BLOQUEADO.");
        System.out.println(appSep);

        try {

            // Solicita para que o usuário coloque o ID do objeto desejado. 
            System.out.print("Digite o ID ou [0] para retornar: ");
            id = Integer.parseInt(scanner.next());
            if (id == 0) {
                clearScreen();
                mainMenu();
            }
        } catch (NumberFormatException e) {

            // Quando opção solicitada é inválida.
            clearScreen();
            System.out.println("A opção inserida é inválida.\n");
            changeStatus();
        }

        try {

            System.out.println(" ");

            // Busca no banco de dados se o registro solicitado existe.
            sql = "SELECT *, DATE_FORMAT(data, '%d/%m/%Y às %H:%i') AS databr FROM " + DBTABLE + " WHERE status != '0' AND id = ?";
            conn = DbConnection.dbConnect();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            res = pstm.executeQuery();

            if (res.next()) {

                // Exibe na visualização do usuário caso ele encontre o registro informado.
                showRes(res);

                String updateStatus;

                if (res.getString("status").equals("1")) {
                    updateStatus = "2";
                    System.out.print("O registro solicitado será ATIVADO, tem certeza que deseja fazer isso? [s/N] ");
                } else {
                    updateStatus = "1";
                    System.out.print("O registro solicitado será BLOQUEADO, tem certeza que deseja fazer isso? o registro? [s/N] ");
                }

                if (scanner.next().trim().toLowerCase().equals("s")) {

                    sql = "UPDATE " + DBTABLE + " SET status = ? WHERE id = ?";
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, updateStatus);
                    pstm.setInt(2, id);
                    if (pstm.executeUpdate() == 1) {
                        if (updateStatus.equals("1")) {
                            System.out.println("\nO registro solicitado foi BLOQUEADO.");
                        } else {
                            System.out.println("\nO registro solicitado foi ATIVADO.!");
                        }
                    } else {
                        System.out.println("Ocorreu um erro.");
                    }
                } else {
                    System.out.println("\nNada aconteceu.");
                }

            } else {
                clearScreen();
                System.out.println("Não encontrei nenhum objeto com o ID inserido.\n");
                changeStatus();
            }

            DbConnection.dbClose(res, stmt, pstm, conn);
            System.out.println(appSep);
            System.out.println("Menu:\n\t[1] Menu principal\n\t[2] Alterar outro item\n\t[0] Sair");
            System.out.println(appSep);        
            System.out.print("Opção: ");
            String option = scanner.next();
            switch (option) {
                case "0" ->
                    exitProgram();
                case "1" -> {
                    clearScreen();
                    mainMenu();
                }
                case "2" -> {
                    clearScreen();
                    changeStatus();
                }
                default -> {
                    clearScreen();
                    System.out.println("A opção inserida é inválida.\n");
                    changeStatus();
                }
            }
            
        } // Caso encontre algum erro
            catch (SQLException error) {
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }
    }
}
