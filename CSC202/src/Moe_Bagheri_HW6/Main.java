
package Moe_Bagheri_HW6;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		
		 int tableSize = 1000;
		MyLLHashTable mht = new MyLLHashTable(tableSize);
		//MyLLHashTable<String, String> mht = new MyLLHashTable(1000);

		MyBTHashTable mbth = new MyBTHashTable(tableSize);
		int linecount = 0;

		MyLinkedList<String> originalKeys = new MyLinkedList();
		try {
			Scanner sc = new Scanner(new File("hw6_input.txt"));
			while(sc.hasNextLine()) {
				linecount++;
				String line = sc.nextLine();
				String[] parts = line.split("#");
				if(parts.length != 2) {
					System.out.println("BAD LINE: \"" + line + "\"");
					continue;
				}
				mht.put(parts[0], parts[1]);
				mbth.put(parts[0], parts[1]);
				originalKeys.add(parts[0]);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}
		
		System.out.println("There were " + linecount + " lines");


		System.out.println("--- Search Times ---");
		long start;
		long finish;
		long timeElapsed;
		
		MyLinkedList<String> keys = new MyLinkedList();
		try {
			Scanner sc = new Scanner(new File("words_for_search.txt"));
			while(sc.hasNextLine()) {
				linecount++;
				String line = sc.nextLine();
				String[] parts = line.split("#");
				if(parts.length != 2) {
					System.out.println("BAD LINE: " + line);
					continue;
				}
				keys.add(parts[0]);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}
		
		start = System.currentTimeMillis();
		keys.begin();
		while(keys.end() == false) {
			mht.get(keys.next());
		}
		finish = System.currentTimeMillis();
		timeElapsed = finish - start;
		System.out.println("Links Lookup Time: " + timeElapsed);

		start = System.currentTimeMillis();
		keys.begin();
		while(keys.end() == false) {
			mbth.get(keys.next());
		}
		finish = System.currentTimeMillis();
		timeElapsed = finish - start;
		System.out.println("Binary Lookup Time: " + timeElapsed);
		
		System.out.println("--- linked list buckets ---");
		mht.dumpTable();

		System.out.println("--- binary tree buckets ---");
		mbth.dumpTable();

		
		System.out.println("----- Removal system -----");
		System.out.println("What to remove from bst-ht (or type quit)?");
		Scanner sc = new Scanner(System.in);
		String line = "";
		while(line.equals("quit") == false) {
			System.out.print("> ");
			line = sc.nextLine();
			System.out.println("Removing " + line);
			if(mht.remove(line)!= null) {
				System.out.println("Removed from linked list HT");
			}
			else {
				System.out.println("Could not remove from linked list HT");
			}
			
			System.out.println("And from binary tree");
			if(mbth.remove(line)!= null) {
				System.out.println("Removed from binary tree HT");
			}
			else {
				System.out.println("Could not remove from binary tree HT");
			}
			System.out.println("done");
			
		}
		
		System.out.println("--- Removing all keys ---");
		originalKeys.begin();
		while(originalKeys.end() == false) {
			String next = originalKeys.next();
			mht.remove(next);
			mbth.remove(next);
		}
		mht.dumpTable();
		mbth.dumpTable();
		
	}
	
	
	
	
	
	
	
}


