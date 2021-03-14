package com.vishu.romannumeral.utils;

/**
 * 
 * Application message catalog for response and logging.
 *
 */
public enum Messages {
	UnsupportedInput("Unsupported query value. Please enter query value between 1 to 255"),
	LogRequest("API invoked for input "),
	InvalidInput("Invalid input received. "),
	ConversionToRomanSuccess("Input converted succesfully. ");
	
	public final String label;

    private Messages(String label) {
        this.label = label;
    }

}
