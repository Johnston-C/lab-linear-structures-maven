package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.linear.ArrayBasedPriorityQueue;
import edu.grinnell.csc207.linear.BuiltinPriorityQueue;
import edu.grinnell.csc207.linear.PriorityQueue;
import edu.grinnell.csc207.linear.ReportingLinearStructure;

import java.util.Comparator;

/**
 * Simple experiments with various implementations of priority queues.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class PriorityQueueExperiment {

  /**
   * Do all the work. (Well, make the helpers do all the work.)
   */
  public static void main(String[] args) throws Exception {
    // Build a comparator that compares two strings by length.
    Comparator<String> compareLengths = new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 < l2) {
          return -1;
        } else if (l1 == l2) {
          return 0;
        } else {
          return 1;
        } // else (l1 > l2)
      } // compare(String,String)
    }; // new Comparator<String>

    PriorityQueue<String> pq;
    // Uncomment one of the following to choose the kind of
    // priority queue.
    pq = new BuiltinPriorityQueue<String>(8, compareLengths);
    // pq = new ArrayBasedPriorityQueue<String>(8, compareLengths);

    ReportingLinearStructure<String> expt = new ReportingLinearStructure<String>(pq, "expt");

    // Put in a few values, then remove two
    expt.isEmpty();
    expt.put("one");
    expt.peek();
    expt.put("two");
    expt.peek();
    expt.put("three");
    expt.peek();
    expt.put("four");
    expt.get();
    expt.get();
    expt.put("x");
    expt.peek();
    expt.get();
    expt.get();
    expt.get();
    // We've put and removed the same number of elements, it
    // should be empty
    expt.isEmpty();

    /*
     * // It's always good to see what happens after you've cleared // out a structure. So add a few
     * more elements. // We'll leave this test until we've worked out some kinks (Dave? Ray? Mick?)
     * expt.put("five"); 
     * expt.peek(); 
     * expt.put("six"); 
     * expt.get(); 
     * expt.peek(); 
     * expt.put("seven");
     * expt.get(); 
     * expt.get(); // And we're back down to the empty queue expt.isEmpty();
     */

    /*
     * // An iteration test, once we've worked out some kinks. (Who is
     * // the other one?
     * expt.put("eight"); 
     * expt.put("nine");
     * expt.put("ten"); 
     * expt.put("eleven"); 
     * for (String s : expt) { System.out.println(s); } // for
     * expt.get(); 
     * expt.get(); 
     * expt.get(); 
     * expt.get();
     */

  } // main(String[])
} // class PriorityQueueExperiment
