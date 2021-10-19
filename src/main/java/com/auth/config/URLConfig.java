package com.auth.config;

/**
 * @author Prabhu.Ganapathylingam
 * @since 10/15/2021
 * @version 1.0
 * @see
 */
public final class URLConfig {

	private static StringBuilder builder;

	private URLConfig() {

	}

	// Error controller static variables
	public static final String ERROR_CONTROLLER_PATH = "/error";

	// Token controller static path constant variables
	public static final String TOKEN_CONTROLLER_PATH = "/token";
	public static final String CREATE_TOKEN_PATH = "/createToken";
	public static final String DELETE_TOKEN_PATH = "/deleteToken";
	public static final String FIND_TOKEN_PATH = "/findToken";
	public static final String UPDATE_TOKEN_PATH = "/updateToken";

	public static StringBuilder getBuilder() {
		if (builder != null)
			builder.setLength(0);
		else
			builder = new StringBuilder();
		return builder;
	}

	public static String joinPath(String path, String method) {
		return getBuilder().append(method).toString();
	}
}
