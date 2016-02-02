import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.*;

/**
 * Created by Tenny on 2/2/16.
 */
public class SpecGetConnection {

    ConnectionManager myConnectionManager = new ConnectionManager();

    @Test
    public void testConnectionManager_getConnection() {

        assertTrue(myConnectionManager.getManagedConnection("1.2.1", 1, "HTML") instanceof Connection);

    }

}
