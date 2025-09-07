package collectors;

//Java program to implement a
//City class

//Defining a city class
public class City {

 // Initializing the properties
 // of the city class
 private String name;
 private double temperature;

 // Parameterized constructor to
 // initialize the city class
 public City(String name, double temperature)
 {
     this.name = name;
     this.temperature = temperature;
 }

 // Getters to get the name and
 // temperature
 public String getName()
 {
     return name;
 }

 public Double getTemperature()
 {
     return temperature;
 }

 // Overriding the toString method
 // to return the name and temperature
 @Override
 public String toString()
 {
     return name + " --> " + temperature;
 }
}