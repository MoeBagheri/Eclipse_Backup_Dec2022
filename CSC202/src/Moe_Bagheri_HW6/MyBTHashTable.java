

package Moe_Bagheri_HW6;

import java.util.Iterator;


public class MyBTHashTable<K, V> implements MapInterface<K, V> {
	private BinarySearchTree<MapEntry<K, V>>[] table;
	
	private int duplicates;
	private int replacements;
	private int notfounds;
	
	public MyBTHashTable(int buckets) {
		duplicates = 0;
		replacements = 0;
		notfounds = 0;
		
		table = new BinarySearchTree[buckets];
		for(int i=0;i<buckets;i++) {
			table[i] = new BinarySearchTree<MapEntry<K, V>>();
		}
	}
	
	private int hashFunction(K key) {
		return key.toString().hashCode();
	}
	
	
	
	public void dumpTable() {
		int chainCount = 0;
		int chainLength = 0;
		for(int i=0;i<table.length;i++) {
			if(table[i].size() != 0) {
				//System.out.print( "Index " + i + ": " + table[i].size() + " entries.");
				//table[i].dumpList();
				//System.out.println("");
				chainCount++;
				chainLength += table[i].size();
			}
		}
		// 1. Work out the Mean 
		//    (the simple average of the numbers)
		// 2. Then for each number: subtract the Mean and square the result
		// 3. Then work out the mean of those squared differences.
		// 4. Take the square root of that and we are done!
		double mean = chainLength*1.0/chainCount;
		double diffSum = 0;
		for(int i=0;i<table.length;i++) {
			diffSum += Math.pow(table[i].size()-mean, 2);
		}
		double std = Math.sqrt(diffSum/chainCount);
		
		System.out.println("Total chains: " + chainCount);
		System.out.println("Total entries: " + chainLength);
		System.out.println("Average length: " + mean);
		System.out.println("Standard Deviation: " + std);
		System.out.println("Total entires with identical hash codes: " + duplicates);
		System.out.println("Number of times item was replaced: " + replacements);
		System.out.println("Items not found: " + notfounds);
	}

	@Override
	public Iterator<MapEntry<K, V>> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K k, V v) {
		// TODO Auto-generated method stub
		int hashCode = hashFunction(k);
		int tableIndex = hashCode%table.length;
		if(tableIndex < 0) {
			tableIndex += table.length;
		}
		BinarySearchTree<MapEntry<K,V>> bucket = table[tableIndex];
		
		MapEntry<K,V> found = bucket.get(new MapEntry<K,V>(k, v));
		if(found != null) {
			replacements++;
			V oldValue = found.getValue();
			found.setValue(v);
			return oldValue;
		}

		if(table[tableIndex].size() > 0) {
			duplicates++;
		}
		table[tableIndex].add(new MapEntry<K, V>(k, v));

		return v;
	}

	@Override
	public V get(K k) {
		// TODO Auto-generated method stub
		int hashCode = hashFunction(k);
		int tableIndex = hashCode%table.length;
		if(tableIndex < 0) {
			tableIndex += table.length;
		}
		BinarySearchTree<MapEntry<K,V>> bucket = table[tableIndex];
		
		MapEntry<K,V> found = bucket.get(new MapEntry<K,V>(k, null));
		if(found != null) {
			return found.getValue();
		}
		notfounds++;
		return null;
	}

	@Override
	public V remove(K k) {
		// TODO Auto-generated method stub
		int hashCode = hashFunction(k);
		int tableIndex = hashCode%table.length;
		if(tableIndex < 0) {
			tableIndex += table.length;
		}
		BinarySearchTree<MapEntry<K,V>> bucket = table[tableIndex];
		MapEntry<K,V> found = bucket.get(new MapEntry<K,V>(k, null));
		if(found != null) {
			bucket.remove(found);
			return found.getValue();
		}
		
		return null;
	}

	@Override
	public boolean contains(K k) {
		return get(k) != null;
	}

	@Override
	public boolean isEmpty() {
		for(int i=0;i<table.length;i++) {
			if(table[i].size() > 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int size() {
		int counter = 0;
		for(int i=0;i<table.length;i++) {
			counter += table[i].size();
		}
		return counter;
	}
	
}