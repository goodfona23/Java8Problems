package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class Case1 {
	private static List<City> prepareTemperature()
	{
	    List<City> cities = new ArrayList<>();
	    cities.add(new City("New Delhi", 33.5));
	    cities.add(new City("Mexico", 14));
	    cities.add(new City("New York", 13));
	    cities.add(new City("Dubai", 43));
	    cities.add(new City("London", 15));
	    cities.add(new City("Alaska", 1));
	    cities.add(new City("Kolkata", 30));
	    cities.add(new City("Sydney", 11));
	    cities.add(new City("Mexico", 14));
	    cities.add(new City("Dubai", 43));
	    return cities;
	}

	public static void main(String[] args) {
		
		
		//Collectors.toSet  This method will return Set instance and it doesn't contain any duplicates.
		prepareTemperature().stream().filter(e->e.getTemperature()>10).collect(Collectors.toSet());
		System.out.println(prepareTemperature());
		
		System.out.println(prepareTemperature()
                .stream()
                .collect(Collectors.groupingBy(
                            City::getName,
                            Collectors.mapping(
                                City::getTemperature,
                                Collectors.toList()))));
		
	}
}
