package day11.m008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0802 {

	public static void main(String[] args) throws IOException {
		System.out.println("西暦年を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String text = reader.readLine();
		int num = Integer.parseInt(text);
		
		if ((num % 4 == 0 && num % 100 != 0 ) || num % 400 == 0) {
			System.out.println("うるう年です。 ");
		} else {
            System.out.println("うるう年ではありません。");
        }

	}

}
