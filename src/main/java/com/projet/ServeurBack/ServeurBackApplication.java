package com.projet.ServeurBack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tomcat.jni.FileInfo;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.example.FileController.ServeurBack.FileController;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class ServeurBackApplication {

    public static void main(String[] args) throws IOException {
       	
byte[] contenuFichier = Files.readAllBytes(Paths.get("data.json"));
    MultipartFile fichier = new MockMultipartFile("file", "data.json", "application/json",
			contenuFichier);
		FileController fileController = new FileController();
		// File file;
		// if (!((MultipartFile) file).isEmpty()) {
		// 	byte[] bytes = ((MultipartFile) file).getBytes();
		// 	Path path = Paths.get("../../../../uploads/data.json");
		// 	Files.write(path, bytes);
		{
		}
		fileController.handleFileUpload(fichier);
    }
}

