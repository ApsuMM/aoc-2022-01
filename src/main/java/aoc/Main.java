package aoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader(Main.class.getClassLoader().getResource("data.txt").getFile()));
		int finalElf = 0;
		int currentElf = 0;
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			if(line.isEmpty())
			{
				finalElf = finalElf < currentElf ? currentElf : finalElf;
				currentElf = 0;
				continue;
			}
			currentElf += Integer.valueOf(line);
		}
		System.out.println(finalElf);
	}
}
