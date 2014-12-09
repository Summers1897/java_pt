package com.k.web.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class MultiUser extends Thread {
	private Socket client;
	public MultiUser(Socket c) {
		client = c;
	}
	@Override
	public void run() {
		try {
			System.out.println("run" + System.currentTimeMillis());
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream());
			while (true) {
				String str = in.readLine();
				System.out.println(str);
				out.println("has receive....");
				out.flush();
				if (str.equals("end")) {
					break;
				}
			}
			client.close();
		} catch (IOException ex) {
		} finally {
		}
	}
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(5678);
		while (true) {
			System.out.println("main" + System.currentTimeMillis());
			MultiUser mu = new MultiUser(server.accept());
			System.out.println("cccccccc");
			mu.start();
		}
	}
}