package com.vishu.romannumeral;

/**
 * 
 * Api response POJO for success responses.
 *
 */
public class ApiSuccessResponse implements ApiResponseInterface{
	private int input;
	private String output;

	public ApiSuccessResponse(int input, String output) {
		this.setInput(input);
		this.setOutput(output);
	}
	

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}




}
