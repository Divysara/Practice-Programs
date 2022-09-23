import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;

import io.netty.util.internal.ThreadLocalRandom;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();


			// System.out.println(random.nextInt(10));
			// System.out.println(random.nextInt(10));
			System.out.println(Math.random()*10);
			System.out.println(ThreadLocalRandom.current().nextInt(1, 10));

		Faker fake = new Faker(new Locale("en-IND"));
		System.out.println(fake.name().fullName());
		System.out.println(fake.country().capital());
		System.out.println(fake.letterify("divi"));

		//System.out.println(fake.date().future(20, TimeUnit.DAYS));
		//System.out.println(fake.date().between(date, ));
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();  


	    System.out.println(formatter.format(date));

		String futureDate = formatter.format(fake.date().future(20, TimeUnit.DAYS));
		System.out.println(futureDate);

		  Calendar c = Calendar.getInstance();

		  c.setTime(date); // Now use today date.

		  c.add(Calendar.DAY_OF_YEAR, 150);

		  System.out.println(""+ c.getTime()); // Adds 15 days Date todate =
		  System.out.println(formatter.format(c.getTime()));



	}

}
