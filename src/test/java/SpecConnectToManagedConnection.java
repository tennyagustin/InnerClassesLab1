import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Tenny on 2/2/16.
 */
public class SpecConnectToManagedConnection {
    ConnectionManager myConnectionManager = new ConnectionManager();

    @Test
    public void testConnectionManager_testConnectionToConnectionManager() {
        Connection c1 = myConnectionManager.getManagedConnection("1.2.1.", 1, "HTML");
        assertTrue(c1.connect() instanceof String); //asserting that c1 is returning a string
    }

}
