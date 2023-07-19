package com.swap.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
//	public final String UPLOAD_DIR="C:\\Users\\prati\\Documents\\workspace-spring-tool-suite-4-4.18.0.RELEASE\\Department";

	
	public final String UPLOAD_DIR=new ClassPathResource("static").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException {
		
	}
	
//	\\src\\main\\resources\\static\\image
//	C:\Users\prati\Documents\workspace-spring-tool-suite-4-4.18.0.RELEASE\Department\result.csv
	public boolean uploadFile(MultipartFile multipartFile) {
		
	    int i=0;
	    String filename="result.csv";
	    Path pathToFile = Paths.get(filename);
	    
	    System.out.println(pathToFile.toAbsolutePath());
		
		boolean f = false;
		try {
//			InputStream is =  multipartFile.getInputStream();
//			byte data[] = new byte[is.available()];
//			is.read(data);
//			
//			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
//			fos.write(data);
//			fos.flush();
//			fos.close();
			
			Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	

}
