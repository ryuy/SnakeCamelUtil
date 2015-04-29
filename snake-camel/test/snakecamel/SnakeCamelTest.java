package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class SnakeCamelTest {

	
	@Test
	public void test1() {
		StringBuilder sb = new StringBuilder();
		//SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected="FLumpOol";
			String actual=SnakeCamelUtil.snakeToCamelcase("f_lump_ool");
				assertThat(actual,is(expected));
				
	}
	
	@Test
	public void test2() {
		StringBuilder sb = new StringBuilder();
		//SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected="a_pp_le";
		String actual=SnakeCamelUtil.camelToSnakecase("APpLe");
			assertThat(actual,is(expected));
	}
	@Test
	public void test3() {
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected="Japan";
		String actual=SnakeCamelUtil.capitalize("japan");
		 assertThat(actual,is(expected));
	}
	@Test
	public void test4() {
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected="blueberry";
		String actual=SnakeCamelUtil.uncapitalize("Blueberry");
		 assertThat(actual,is(expected));
		
	}
}
