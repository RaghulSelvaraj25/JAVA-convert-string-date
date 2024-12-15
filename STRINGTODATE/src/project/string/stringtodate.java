package project.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class stringtodate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "10-12-24";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");

		try {
			Date date = dateFormat.parse(str);
			System.out.println("String: " + str);
			System.out.println("Date: " + date);
		} catch (ParseException e) {
			System.out.println("Error parsing the date string : " + e.getMessage());

		}

	}

}
