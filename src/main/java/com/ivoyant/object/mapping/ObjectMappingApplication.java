package com.ivoyant.object.mapping;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivoyant.object.mapping.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ObjectMappingApplication {
//	Map Json to Person
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\"firstName\":\"Navruzbek\", \"lastName\": \"Noraliev\", \"dob\":\"03/21/1997\"}";


		try{
			Person person = mapper.readValue(jsonString, Person.class);
			System.out.println(person);
			jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
			System.out.println(jsonString);
		}
		catch (JsonParseException e) { e.printStackTrace();}
		catch (JsonMappingException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
		SpringApplication.run(ObjectMappingApplication.class, args);
	}

}
