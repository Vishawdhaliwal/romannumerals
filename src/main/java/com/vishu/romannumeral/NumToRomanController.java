package com.vishu.romannumeral;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vishu.romannumeral.services.NumberConversionService;
import com.vishu.romannumeral.utils.Messages;

@RestController
public class NumToRomanController {
	
	//Inject NumberConversionService.
	@Autowired
	private NumberConversionService numConversionService;

	/**
	 * 
	 * @param query
	 * @return ApiResponseInterface
	 * 
	 *         Performs conversion of numeric query parameter to Roman Numerals.
	 * @see Roman numerals reference - https://en.wikipedia.org/wiki/Roman_numerals
	 * 
	 */
	@GetMapping("/romannumeral")
	public ApiResponseInterface apiresponse(@RequestParam(required = true) int query) {
		Logger log = LoggerFactory.getLogger(NumToRomanController.class);
		
		log.info(Messages.LogRequest.label+query);
		
		return numConversionService.getRomanNumeralForInt(query);
	}

}
