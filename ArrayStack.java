
public class ArrayStack<E> implements Stack<E>
{
	private E[] stack;
	private int size;
	
	public ArrayStack(int capacity)
	{
		stack = (E[]) new Object[capacity];
		size = 0;
	}
	
	
	public void push(E v) 
	{
		if(size == stack.length-1)
		{
			throw new IllegalStateException("Stack overflow");
		}
		
		stack[size] = v;
		size++;
	}

	
	public E pop() 
	{
		if(size == 0)
		{
			throw new IllegalStateException("Stack is empty");
		}
		E value = stack[size-1];
		stack[size-1] = null;
		size--;
		return value;
	}

	@Override
	public E top() 
	{
		if(size == 0)
		{
			throw new IllegalStateException("Stack is empty");
		}
		return stack[size-1];
	}

	
	public boolean isEmpty() 
	{
		return size == 0;
	}

	@Override
	public int size() 
	{
		return size;
	}
	

}
