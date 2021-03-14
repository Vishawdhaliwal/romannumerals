package com.adobe.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	/**
	 * Dictionary lookup for Roman numerals at Units, Tens and Hundreds place. 
	 * To extend functionality to thousands, update the dictionary for Roman numerals in thousands place.
	 */
	@SuppressWarnings("serial")
	public static Map<RomanChars, String[]> romanDictionary = new HashMap<RomanChars, String[]>() {

		{
			put(RomanChars.I, new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" });
			put(RomanChars.X, new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" });
			put(RomanChars.C, new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" });
		}
	};


}
