package com.adobe.romannumeral;

/**
 * 
 * Application message catalog for response and logging.
 *
 */
public enum Messages {
	UnsupportedInput("Unsupported query value. Please enter query value between 1 to 255");
	
	public final String label;

    private Messages(String label) {
        this.label = label;
    }

}
