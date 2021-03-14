package com.vishu.romannumeral.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.vishu.romannumeral.ApiErrorResponse;
import com.vishu.romannumeral.ApiResponseInterface;
import com.vishu.romannumeral.ApiSuccessResponse;
import com.vishu.romannumeral.utils.Constants;
import com.vishu.romannumeral.utils.Messages;
import com.vishu.romannumeral.utils.RomanChars;

/**
 * 
 * Service for conversion of numbers. Currently only supports decimal to roman number conversion for values 1 to 255.
 *
 */
@Service
public class NumberConversionService {
	
	Logger log = LoggerFactory.getLogger(NumberConversionService.class);
	
	/**
	 * 
	 * @param input
	 * @return ApiResponseInterface type.
	 * Converts decimal numbers from 1 to 255.
	 * Only support conversion of numbers 1 to 255. Update romanDecitionary and validation to extend support for larger values.
	 */
	public ApiResponseInterface getRomanNumeralForInt(int input) {
		ApiResponseInterface response;

		if (input >= 1 && input <= 255) {
			String hundereds = Constants.romanDictionary.get(RomanChars.C)[(input % 1000) / 100];
			String tens = Constants.romanDictionary.get(RomanChars.X)[(input % 100) / 10];
			String ones = Constants.romanDictionary.get(RomanChars.I)[input % 10];

			String output = hundereds + tens + ones;
			log.info(Messages.ConversionToRomanSuccess.label+ output);
			
			response = new ApiSuccessResponse(input, output);
		} else {
			log.error(Messages.InvalidInput.label+ input);
			response = new ApiErrorResponse(Messages.UnsupportedInput.label);
		}
		
		return response;
	}

}
