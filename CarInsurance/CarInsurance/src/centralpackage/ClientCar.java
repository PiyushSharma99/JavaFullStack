package centralpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

import Display.DisplayElement;
import validator.LatestElementProcessing;

public class ClientCar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String ch;
		ArrayList<String[]> list = new ArrayList<String[]>();
		try {
			do {

				System.out.println("Enter car model name , car type ," +
						" insurance type and car price separated by white space");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

				String stringlines = reader.readLine();

				String[] entityStrings = stringlines.trim().split("\\s+");

				list.add(entityStrings);

				LatestElementProcessing latestElementProcessing = new
						LatestElementProcessing(list.get(list.size() - 1));

				if (!latestElementProcessing.processData().equals(0))
					list.remove(list.size() - 1);

				System.out.println("Do you want to enter "
						+ "details of anymore cars? (y/n) ");
				ch = reader.readLine();
			} while (Objects.equals(ch, "y"));

			DisplayElement displayElement = new DisplayElement();
			displayElement.printElements(list);

		}catch(Exception e )
		{
			System.out.println(e.getMessage());
		}
	}

}
