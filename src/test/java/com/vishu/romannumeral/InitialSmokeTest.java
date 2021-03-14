package com.vishu.romannumeral;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vishu.romannumeral.NumToRomanController;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class InitialSmokeTest {
	
	@Autowired
	private NumToRomanController numToRomanController;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(numToRomanController).isNotNull();
	}
}
