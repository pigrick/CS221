package homeworkweek3day2;

public class Tree1 {

    private Node root;
    static int leaf = 0;

    public Tree1() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }

    public Node minValue() {
        Node current = root;
        if(current == null){
            return null;
        }
        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current;
    }

    public Node maxValue() {
        Node current = root;
        if(current == null){
            return null;
        }
        while (current.rightChild != null) {
            current = current.rightChild;
        }
        return current;
    }

    public Node getRoot() {
        return root;
    }
    
    public int getLeaf(Node localRoot){
        leaf = 0;
        return countLeaf(localRoot);
    }
    
    public int countLeaf(Node localRoot){
        if (localRoot != null) {
            countLeaf(localRoot.leftChild);
            countLeaf(localRoot.rightChild);
            if(localRoot.leftChild == null && localRoot.rightChild == null){
            leaf++;
            }
        }
        return leaf;
    }
}
