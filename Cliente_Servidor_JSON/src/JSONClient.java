import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class JSONClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 12345;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.printf("TcpJSON SERVER_IP=%s port=%s\n", SERVER_IP,SERVER_PORT);
		
		Socket socket = new Socket(SERVER_IP, SERVER_PORT);
		

	}

}
