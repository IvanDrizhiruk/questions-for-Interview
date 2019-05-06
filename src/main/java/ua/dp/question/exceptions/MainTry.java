package ua.dp.question.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTry {

	public static void main(String[] args) {
		try {
			try {
				readFile("megafile.txt");
				return;
			}
			catch (IOException e) {
				System.out.println("Level 2 exception " + e);
			}
			finally {
				System.out.println("Level 2 finaly");
			}
		}
		catch (Exception e) {
			System.out.println("Level 1 exception " + e);
		}
		finally {
			System.out.println("Level 1 finaly");
		}
	}

	private static void readFile(String s) throws FileNotFoundException {
	}
}
