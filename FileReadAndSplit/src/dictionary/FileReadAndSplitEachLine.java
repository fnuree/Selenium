// Author: Angcon Podder
// Created: June 13th, 2018
// Objective: Reading File and Splitting each line in a patter for word and meanings


package dictionary;

import java.io.*;
import java.util.Scanner;

public class FileReadAndSplitEachLine {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String path;
        System.out.println("Enter full Filepath:");
        Scanner sc = new Scanner(System.in);
        path = sc.next(); 
        
        doesFileExist(path);

        sc.close();
    }
	
	
	public static void doesFileExist(String path) {
        try {
            FileInputStream fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine = ""; 
            while((strLine = br.readLine()) != null) {
                //System.out.println(strLine);
                String[] arrayLines = strLine.split(" – "); //this is not a regular dash, it came with file from with word document
                
                
                for (int i=0;i<arrayLines.length; i++) {
                	if(i%2==0) {
                		System.out.println(arrayLines[i]);
                		
                	}
                	else {
                		String[] arrayMearnings = arrayLines[i].split(", ");
                		
                		for (String meaning : arrayMearnings) {
                            System.out.println(meaning);
                        }
                	}

                }

            }
 
            br.close();         
        }
        
        
        
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                path + "'");                
        }
        
        catch(IOException ex) {
            ex.printStackTrace();
        }
	}
	

}
