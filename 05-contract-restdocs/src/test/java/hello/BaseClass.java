package hello;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.turkcell.akademi.spring.training.contract.Person;
import com.turkcell.akademi.spring.training.contract.PersonRestController;
import com.turkcell.akademi.spring.training.contract.PersonService;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(MockitoJUnitRunner.class)
public class BaseClass {

	@InjectMocks
	PersonRestController personRestController;
	
	@Mock
	PersonService personService;
	
	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(personRestController);
		
		Person person1 = new Person();
		person1.setId(1l);
		person1.setName("foo");
		person1.setSurname("bee");
		when(personService.findById(1l)).thenReturn(person1);
		
		Person person2 = new Person();
		person2.setId(2l);
		person2.setName("hebele");
		person2.setSurname("hübele");
		when(personService.findById(2l)).thenReturn(person2);
		
	}
	
}
