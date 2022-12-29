import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class fileWorld {
	public static void main(String[] args) throws FileNotFoundException {

		// read data from data.csv and store data in hash map and print it too screen
		try {
			Scanner sc = new Scanner(new File("data.csv"));
			HashMap<String, String[]> myData = new HashMap<String, String[]>();
			String key;
			while (sc.hasNext()) {
				String[] line = sc.nextLine().split(",");
				for (int i = 0; i < line.length; i++) {
					key = line[0];
					myData.put(key, line);
				}
			}
			for (Entry<String, String[]> entry : myData.entrySet())
				System.out.println(entry.getKey() + " => " + Arrays.toString(entry.getValue()));

			sc.close();
		} catch (Exception e) {
			System.out.print("File does not exit");
		}

		// create a file named data.csv and store data in it
		try {
			Scanner sc = new Scanner(System.in);
			PrintWriter writer = new PrintWriter(new FileWriter("data1.csv", true));
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			writer.write(name);
			writer.append(",");
			System.out.println("Enter your email: ");
			String email = sc.nextLine();
			writer.write(email);
			writer.append(",");
			writer.write("true");
			writer.append("\n");
			sc.close();
			System.out.println();
			Scanner scan = new Scanner(new File("data1.csv"));
			while (scan.hasNext())
				System.out.println(scan.nextLine());
			writer.close();

		} catch (Exception e) {
			System.out.print("File does not exit");
		}

		// Process all lines one by one from input.txt above and then convert those to
		// uppercase and then write the following to the result.txt file
		try {
			Scanner textFile = new Scanner(new File("input.txt"));
			ArrayList<String> list = new ArrayList<String>();
			PrintWriter output = new PrintWriter("result.txt");

			while (textFile.hasNext()) {
				list.add(textFile.nextLine());
			}
			for (int i = 0; i < list.size(); i++) {
				output.write(list.get(i).toUpperCase() + "\n");
			}
			output.close();
		} catch (Exception e) {
			System.out.print("File does not exit");
		}

	} // End of class main
}// End of class fileWorld
