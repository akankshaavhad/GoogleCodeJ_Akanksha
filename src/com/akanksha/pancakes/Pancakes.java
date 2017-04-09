package com.akanksha.pancakes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pancakes {

	public static void main(String[] args) throws IOException {
		File dir = new File(".");
		PancakeHelper pan=new PancakeHelper();
		 
		String source = dir.getCanonicalPath() + File.separator + "Code.txt";
		String dest = dir.getCanonicalPath() + File.separator + "Dest.txt";
 
		File fin = new File(source);
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
		FileWriter fstream = new FileWriter(dest, true);
		BufferedWriter out = new BufferedWriter(fstream);
		in.readLine(); 
		String aLine = null;
		while ((aLine = in.readLine()) != null) {
			
			String number= pan.helpconvert(aLine);
			out.write(number);		
			out.newLine();
		}
 
		// do not forget to close the buffer reader
		in.close();
 
		// close buffer writer
		out.close();

	}

}
