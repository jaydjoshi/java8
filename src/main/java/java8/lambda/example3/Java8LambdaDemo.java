package java8.lambda.example3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8LambdaDemo {

	public static void main(String[] args) {
		/*
		 * We are creating a travel domain application with a Model City. We need to accomplish certain tasks.
		 */
		
		//list fetched from database
		List<City> list = Arrays.asList(
				new City(1, "Mumbai", 5, "India"),
				new City(2, "Delhi", 4, "India"),
				new City(3, "New York", 5, "USA"),
				new City(4, "Miami", 5, "USA"),
				new City(5, "Paris", 5, "France"));
		
		System.out.println("------------Display all the cities------------");
		display(list);
		
		//Task 1 - Sort City by cityName
		System.out.println("------------Sort City by cityName------------");
		Collections.sort(list, (o1, o2) ->  o1.getCityName().compareTo(o2.getCityName()));
		
		//Task 2 - Display all the cities
		System.out.println("------------Display all the cities------------");
		display(list);
		
		//Task 3 - Filter all cities starting with letter M
		System.out.println("------------Filter all cities starting with letter M------------");
		displayFilteredCities(list, (City c) -> c.getCityName().startsWith("M"));
		
		System.out.println("------------Filter all cities with rating 4 and above------------");
		displayFilteredCities(list, ( c) ->  c.getRating()>=4);
		
		//Task 4 - Filter all cities in country India
		System.out.println("------------Filter all cities in country India------------");
		displayFilteredCities(list, ( c) -> c.getCountryName().equalsIgnoreCase("India"));
		
	}

	private static void displayFilteredCities(List<City> list, Filter filter) {
		for (City city : list) {
			if(filter.doFilter(city))
				System.out.println(city);
		}
	}

	private static void display(List<City> list) {
		for (City city : list) {
			System.out.println(city);
		}
	}

}

