package day11.m008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice0801 {

	public static void main(String[] args) throws IOException {
		System.out.println("性別を入力してください\n「M」か「F」を入力してください。 ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String text = reader.readLine();
		
		 switch (text) { 
	        case "M": 
	            System.out.println("性別を男性で登録しました。"); 
	            break;
	        case "F": 
	            System.out.println("性別を女性で登録しました。");
	            break;
		}
		}
	}


