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

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
