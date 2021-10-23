package com.auth.controller.request;

public class TokenRequest {
	private String type;

	public TokenRequest(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TokenRequest [type=" + type + "]";
	}

}
