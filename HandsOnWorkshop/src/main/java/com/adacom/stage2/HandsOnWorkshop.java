package com.adacom.stage2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class HandsOnWorkshop {
	
	public static final String INPUT1 = "/Users/nikosmak/Adacom/HandsOnWorkshop/src/main/resources/input1";
	public static final String INPUT2 = "/Users/nikosmak/Adacom/HandsOnWorkshop/src/main/resources/input2";
	public static final String OUTPUT = "/Users/nikosmak/Adacom/HandsOnWorkshop/src/main/resources/output";
	
	public static void main(String[] args) throws IOException {
		File input1 = new File(args[0]);
		FileReader fileReader =  new FileReader(input1);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Collection<String> list1 = new ArrayList<String>();
		
		String inputString = null;
		while ((inputString=bufferedReader.readLine())!=null) {
			list1.add(inputString);
		}
		File input2 = new File(args[1]);
		fileReader = new FileReader(input2);
		bufferedReader = new BufferedReader(fileReader);
		Collection<String> list2 = new ArrayList<String>();
		while ((inputString=bufferedReader.readLine())!=null) {
			list2.add(inputString);
		}
		Collection<String> interception = new ArrayList<String>(list1);
		interception.retainAll(list2);
		File output = new File(args[2]);
		if(!output.exists()) output.createNewFile();
		FileWriter fileWriter = new FileWriter(output);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		for (String currentValue : interception) {
			bufferedWriter.write(currentValue +"\n");
			
		}
		bufferedWriter.flush();
		System.out.println("End");
	}
}
