package com.famanet.exception;

@SuppressWarnings("serial")
public class ApplicationException extends Exception {
	
	public ApplicationException()
	{
		super();
	}
	public ApplicationException(String msg)
	{
		super(msg);
	}

}
