package Moe_Bagheri_HW1;

import java.io.*;
import java.util.*;

import java.nio.*;
import java.sql.Array;;

public class Driver {
	public Driver() {
	}

	public static LLNode<String> doStuff(String fileData) {
		return buildNodes(fileData + ",");
	}

	public static LLNode<String> buildNodes(String fileData) {
		if (fileData.length() == 0) {
			return null;
		}


		int parens = 0;
		// System.out.println("FILE DATA: " + fileData);
		boolean hasParens = false;
		for (int i = 0; i < fileData.length(); i++) {
			switch (fileData.charAt(i)) { // Switch statement*
			case '(':
				hasParens = true;
				parens++;
				break;
			case ')':
				parens--;
				break;
			case ',':
				if (parens == 0) {
					// System.out.println("I AM AT " + i + " OF " + fileData.length());
					String myself = fileData.substring(0, i).trim();
					String sibling = "";
					if (i + 1 == fileData.length()) {
						// System.out.println("NO MORE SIBLINGS");
					} else {
						sibling = fileData.substring(i + 2).trim();
					}
					// System.out.println("ME: " + myself + " SIB: " + sibling);
					int nodeEnd = myself.indexOf(' ');
					String children = "";
					if (nodeEnd == -1) {
						nodeEnd = myself.length();
					} else {
						children = myself.substring(nodeEnd + 2, myself.length() - 1);
					}
					String nodeName = myself.substring(0, nodeEnd).trim();
					// System.out.println("Node name: " + nodeName);
					// System.out.println("Children: " + children);
					// System.out.println("Sibling: " + sibling);
					LLNode<String> firstChild = buildNodes(children);
					LLNode<String> firstSibling = buildNodes(sibling);
					LLNode<String> meNode = new LLNode<String>(nodeName);
					meNode.setLink(firstSibling);
					meNode.setInnerlink(firstChild);
					return meNode;
				}

			}
		}

		// System.out.println("NO SIBLINGS FOR " + fileData);
		int start = -1;
		int end = -1;
		for (int i = 0; i < fileData.length(); i++) {
			if (start == -1 && fileData.charAt(i) == '(') {
				start = i;
			} else if (fileData.charAt(i) == ')') {
				end = i;
				
			}
		}

		if (start == -1) {
			return new LLNode<String>(fileData);
		}
		start++;
		// System.out.println("INPUT: " + fileData);
		String child = fileData.substring(start, end);
		// System.out.println("SLICE " + fileData + " from " + start + " to " + end + ":
		// " + child);
		LLNode<String> makeMe = new LLNode<String>(fileData.substring(0, start - 1).trim());
		makeMe.setInnerlink(buildNodes(child));
		return makeMe;
	}

	public static void main(String[] args) {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File("File.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String fileData = inputStream.nextLine();

		LLNode<String> root = doStuff(fileData);
		System.out.println(root);
	}
	
}
