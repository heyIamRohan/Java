package com.qsp;
import java.io.File;
public class CreateFolder {
	public static void main(String[]args) {
		File f = new File("D:\\Java");
		boolean b = f.mkdir();
		if(b)
			System.out.println("Folder Created Successfully");
		else
			System.out.println("Folder Not Created");
	}
}
