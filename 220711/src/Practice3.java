import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User implements Serializable{
	int number;
	String name;
	String phoneNumber;
	String mail;
	public User(int number, String name, String phoneNumber, String mail) {
		super();
		this.number = number;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "User [number=" + number + ", name=" + name + ", phoneNumber=" + phoneNumber + ", mail=" + mail + "]";
	}
}


public class Practice3 {
	public static void main(String[] args) {
		// 등록
		User user1 = new User(1, "홍길동", "011-111-1111", "hong@hanmainl.net");
		User user2 = new User(2, "김유신", "010-222-2222", "kim@hanmainl.net");
	
		File userFile = new File("d:\\filetest\\user.ser");
		
		// 파일에 넣음
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(userFile));
			oos.writeObject(user1);
			oos.writeObject(user2);
			oos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("출력완료");
		////////////////////////////////////////////////////////////파일 만듦////////////////
		
		// 파일 읽음 모든 유저를 List에 넣음.
		ObjectInputStream ois = null;
		List<User> userList= new ArrayList<>();
		File file = new File("d:\\filetest\\user.ser");
		System.out.println(file.exists());
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			while (true) {
			userList.add((User)ois.readObject());
			System.out.println(userList);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("유저 다 다음");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		/////////////////////////////////////////////////파일 읽음//////////////
		
		// read 된 유저List로 전화번호 가져오기
		Scanner scan = new Scanner(System.in);
		System.out.println("번호 입력");
		int input = scan.nextInt();
		for (int i = 0; i < userList.size(); i++) {
			if(input == userList.get(i).getNumber()) {
				System.out.println(userList.get(i).getPhoneNumber());
			}
		}
	}
}
