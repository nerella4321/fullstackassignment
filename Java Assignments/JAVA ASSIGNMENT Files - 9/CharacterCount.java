package com;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
public class CharacterCount{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:\Users\USER\OneDrive\Desktop\program\\Hello.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count=0;
        	while ((line = br.readLine()) !=null) {
        		String words[]=line.split(" ");
        		for(String word:words)
          	        count=count+word.length();
		}
         	br.close();
		fr.close();
		System.out.println(count);
	}
}

