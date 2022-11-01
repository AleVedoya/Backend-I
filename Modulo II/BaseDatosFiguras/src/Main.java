import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        try{
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("No puede cargar el drive de h2");
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:h2:~/test;PASSWORD=;USER=sa");

            String SQLCREATE = "CREATE TABLE FIGURAS" +
                    "(ID INT PRIMARY KEY, FIGURA VARCHAR(100) NOT NULL, COLOR VARCHAR(100) NOT NULL)";

            Statement statement = connection.createStatement();
            statement.execute(SQLCREATE);

            String SQLINSERT = "INSERT INTO FIGURAS (ID, FIGURA, COLOR) VALUES (5, 'CUADRADO', 'AZUL')";

            Statement statementInsert = connection.createStatement();
            statementInsert.execute(SQLINSERT);

            String SQLLIST = "SELECT * FROM FIGURAS";

            ResultSet result = statement.executeQuery(SQLLIST);
            while(result.next()){
                System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3 ));
            }

        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("No se pudo conectar a la BD");
        }finally {
            connection.close();
        }
    }
}
