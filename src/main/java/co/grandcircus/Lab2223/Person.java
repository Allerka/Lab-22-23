package co.grandcircus.Lab2223;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String firstName;
	private String lastName;
	private int personAge;
	private String email;
	
	private String button;
	private String[] drink;
	private boolean news;
	
	public Person() {
	}

	public Person(String firstName, String lastName, int personAge, String email, String button, String[] drink,
			boolean news) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.personAge = personAge;
		this.email = email;
		this.button = button;
		this.drink = drink;
		this.news = news;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getButton() {
		return button;
	}
	public void setButton(String button) {
		this.button = button;
	}
	public String[] getDrink() {
		return drink;
	}
	public void setDrink(String[] drink) {
		this.drink = drink;
	}
	public boolean getNews() {
		return news;
	}
	public void setNews(boolean news) {
		this.news = news;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + personAge + ", email=" + email
				+ ", button=" + button + ", drink=" + Arrays.toString(drink) + ", news=" + news + "]";
	}
	
	
}
