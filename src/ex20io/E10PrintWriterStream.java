package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E10PrintWriterStream
{

	public static void main(String[] args) throws IOException
	{
		PrintWriter out = new PrintWriter(new FileWriter("src/ex20io/printf.txt"));
		
		out.print("제 나이는 %d입니다."+ 24);
		out.println(" ");
		
		out.println("저는 피아노 치는걸 좋아해요");
		out.print("노래 부를때 행복해요");
		out.close();
		
		System.out.println("printf.txt 가 생성되었습니다.");
	}

}
