/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yeerick
 */
public class Tree234App {

    public static void main(String[] args) throws IOException {
        long value;
        Tree234 theTree = new Tree234();

        theTree.insert(50);
        theTree.insert(40);
        theTree.insert(60);
        theTree.insert(30);
        theTree.insert(70);
        theTree.insert(67);
        theTree.insert(77);
        theTree.insert(34);
        theTree.insert(22);
        

        while (true) {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, leafcount, nodecount, minvalue, totalsum, orderdisplay, arrangesort or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    theTree.insert(value);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    int found = theTree.find(value);
                    if (found != -1) {
                        System.out.println("Found " + value);
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                case 'm':
                    System.out.println("Minimum value: " + theTree.getMinValue(theTree.getRoot()));
                    break;
                case 'l':
                    System.out.println("Leaf Count: " + theTree.leafCount(theTree.getRoot()));
                    break;
                case 'n':
                    System.out.println("Node Count: " + theTree.nodeCount(theTree.getRoot()));
                    break;
                case 't':
                    System.out.println("Sum of Valus: " + theTree.getSum(theTree.getRoot()));
                    break;
                case 'o':
                    System.out.println("Inorder display: ");
                    theTree.inOrder(theTree.getRoot());
                    System.out.println();
                    break;    
                case 'a':
                    theTree.sort(theTree.getRoot());
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }  // end while
    }  // end main()
//--------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
//--------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

//-------------------------------------------------------------
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}

