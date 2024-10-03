package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */ 
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) {
    Stack<Character> parens = new LinkedStack<Character>();
    char top;
    try {
      for(int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '(') {
          parens.push('(');
        } else if (str.charAt(i) == '[') {
          parens.push('[');
        } else if (str.charAt(i) == '{') {
          parens.push('{');
        } else if (str.charAt(i) == '<') {
          parens.push('<');
        } else if (str.charAt(i) == ')') {
          top = parens.pop();
          if (top != '(') {
            throw new Exception("Incorrect parentheses type");
          }
        } else if (str.charAt(i) == ']') {
          top = parens.pop();
          if (top != '[') {
            throw new Exception("Incorrect parentheses type");
          }
        } else if (str.charAt(i) == '}') {
          top = parens.pop();
          if (top != '{') {
            throw new Exception("Incorrect parentheses type");
          }
        } else if (str.charAt(i) == '>') {
          top = parens.pop();
          if (top != '<') {
            throw new Exception("Incorrect parentheses type");
          }
        } // if / else
      }
      if (!(parens.isEmpty())) {
        return false;
      } // if
      return true;
    } catch (Exception e) {
      return false;
    } // try / catch
  } // checkMatching
} // class StringUtils    

