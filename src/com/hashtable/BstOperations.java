package com.hashtable;

public class BstOperations {

	Node root;

	public void insert(int i) {
		Node newNode = new Node(i);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;

			while (true) {
				parent = current;
				if (i < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
}
