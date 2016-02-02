/**
 * Created by Tenny on 2/2/16.
 */
public interface Connection {

    String getIpAddress();

    int getPort();

    String getProtocol();

    String connect();

    void close();

    void open();

}
