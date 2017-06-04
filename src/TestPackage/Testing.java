package TestPackage;
import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Test;

public class Testing {
	@Test
	public void Multiply() {
		expect().
			body("Subtraction", equalTo(1.67f)).
			
		when().
			get("http://52.14.40.69:8085/Arithmetic/rest/subtraction/10.67/9");
	}

	@Test
	public void Sum() {
		expect().
			body("Sum", equalTo(66)).
			
		when().
			get("http://52.14.40.69:8085/Arithmetic/rest/sum/6/60");
	}

}