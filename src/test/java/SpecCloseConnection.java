import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Tenny on 2/2/16.
 */
public class SpecCloseConnection {
    ConnectionManager myConnectionManager = new ConnectionManager();


    @Test
    public void testConnectionManager_closeConnection() {
        Connection c1 = myConnectionManager.getManagedConnection("1.2.1.", 1, "HTML");
        Connection c2 = myConnectionManager.getManagedConnection("1.2.2.", 2, "HTML");
        Connection c3 = myConnectionManager.getManagedConnection("1.2.3.", 3, "HTML");
        Connection c4 = myConnectionManager.getManagedConnection("1.2.4.", 4, "HTML");

        assertNotNull(c1);
        assertNotNull(c2);
        assertNotNull(c3);
        assertNull(c4);

        c3.close();
        assertTrue(c3.connect().equals("Nope."));

        Connection c5 = myConnectionManager.getManagedConnection("1.2.5.", 5, "HTML");

        assertNotNull(c5);

    }

}
