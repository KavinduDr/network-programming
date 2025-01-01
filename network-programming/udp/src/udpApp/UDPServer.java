package udpApp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket server = new DatagramSocket(4412);
		byte[] buf = new byte[256];
		
		DatagramPacket pac = new DatagramPacket(buf, buf.length);
		server.receive(pac);
		
		String response = new String(pac.getData());
		
		
		System.out.println("Recieved data: "+ response);
		server.close();
	}

}
