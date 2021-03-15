package com.vishu.romannumeral;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.vishu.romannumeral.services.NumberConversionService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class NumberConversionServiceTest {
	
	@Autowired
	private NumberConversionService numConversionService;
	
	@Test
	public void convertUnits() throws Exception {
		assertThat(this.numConversionService.getRomanNumeralForInt(7)).hasFieldOrPropertyWithValue("output", "VII");
	}
	
	@Test
	public void convertTensOver50() throws Exception {
		assertThat(this.numConversionService.getRomanNumeralForInt(87)).hasFieldOrPropertyWithValue("output", "LXXXVII");
	}
	
	@Test
	public void convertTensUnder50() throws Exception {
		assertThat(this.numConversionService.getRomanNumeralForInt(37)).hasFieldOrPropertyWithValue("output", "XXXVII");
	}
	
	@Test
	public void convertHundreds() throws Exception {
		assertThat(this.numConversionService.getRomanNumeralForInt(174)).hasFieldOrPropertyWithValue("output", "CLXXIV");
	}
	
	@Test
	public void convertTwoHundreds() throws Exception {
		assertThat(this.numConversionService.getRomanNumeralForInt(221)).hasFieldOrPropertyWithValue("output", "CCXXI");
	}

}
