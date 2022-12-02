package aoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader(Main.class.getClassLoader().getResource("data.txt").getFile()));
		List<Integer> elfs = new ArrayList<Integer>();
		
		int finalElf = 0;
		int currentElf = 0;
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			if(line.isEmpty())
			{
				elfs.add(currentElf);
				currentElf = 0;
				continue;
			}
			currentElf += Integer.valueOf(line);
		}
		elfs.sort(Comparator.reverseOrder());
		
		for (int i = 0; i < 3; i++)
		{
			finalElf += elfs.get(i);
		}

		System.out.println(finalElf);
	}
}
