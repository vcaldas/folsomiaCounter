package com.vcaldas.Folsomia_Counter;

import java.io.File;
import java.io.FilenameFilter;

public class AppDev {
	private static File INPUTDIR = new File("/Users/caldas/Dropbox/Photos Folsomia");
	private static int NFiles;
	private static File[] listOfFiles;  
	
	public static void main(final String... args) {
		
		// Populate File array
		listOfFiles = getFiles(INPUTDIR,".jpg");
			
		
		
		
		
	    for (int i = 0; i < listOfFiles.length; i++) {
	      if (listOfFiles[i].isFile()) {
	        System.out.println("File " + listOfFiles[i].getName());
	      } else if (listOfFiles[i].isDirectory()) {
	        System.out.println("Directory " + listOfFiles[i].getName());
	      }
	    }
	    
	    	
	    NFiles = listOfFiles.length;
		
		System.out.println(NFiles);
		
		
	}
	



 /**
  * Returns an File array containing all files of a given directory
  * that meets the extension criteria.
  *
  * @param  inputdir a directory (File)
  * @param  extension the image extension to filter (e.g. ".JPG")
  * @return     the File array
  */        

	private static File[] getFiles(File inputdir, String extension) {
				return inputdir.listFiles( new FilenameFilter() {
			public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(extension.toLowerCase());
			}
				});
	}

	

	
	
}
