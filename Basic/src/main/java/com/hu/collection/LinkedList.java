package com.hu.collection;

public class LinkedList {
	
	private Node first;
	private Node last;
	
	private int size;

	//添加节点
	public void add(Object obj) {
		if (first == null) {
			Node n = new Node();
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		} else {
			Node n = new Node();
			
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			
			last = n;
		}
		size++;
	}
	
	public int size () {
		return size;
	}
	
	public Object get (int index) {
		
		return getNode(index).getObj();
	}
	//获取某个位置的节点
	private Node getNode (int index) {
		rangeCheck(index);
		int start = 0 ;
		Node temp = first;
		while (start < index) {
			temp = temp.getNext();
			start++;
		}
		return temp;
	}
	
	public void remove (int index) {
		Node temp  = getNode(index);
	    Node pre = temp.getPrevious();
	    Node next = temp.getNext();
	    
	    pre.setNext(next);
	    next.setPrevious(pre);
	    
	    size--;
	}
	
	public void insert(int index,Object obj) {
		Node temp = getNode(index);
		Node newNode = new Node();
		newNode.setObj(obj);
		
		if (temp !=null) {
			Node pre = temp.getPrevious();
			pre.setNext(newNode);
			newNode.setPrevious(pre);
			newNode.setNext(temp);
			temp.setPrevious(newNode);
			
			size++;
		}
		
	}
	
	private void rangeCheck(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
    }
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("bbb");
		list.add("aaa");
		list.add("ccc");
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.insert(1, "BBB");
		System.out.println(list.size());
		System.out.println(list.get(1));
		

	}
	
	

}
//表示一个节点
class Node {
	private Node previous;
	private Object obj;
	private Node next;
	
	public Node() {
		
	}
	
	public Node(Node previous, Object obj, Node next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
