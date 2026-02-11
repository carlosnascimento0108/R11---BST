package adt.bst;

public class BSTImpl<T extends Comparable<T>> implements BST<T> {

	protected BSTNode<T> root;

	public BSTImpl() {
		root = new BSTNode<T>();
	}

	public BSTNode<T> getRoot() {
		return this.root;
	}

	@Override
	public boolean isEmpty() {
		return root.isEmpty();
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public BSTNode<T> search(T element) {
		BSTNode<T> k = getRoot();
		
		if (k.getData().equals(element)) {
			
		}
		
		if (k.getData().compareTo(element) < 0) {
			k = search(element, (BSTNode<T>) k.getRight());
		}

		else {
			k = search(element, (BSTNode<T>) k.getLeft());
		}

		return k;
	}

	public BSTNode<T> search(T element, BSTNode<T> k) {
		BSTNode<T> result = k;
		
		if (k != null) {
			if (k.getData().equals(element)) {
			result = k;
		}

		else if (k.getData().compareTo(element) < 0) {
			result = search(element, (BSTNode<T>) k.getRight());
		}

		else if (k.getData().compareTo(element) > 0) {
			result = search(element, (BSTNode<T>) k.getLeft());
		}

		}
		return result;
	}

	@Override
	public void insert(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public BSTNode<T> maximum() {
		BSTNode<T> result = getRoot();
		
		while (!result.isEmpty()) {
			result = (BSTNode<T>) result.getRight();
		}
		return result;
	}

	@Override
	public BSTNode<T> minimum() {
		BSTNode<T> result = getRoot();

		while (!result.isEmpty()) {
			result = (BSTNode<T>) result.getLeft();
		}

		return result;
	}

	@Override
	public BSTNode<T> sucessor(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public BSTNode<T> predecessor(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public void remove(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public T[] preOrder() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public T[] order() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public T[] postOrder() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	/**
	 * This method is already implemented using recursion. You must understand
	 * how it work and use similar idea with the other methods.
	 */
	@Override
	public int size() {
		return size(root);
	}

	private int size(BSTNode<T> node) {
		int result = 0;
		// base case means doing nothing (return 0)
		if (!node.isEmpty()) { // indusctive case
			result = 1 + size((BSTNode<T>) node.getLeft())
					+ size((BSTNode<T>) node.getRight());
		}
		return result;
	}

}
