import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
            Class.forName("org.h2.Driver");
        }catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargar el driver H2");
        }

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:~/test2;PASSWORD=;USER=sa");

            String CREATESQL = "CREATE TABLE EMPLEADOS" +
                    "(ID INT PRIMARY KEY, NOMBRE VARCHAR(100) , APELLIDO VARCHAR(100) , EDAD INT)";

            Statement statement = connection.createStatement();
            statement.execute(CREATESQL);

            String INSERSQL = "INSERT INTO EMPLEADOS (ID, NOMBRE, APELLIDO, EDAD) VALUES (1,'PEPITA', 'PEREZ', '20');" +
                              "INSERT INTO EMPLEADOS (ID, NOMBRE, APELLIDO, EDAD) VALUES (2,'ANASTASIA', 'GARCIA', '30');" +
                              "INSERT INTO EMPLEADOS (ID, NOMBRE, APELLIDO, EDAD) VALUES (3,'CHIMULTROFIA', 'LOPEZ', '40');";

            Statement insertStatement = connection.createStatement();
            insertStatement.execute(INSERSQL);

            String SQLLIST = "SELECT * FROM EMPLEADOS";

            ResultSet resultado = statement.executeQuery(SQLLIST);

            while (resultado.next()) {
                System.out.println(resultado.getInt(1) + " - " + resultado.getString(2) + " - " + resultado.getString(3) + " - " + resultado.getInt(4));
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("No se pudo conectar al driver");
        }finally{
            connection.close();
        }
    }
}
