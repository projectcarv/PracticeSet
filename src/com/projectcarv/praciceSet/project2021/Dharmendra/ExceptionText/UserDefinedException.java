package com.projectcarv.praciceSet.project2021.Dharmendra.ExceptionText;

public class UserDefinedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5658848562499117950L;
	
	private String msg;
	private String code;


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public UserDefinedException(String msg) {
		super();
		this.msg = msg;
	}


	public UserDefinedException(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

}
