package com.hr.web.command;

import javax.servlet.http.HttpServletRequest;

public class Receiver {
	public static Command cmd = new Command();
	public static void init(HttpServletRequest request) {
		System.out.println("Receiver =");
		cmd = Commander.direct(request);
	}

}
