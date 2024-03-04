package FileandAPI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class createFile {
	public void createFile(String fileName) {
	    File file = new File(fileName);
	    try {
	        if (file.createNewFile()) {
	            System.out.println("File created: " + fileName);
	        } else {
	            System.out.println("File already exists.");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void readFile(String fileName) {
	    try {
	        File file = new File(fileName);
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	        br.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void writeFile(String fileName, String content) {
	    try {
	        File file = new File(fileName);
	        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	        bw.write(content);
	        bw.close();
	        System.out.println("File written: " + fileName);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void copyFile(String sourceFileName, String targetFileName) {
	    try {
	        File sourceFile = new File(sourceFileName);
	        File targetFile = new File(targetFileName);
	        Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        System.out.println("File copied: " + sourceFileName + " -> " + targetFileName);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void deleteFile(String fileName) {
	    File file = new File(fileName);
	    if(file.delete()) {
	        System.out.println("File deleted: " + fileName);
	    } else {
	        System.out.println("File not found: " + fileName);
	    }
	}
	public void listFiles(String directoryName) {
	    File directory = new File(directoryName);
	    File[] files = directory.listFiles();
	    if(files == null) {
	        System.out.println("Directory not found: " + directoryName);
	        return;
	    }
	    for (File file : files) {
	        if (file.isFile()) {
	            System.out.println(file.getName());
	        }
	    }
	}
	public String getFileExtension(String fileName) {
	    int index = fileName.lastIndexOf(".");
	    if (index == -1) {
	        return "";
	    }
	    return fileName.substring(index + 1);
	}
	public void readCSV(String fileName) {
	    try {
	        File file = new File(fileName);
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] values = line.split(",");
	            for (String value : values) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	        br.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void writeCSV(String fileName, List<String[]> data) {
	    try {
	        File file = new File(fileName);
	        FileWriter fw = new FileWriter(file);
	        for (String[] rowData : data) {
	            fw.append(String.join(",", rowData));
	            fw.append("\n");
	        }
	        fw.flush();
	        fw.close();
	        System.out.println("CSV file created successfully.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void copyFile1(String sourceFile, String targetFile) {
	    try {
	        File source = new File(sourceFile);
	        File target = new File(targetFile);
	        Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        System.out.println("File copied successfully.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void moveFile(String sourceFile, String targetFile) {
	    try {
	        File source = new File(sourceFile);
	        File target = new File(targetFile);
	        Files.move(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
	        System.out.println("File moved successfully.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


}
