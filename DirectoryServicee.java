package com.LockersView.services;

import java.io.File;



import com.LockersView.entities.Directory;



public class DirectoryServicee {
	
	
 
	private static Directory fileDirectory = new Directory();
    
    public static void PrintFiles() {
    	
    	fileDirectory.fillFiles();

        for (File file : DirectoryServicee.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static Directory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directory fileDirectory) {
    	DirectoryServicee.fileDirectory = fileDirectory;
    }
}
