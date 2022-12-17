//----------------------------------------------------------------------------
// LLNode.java                by Dale/Joyce/Weems                    Chapter 2
//
// Implements <T> nodes for a Linked List.
//----------------------------------------------------------------------------
package test2_MoeBagheri;

import Moe_Bagheri_HW1.Directory;

public class LLNode<T> {
	protected LLNode<T> link;
	protected T info;

	public LLNode(T info) {
		this.info = info;
		link = null;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public void setLink(LLNode<T> link) {
		this.link = link;
	}

	public LLNode<T> getLink() {
		return link;
	}

	public void setInnerLink(LLNode<Directory> node2) {
		// TODO Auto-generated method stub

	}
}
