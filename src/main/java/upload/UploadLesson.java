package upload;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import javax.servlet.http.Part;

@Named
@SessionScoped
public class UploadLesson implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Part file;
	
	private String language;
	
	public void upload() throws IOException{
		Scanner s = new Scanner(file.getInputStream()) ;
		String fileContent =s.useDelimiter("\\A").next();
		//TODO check errors and other warriors :D
		Files.write(Paths.get("D:\\Fajrant\\"+file.getSubmittedFileName()), fileContent.getBytes(),StandardOpenOption.CREATE);
		
	}
	public void languageUploaded( ValueChangeEvent e) {
		language=e.getNewValue().toString();
		System.out.print(language);
	}
	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}
	
}
