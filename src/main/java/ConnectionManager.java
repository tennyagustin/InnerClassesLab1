/**
 * Created by Tenny on 2/2/16.
 */
public class ConnectionManager {
    //ConnectionManager as a super only has the public stuff available to it
    private static int managedConnectionCounter = 0;

    public static Connection getManagedConnection(String aIpAddress, int aPortNumber, String aProtocol) {
        if (ConnectionManager.managedConnectionCounter > 2) {  //0-2 is three positions
            System.out.println("Can't do that shit.");
            return null;
        } else {
            managedConnectionCounter++;
            return new ManagedConnection(aIpAddress, aPortNumber, aProtocol);
        }
    }

    private static class ManagedConnection implements Connection {
        private String ipAddress;
        private int portNumber;
        private String protocol;
        private boolean open = true; //starts open

        //getIpAddress, getPort, and getProtocol are accessors
        public String getIpAddress() {
            if (open) {
                return ipAddress;
            } else {
                return null;
            }
        }

        public int getPort() {
            if (open) {
                return portNumber;
            } else {
                return 404;
            }
        }

        public String getProtocol() {
            if (open) {
                return protocol;
            } else {
                return null;
            }
        }

        public String connect() {
            if (open) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(ipAddress);
                stringBuilder.append(portNumber);
                stringBuilder.append(protocol);
                return stringBuilder.toString();
            } else {
                return "Nope.";
            }
        }


        public void close() {
            open = false; //checks state of boolean
            managedConnectionCounter--; //makes room for another connection

        }

        public void open() {  //allows us to open connection objs at will
            open = true;
        }


        private ManagedConnection(String aIpAddress, int aPortNumber, String aProtocol) {
            ipAddress = aIpAddress;
            portNumber = aPortNumber;
            protocol = aProtocol;

        }

    }


    public static void main(String[] args) {
        System.out.println("Sup?");

        Connection c1 = ConnectionManager.getManagedConnection("1.2.1.", 1, "HTML");
        Connection c2 = ConnectionManager.getManagedConnection("1.2.2.", 2, "HTML");
        Connection c3 = ConnectionManager.getManagedConnection("1.2.3.", 3, "HTML");
        Connection c4 = ConnectionManager.getManagedConnection("1.2.4.", 4, "HTML");

    }

}



