package com.vishu.romannumeral;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumToRomanController {

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
		
		ApiResponseInterface response;

		// Only support conversion of numbers 1 to 255
		if (query >= 1 && query <= 255) {
			String hundereds = Constants.romanDictionary.get(RomanChars.C)[(query % 1000) / 100];
			String tens = Constants.romanDictionary.get(RomanChars.X)[(query % 100) / 10];
			String ones = Constants.romanDictionary.get(RomanChars.I)[query % 10];

			String output = hundereds + tens + ones;

			response = new ApiSuccessResponse(query, output);
		} else {
			response = new ApiErrorResponse(Messages.UnsupportedInput.label);
		}

		return response;
	}

}
