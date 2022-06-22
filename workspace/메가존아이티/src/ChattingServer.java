import java.io.*;
import java.net.*;

// 서버는 클라이언트와 다른점 : 먼저 생성되고 다시 거기에 맞춰서 기다려야 한다. 클라이언트로부터 접속 요청을 대기해야 한다. 
// 클라이언트 접송 요청 서버는 접송요청 대기에 들어가야 한다.
// 소켓을 서버소켓이라는 클래스로 만들었다.
public class ChattingServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		System.out.println("서버가 곧 동작을 시작합니다.");
		serverSocket = new ServerSocket(8000);
		System.out.println("서버가 8000번 포트를 점유했습니다.");	// 클라이언트가 요청을 해도 받을수 잇는 준비는 되지 않았다. 즉 가게를 열기 위해서 터는 잡고 인테리어는 됐으나 점원이 준비되지 않았다.
		
		System.out.println("서버가 클라이언트의 접속 요청을 기다리고 있습니다.");
		Socket clientSocket = serverSocket.accept();
		
		// 42분 10초까지 들었다.
	}
}
