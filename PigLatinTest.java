import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	void requiredTest1() {
		assertEquals("appleway", PigLatin.translate("apple"));
		
	}
	void requiredTest2() {
		assertEquals("elseway", PigLatin.translate("else"));
		
	}
	void requiredTest3() {
		assertEquals("iraffegay", PigLatin.translate("giraffe"));
		
	}
	
	
	
	@Test
	void test1() {
		assertEquals("orangeway", PigLatin.translate("orange"));
		
	}
	@Test
	void test2() {
		assertEquals("obtuseway", PigLatin.translate("obtuse"));
		
	}
	@Test
	void test3() {
		assertEquals("erodeway", PigLatin.translate("Erode"));
		
	}
	@Test
	void test4() {
		assertEquals("uniformway", PigLatin.translate("uniform"));
		
	}
	@Test
	void test5() {
		assertEquals("egregiousway", PigLatin.translate("egregious"));
		
	}
	@Test
	void test6() {
		assertEquals("olarpay", PigLatin.translate("polar"));
		
	}
	@Test
	void test7() {
		assertEquals("ortunefay", PigLatin.translate("fortune"));
		
	}
	@Test
	void test8() {
		assertEquals("erodactylptay", PigLatin.translate("pterodactyl"));
		
	}
	@Test
	void test9() {
		assertEquals("engthstray", PigLatin.translate("strength"));
		
	}
	@Test
	void test10() {
		assertEquals("owercaselay", PigLatin.translate("LoWeRcAsE"));
		
	}





}
