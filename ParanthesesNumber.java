import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc= new Scanner(System.in);
		String n=sc.next(),s="";
		for(int i=0;i<n.length();i++)
		{
		    if(n.charAt(i)=='('||n.charAt(i)==')')
		    {
		        s+=n.charAt(i);
		    }
		}
		int res[]= parantheses(s);
		for(int i:res)
		{
		    System.out.print(i+" ");
		}

	}
	public static int[] parantheses(String n)
	{
	    int res[]= new int[n.length()];
	    Stack<Integer> s= new Stack<Integer>();
	    int c=0;
	    for(int i=0;i<n.length();i++)
	    {
	        if(n.charAt(i)=='(')
	        {
	            c++;
	            s.push(c);
	            res[i]=c;
	        }
	        else
	        {
	            res[i]=s.pop();
	        }
	    }
	    return res;
	}
}