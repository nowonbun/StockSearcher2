package com.nowonbun.stockSearcher2;

public class Main {

	public static void main(String[] args) {
		String cmd = getParameter(args, 0);
		Runnable obj = null;
		if (cmd == null) {
			System.out.println("****Usage****");
			System.out.println("INIT: init stock list");
			return;
		}
		if ("INIT".equals(cmd.toUpperCase())) {
			String filename = getParameter(args, 1);
			if (filename == null) {
				System.out.println("Please input excel file");
				return;
			}
			obj = new InitController(filename);
		}
		if (obj == null) {
			System.out.println("Not command!");
		} else {
			obj.run();
			System.out.println("Process finish!!");
		}
	}

	private static String getParameter(String[] args, int index) {
		if (args.length > index) {
			return args[index];
		}
		return null;
	}
}
