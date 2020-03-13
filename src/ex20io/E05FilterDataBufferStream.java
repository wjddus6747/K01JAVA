package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 파일에 정수/실수와 같은 데이터를 저장하는 필터스트림과 버퍼링을 
 제공하는 필터스트림끼지 추가적으로 연결한후 피일을 생성하는 프로그램
 이처럼 필터스트림은 여러개를 연결하는것이 가능하다.
 */
public class E05FilterDataBufferStream
{

	public static void main(String[] args)
	{
		String src = "src/ex20io/dataBufferStream.bin";
		
		try {
			//1.파일생성을 위한 출력 파일 스트림 생성
			OutputStream out = new FileOutputStream(src);
			
			//2. 버퍼사용을 위한 필터스트림 생성
			BufferedOutputStream bufFileterOut = new BufferedOutputStream(out);
			//3.파일에 기본자료형 데이터를 저장하기 위한 필터스트림
			DataOutputStream dataFileterOut = new DataOutputStream(bufFileterOut);
			
			dataFileterOut.writeInt(555);
			dataFileterOut.writeDouble(55.55);
			dataFileterOut.writeInt(999);
			dataFileterOut.writeDouble(99.55);
			
			dataFileterOut.close();
			
			//3개의 스트림을 한번에 생성한다.
			DataInputStream dataFilterIn = new DataInputStream(
					new BufferedInputStream(new FileInputStream(src)));
			
			//각각의 데이터를 읽어옴
			int intNum1 = dataFilterIn.readInt();
			double dNnum1 = dataFilterIn.readDouble();
			double dNnum2 = dataFilterIn.readDouble();
			int intNum2 = dataFilterIn.readInt();
			
			dataFilterIn.close();
			
			System.out.printf("저장된 정수는 %d,%d\n", intNum1, intNum2);
			System.out.printf("저장된 실수는 %.2f, %.2f%n", dNnum1,dNnum2);
		}
		catch (Exception e) {
			System.out.println("IO예외발생");
			e.printStackTrace();
		}
	}

}
