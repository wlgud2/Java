package fileIOtest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		Path fromPath = Paths.get("D:/ChromDownload/dog.jpg");
		Path toPath = Paths.get("../../sample");
		String fileName = fromPath.getFileName().toString();
		System.out.println("filename: " + fileName);

		int extentionIndex = fileName.lastIndexOf(".");
		String fileNameWithoutExtention = fileName.substring(0, extentionIndex);
		String extention = fileName.substring(extentionIndex, fileName.length());
		System.out.println("확장자 제거 filename: " + fileNameWithoutExtention);

		int index = 1;
		while (Files.list(toPath).count() < 10) {
			Files.copy(fromPath, toPath.resolve(fileNameWithoutExtention + index + extention));
			index++;
		}
	}

}
