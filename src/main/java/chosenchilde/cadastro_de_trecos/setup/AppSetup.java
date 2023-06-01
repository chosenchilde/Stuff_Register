package chosenchilde.cadastro_de_trecos.setup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AppSetup {

    protected static final String MYSQLURL = "jdbc:mysql://localhost:3306/crudinho?user=root&password=";

    // Tabela principal.
    protected static final String DBTABLE = "trecos";

    // Objeto que recebe dados do teclado.
    protected static Scanner scanner = new Scanner(System.in);

    // Reserva recursos para o banco de dados.
    protected static Connection conn = null;
    protected static PreparedStatement pstm = null;
    protected static Statement stmt = null;
    protected static ResultSet res = null;

    // Dados do aplicativo.
    protected static String appName = "CADASTRO DE TRECOS";
    protected static String appSep = "-----------------------------------";

}
