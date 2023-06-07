package fileIOtest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileDelete {

	public static void main(String[] args) throws IOException {
		Path root = Paths.get("../../sample");
		List<Path> files = Files.walk(root).filter(Files::isRegularFile).collect(Collectors.toList());
		for (Path file : files) {
			System.out.println(file);
			Files.delete(file);
		}
	}

}
