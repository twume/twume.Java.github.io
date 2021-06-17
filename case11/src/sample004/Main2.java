package sample004;

import java.net.*;
import java.io.*;

public class Main2 {
	public static void main(String[] args) {
		try {
			Socket sock = new Socket("smtp.example.com", 60025);
			OutputStream os = sock.getOutputStream();
			os.write("HELO example.com\r\n".getBytes());
			os.write("MAIL FORM: asaka@example.com\r\n".getBytes());
			//以下同じ要領で
			os.flush();
			os.close();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
