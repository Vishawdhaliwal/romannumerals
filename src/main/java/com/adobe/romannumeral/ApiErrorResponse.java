package com.adobe.romannumeral;

/**
 * 
 * Api response POJO for error responses.
 * 
 */
public class ApiErrorResponse implements ApiResponseInterface {
	
	private String errorMsg;
	
	public ApiErrorResponse(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
