//---------------------------------------------------------------------------
// MapEntry.java              by Dale/Joyce/Weems                   Chapter 8
//
// Provides key, value pairs for use with a Map.
// Keys are immutable.
//---------------------------------------------------------------------------
package Moe_Bagheri_Final;

public class MapEntry<K, V> implements Comparable {
	protected K key;
	protected V value;

	MapEntry(K k, V v) {
		key = k;
		value = v;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V v) {
		value = v;
	}

	@Override
	public String toString()
	// Returns a string representing this MapEntry.
	{
		return "Key  : " + key + " & Value: " + value;
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MapEntry<K,V> equivalent = (MapEntry<K,V>)o;
		return ((Comparable) key).compareTo(equivalent.getKey());
	}
}
