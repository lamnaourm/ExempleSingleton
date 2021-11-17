import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		
		Connection c = ConnectionManager.getInstance();
		
		
		
		
		c.close();
	}

}
