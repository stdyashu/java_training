package day11.m005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0502 {

	public static void main(String[] args) throws IOException {
		System.out.println("西暦を入力してください。 ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = reader.readLine();
		int int1 = Integer.parseInt(str1);
		
		System.out.println("来年は" + int1 +"年です。 ");
	}

}
