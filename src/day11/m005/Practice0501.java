package day11.m005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0501 {

	public static void main(String[] args) throws IOException {
		System.out.println("好きな食べ物を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = reader.readLine();
		
		System.out.println("好きな食べ物は" + str1 + "です。 ");
		
		
	}

}
