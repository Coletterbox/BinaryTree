package com.sparta.crss;

public class BinaryTreeImpl implements BinaryTree {

    private Node rootNode;
    private int numElements;

    public BinaryTreeImpl(int element) {
        createRootNode(element);
    }

    public void createRootNode(int value) {
        rootNode = new Node(value);
        numElements++;
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numElements;
    }

//    //TODO: fix this - it does not deal with current node properly
//    @Override
//    public void addElement(int element) {
//        numElements++;
//        int rootNodeValue = rootNode.getValue();
//        int leftChildValue = rootNode.getLeftChild().getValue();
//        int rightChildValue = rootNode.getRightChild().getValue();
//        if (element < rootNodeValue) {
////            if (rootNode.leftChild == null) {
//            if (rootNode.getLeftChild() == null) {
////                rootNode.leftChild = new Node(element);
////                rootNode.setLeftChild(  ?   );
//                Node leftChild = new Node(element);
//                rootNode.setLeftChild(leftChild);
//            } else {
////                leftChild.addElement(element);
//               //rootNode.getLeftChild().addElement(element);
//                Node leftChild = new Node(element);
//                rootNode = rootNode.getLeftChild();
//                rootNode.setLeftChild(leftChild);
//            }
//        } else {
////            if (rootNode.rightChild == null) {
//            if (rootNode.getRightChild() == null) {
////                rightChild = new Node(element);
//                Node rightChild = new Node(element);
//                rootNode.setRightChild(rightChild);
//            } else {
////                rightChild.addElement(element);
//                Node rightChild = new Node(element);
//                rootNode = rootNode.getRightChild();
//                rootNode.setRightChild(rightChild);
//            }
//        }
//    }

////    // TODO: rename "latest" to something more fitting
//    public Node addElement(Node latest, int element) {
//        if (latest == null) {
//            return new Node(element);
//        }
//        if (element < latest.getValue()) {
//            latest.setLeftChild(addElement(latest.getLeftChild(), element));
//        } else if (element > latest.getValue()) {
//            latest.setRightChild(addElement(latest.getRightChild(), element));
//        } else {
//            return latest;
//        }
//        return latest;
//    }

//    //for first node
//    public void addElement(int element) {
//        if (numElements == 0) {
//            createRootNode(element);
//        }

    public void addElement(int value) {
        addElement(this.rootNode, value);
    }
    
    public void addElement(Node currentNode, int element) {
        if (numElements == 0) {
            createRootNode(element);
        }
        if (element < currentNode.getValue()) {
            if (currentNode.getLeftChild() == null) {
                numElements++;
                currentNode.setLeftChild(new Node(element));
            } else {
                addElement(currentNode.getLeftChild(), element);
            }
        } else {
            if (currentNode.getRightChild() == null) {
                numElements++;
                currentNode.setRightChild(new Node(element));
            } else {
                addElement(currentNode.getRightChild(), element);
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        // TODO: change this, now that addElement takes two arguments
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node currentNode = rootNode;
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                return true;
            } else if (currentNode.getValue() > value) {
                currentNode = currentNode.getLeftChild();
            } else if (currentNode.getValue() < value) {
                currentNode = currentNode.getRightChild();
            }
        }
        return false;
    }

//    //TODO: finish
//    @Override
//    public int getLeftChild(int element) throws ChildNotFoundException {
//        // Node where value = element
//        // get leftChild property
//        Node latest = rootNode;
//        while (latest != null) {
//            if (latest.getValue() == element) {
//                return latest.getLeftChild().getValue();
//            } else if (latest.getValue() > element) {
//                latest = latest.getRightChild();
//                getLeftChild(element);
//            } else if (latest.getValue() < element) {
//                latest = latest.getLeftChild();
//                getLeftChild(element);
//            }
//        }
//    }

//    @Override
//    public int getRightChild(int element) throws ChildNotFoundException {
//        return 0;
//    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
