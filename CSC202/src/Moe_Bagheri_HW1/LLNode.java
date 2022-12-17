package Moe_Bagheri_HW1;

public class LLNode<T> {
	protected LLNode<T> link;
	protected T info;
	protected LLNode<T> innerlink;

	public LLNode(T info) {
		this.info = info;
		link = null;
		innerlink = null;
	}

	public void setInnerlink(LLNode<T> link) {
		this.innerlink = link;
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

	public String toString() {
		return printMe(this, 0);
	}

	public String printMe(LLNode<T> node, int tabs) {
		if (node == null) {
			return "*";
		}
		String linkString = "";

		for (int i = 0; i < tabs; i++) {
			linkString += "\t";
		}
		linkString += node.info + "\n";
		if (node.innerlink != null) {
			linkString += printMe(node.innerlink, tabs + 1);
		}
		if (node.link != null) {
			linkString += printMe(node.link, tabs);
		}
		return linkString;
	}
}
