import org.junit.Test;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertTrue;

/**
 * Created by Tenny on 2/2/16.
 */
public class SpecTooManyConnections {

        ConnectionManager myConnectionManager = new ConnectionManager();

        @Test
        public void testConnectionManager_tooManyConnections() {

            assertTrue(myConnectionManager.getManagedConnection("1.2.1", 1, "HTML") instanceof Connection);
            assertTrue(myConnectionManager.getManagedConnection("1.2.1", 1, "HTML") instanceof Connection);
            assertTrue(myConnectionManager.getManagedConnection("1.2.1", 1, "HTML") instanceof Connection);
            assertTrue(myConnectionManager.getManagedConnection("1.2.1", 1, "HTML") instanceof Connection);
//failing because it exceeds 3 limit
        }

    }
