package co.grandcircus.Lab2223;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@Autowired
	private Person personFromForm;
	
	@RequestMapping("submission")
	public ModelAndView submitForm(@RequestParam("firstName") String fName, 
			@RequestParam("lastName") String lName, @RequestParam("personAge") int pAge,
			@RequestParam("email") String formEmail, @RequestParam("button") String triforce,
			@RequestParam("drink") String[] drinkChoices, @RequestParam("news") boolean newsletter) {
		personFromForm.setFirstName(fName);
		personFromForm.setLastName(lName);
		personFromForm.setPersonAge(pAge);
		personFromForm.setEmail(formEmail);
		personFromForm.setButton(triforce);
		personFromForm.setDrink(drinkChoices);
		personFromForm.setNews(newsletter);
		
		
		ModelAndView personInfo = new ModelAndView("form-submit", "name",
				personFromForm.getFirstName());
		personInfo.addObject("fullName", 
			personFromForm.getFirstName() + " " + personFromForm.getLastName());
		
		personInfo.addObject("age",
				personFromForm.getPersonAge());
		
		personInfo.addObject("email",
			personFromForm.getEmail());
		
		personInfo.addObject("button",
			personFromForm.getButton());
		
		personInfo.addObject("drinks",
			Arrays.toString(personFromForm.getDrink()));
		
		personInfo.addObject("newsletter",
			personFromForm.getNews());
		
		return personInfo;
	}

}
