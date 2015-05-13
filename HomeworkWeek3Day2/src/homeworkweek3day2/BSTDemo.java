
package homeworkweek3day2;


public class BSTDemo {
    public static void main(String[] args) {
        Tree1 theTree = new Tree1();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        Node f = theTree.find(25);
        f.displayNode();
        System.out.println("\nInorder Traversal is : ");
        theTree.inOrder(theTree.getRoot());
        System.out.println("\nPreorder Traversal is : ");
        theTree.preOrder(theTree.getRoot());
        System.out.println("\nPostorder Traversal is : ");
        theTree.postOrder(theTree.getRoot());
        System.out.println("\nMaximum value : " + theTree.maxValue().iData);
        System.out.println("Minimum value : " + theTree.minValue().iData);
        System.out.println("Leaf: " + theTree.getLeaf(theTree.getRoot()));
    }
}

/*Output:
{25, 1.2} 
Inorder Traversal is : 
12 25 30 37 43 50 75 
Preorder Traversal is : 
50 25 12 37 30 43 75 
Postorder Traversal is : 
12 30 43 37 25 75 50 
Maximum value : 75
Minimum value : 12
Leaf: 4
*/