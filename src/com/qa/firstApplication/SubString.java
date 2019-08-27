package com.qa.firstApplication;

public class SubString {

	public static void main(String[] args) {
		String greeting = "Hi there";
		SubString app = new SubString();
		System.out.println(app.replace(greeting, "e", "w"));
	}

	public String replace(String sentence, String before, String after) {
		String returnSentence = "";

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.substring(i, i + 1).equals(before)) {
				returnSentence += after;
			} else {
				returnSentence += sentence.substring(i, i + 1);
			}
		}
		return returnSentence;
	}
}
