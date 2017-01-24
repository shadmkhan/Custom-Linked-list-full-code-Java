package CoreJava;
class Node<T>
{
	
	T data;
	Node next;
	public Node(T data, Node next)
	{
		this.next=next;
		this.data=data;
	}
	public Node()
	{
		data=null;
		next=null;
	}
	
	public Node getNode()
	{
		return(next);
	}
	
	public T getData()
	{
		return(data);
	}
	
	public void setData(T data)
	{
		this.data=data;
	}
	
	public void setNext(Node next)
	{
		this.next=next;
	}
	
}

class CustomLinkedList<T>
{
	Node<T> ndStart = new Node<T>();
	Node<T> ndEnd = new Node<T>();
	int size;
	
	public CustomLinkedList() {

		ndStart=null;
		ndEnd=null;
	}
	
	public boolean isEmpty()
	{
		return ndStart==null;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void addLast(T data)
	{
		//Node<T> newNode = new Node<T>();
		if(ndStart==null)
		{
			Node<T> newNode = new Node<T>(data,null);
			ndStart=newNode;
			ndEnd=newNode;
		}
		else
		{
			Node<T> newNode = new Node<T>(data,null);
			ndEnd.next=newNode;
			ndEnd=newNode;
		}
		size++;
	}
	
	public void addFirst(T data)
	{
		//Node<T> newNode = new Node<T>();
		if(ndStart==null)
		{
			Node<T> newNode = new Node<T>(data,null);
			ndStart=newNode;
			ndEnd=newNode;
		}
		else
		{
			
			Node<T> newNode = new Node<T>(data,null);
			newNode.next=ndStart;
			ndStart=newNode;
		}
		size++;
	}
	
	public String toString()
	{
		if (ndStart==null)
		{
			return("Empty");
		}
		Node nptr= ndStart;
		String ret;
		ret="[";
		
		do{
			
			ret=ret+nptr.data.toString() + ",";
			nptr=nptr.next;
		}
		while (nptr!=null);
			
		ret= ret.substring(0,ret.length()-1) + "]";
		
		return ret;
				
	}
	
	
}

public class MyLinkedList 
{
	public static void main(String[] args) {
		CustomLinkedList<String> csl = new CustomLinkedList<String>();
		csl.addFirst("Shad");
		csl.addFirst("Mr.");
		csl.addLast("is");
		csl.addLast("Great");
		System.out.println(csl);
		
		
		CustomLinkedList<Integer> cslI = new CustomLinkedList<Integer>();
		cslI.addFirst(100);
		cslI.addFirst(200);
		cslI.addFirst(300);
		cslI.addFirst(400);
		cslI.addLast(50);
		cslI.addLast(40);
		cslI.addLast(30);
		System.out.println(cslI.getSize());
		System.out.println(cslI);
		
		CustomLinkedList i = new CustomLinkedList();
		i.addFirst('a');
		i.addFirst("abc");
		i.addFirst(123);
		i.addLast(12.34);
		
		System.out.println(i);
				
		
		
	}
	
	
	
}
