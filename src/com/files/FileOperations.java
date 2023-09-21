package com.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileOperations {

	public static void main(String[] args) {

		try {
			// If exact path not given, file is created in root dir of project
			File file1 = new File("./src/com/files/text.txt");
			// If some file exists with same name, file is not created.
			boolean isCreated = file1.createNewFile();
			if (isCreated) {
				System.out.println("File has been created");
			} else {
				System.out.println("File has not been created");
			}

			boolean isDirCreated = new File("./src/com/files/testDIR").mkdir();
			if (isDirCreated) {
				System.out.println("Directory has been created");
			} else {
				System.out.println("Directory has not been created");
			}

			try (FileWriter fileWriter = new FileWriter(file1)) {
				fileWriter.append("Writing 1st line.... \n");
				fileWriter.append("Writing 2nd line.... \n");
				fileWriter.append("Writing 3rd line.... \n");
				fileWriter.append("Writing 4th line.... \n");
				fileWriter.append("Writing 5th line....");
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
