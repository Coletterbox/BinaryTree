package com.sparta.crss;

import java.util.Arrays;

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
        int[] resultArray = new int[numElements];
        int counter = 0;
        int lastValue;
        Node currentNode = rootNode;
        while (counter <= numElements) {
            lastValue = currentNode.getValue();
            resultArray[counter] = lastValue;
            counter++;
            if (currentNode.getLeftChild() != null) {
                currentNode = currentNode.getLeftChild();
                counter++;
            } else if (currentNode.getRightChild() != null) {
                currentNode = currentNode.getRightChild();
                counter++;
            } else {
                currentNode = currentNode.getParent();
            }
        }
        Arrays.sort(resultArray);
        return resultArray;
    }

    @Override
    public int[] getSortedTreeDesc() {
//        return BinaryTreeImpl.getSortedTreeAsc().reverse();
        int[] resultArray = new int[numElements];
        int counter = 0;
        int lastValue;
        Node currentNode = rootNode;
        while (counter <= numElements) {
            lastValue = currentNode.getValue();
            resultArray[counter] = lastValue;
            counter++;
            if (currentNode.getLeftChild() != null) {
                currentNode = currentNode.getLeftChild();
                counter++;
            } else if (currentNode.getRightChild() != null) {
                currentNode = currentNode.getRightChild();
                counter++;
            } else {
                currentNode = currentNode.getParent();
            }
        }
        Arrays.sort(resultArray);
        int[] resultArrayReversed = new int[resultArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArrayReversed[0] = resultArray[resultArray.length - i];
        }
        return resultArrayReversed;
    }
}
