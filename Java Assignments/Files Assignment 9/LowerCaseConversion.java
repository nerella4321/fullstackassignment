package com;
import java.io.FileReader;
import java.io.FileWriter;
public class LowerCaseConversion {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:\Users\USER\OneDrive\Desktop\program\\Hello.txt");
		FileWriter fw = new FileWriter("C:\Users\USER\OneDrive\Desktop\program\\Lesson.txt");
		int ch;
		while((ch=fr.read()) != -1) {	
			 if (Character.isUpperCase(ch))
				 fw.write( (int) Character.toLowerCase(ch) );
			 else
				 fw.write(ch);
		}

		fr.close();
		fw.close();
		System.out.println("Input file data converted to uppercase in target file");
	}

}

