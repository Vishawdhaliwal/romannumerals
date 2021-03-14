package com.vishu.romannumeral;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vishu.romannumeral.NumToRomanController;
import com.vishu.romannumeral.services.NumberConversionService;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class InitialSmokeTest {
	
	@Autowired
	private NumToRomanController numToRomanController;
	
	@Autowired
	private NumberConversionService numConversionService;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(numToRomanController).isNotNull();
		assertThat(numConversionService).isNotNull();
	}
}
