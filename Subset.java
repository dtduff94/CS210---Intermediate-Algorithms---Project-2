import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// Takes a command-line integer k; reads in a sequence of strings from 
// standard input; and prints out exactly k of them, uniformly at random. 
// Note that each item from the sequence is printed out at most once.
public class Subset {
    public static void main(String[] args) {	
	ResizingArrayRandomQueue<String> rarq = new ResizingArrayRandomQueue<String>();
	
	int k = Integer.parseInt(args[0]);

	while (!StdIn.isEmpty()) {
	    rarq.enqueue(StdIn.readString());
	}
	
     	for (int i = 0; i < k; i++) {
	    StdOut.println(rarq.dequeue());
	}
    }
}
