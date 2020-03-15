package com.sparta.crss;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTester {

    private BinaryTreeImpl binaryTree;

    @BeforeEach
    public void setUp() {
//        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree = new BinaryTreeImpl(7);
        binaryTree.createRootNode(1);
//        binaryTree.addElement(2);
//        binaryTree.addElements(new int[]{3, 5});
    }

//    @AfterEach
//    void tearDown() {
//    }
//
    @Test
    void testGetRootElement() {
        assertEquals("1", Integer.toString(binaryTree.getRootElement()));
    }

    @Test
    void testGetRootElement2() {
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(8);
        assertEquals("8", Integer.toString(binaryTree.getRootElement()));
    }

    @Test
    void testGetRootElement3() {
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(10);
        binaryTree.addElement(2);
        binaryTree.addElement(3);
        assertEquals("10", Integer.toString(binaryTree.getRootElement()));
    }

    @Test
    void testGetNumberOfElements() {
        //use binaryTree.getNumberOfElements();
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(1);
        binaryTree.addElement(2);
        binaryTree.addElement(3);
        assertEquals(3, binaryTree.getNumberOfElements());
    }

    @Test
    void testGetNumberOfElements2() {
        //use binaryTree.getNumberOfElements();
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(1);
        binaryTree.addElement(2);
        binaryTree.addElement(3);
        binaryTree.addElement(7);
        binaryTree.addElement(9);
        assertEquals(5, binaryTree.getNumberOfElements());
    }

    @Test
    void testGetNumberOfElementsAfterAddingArrayOfElements() {
        //use binaryTree.getNumberOfElements();
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(1);
        int[] array = {7, 4, 6, 1, 9, 13, 54, 97};
        binaryTree.addElements(array);
        assertEquals(9, binaryTree.getNumberOfElements());
    }


    @Test
    void testAddElement() {
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(1);
        binaryTree.addElement(2);
        assertEquals(2, binaryTree.getNumberOfElements());
    }

    @Test
    void testAddElements() {
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(18);
        int[] array = {16, 32, 45, 99, 7, 4, 6, 1, 9, 13, 54, 97};
        binaryTree.addElements(array);
        assertEquals(13, binaryTree.getNumberOfElements());
    }

    @Test
    void testFindElement() {
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(18);
        int[] array = {16, 32, 45, 99, 7, 4, 6, 1, 9, 13, 54, 97};
        binaryTree.addElements(array);
        assertEquals(true, binaryTree.findElement(32));
    }

    @Test
    void testFindElement2() {
        binaryTree = new BinaryTreeImpl();
        binaryTree.createRootNode(18);
        int[] array = {16, 32, 45, 99, 7, 4, 6, 1, 9, 13, 54, 97};
        binaryTree.addElements(array);
        assertEquals(false, binaryTree.findElement(33));
    }

//    @Test
//    void getLeftChild() {
//        binaryTree.addElement(2);
//        assertEquals("2", Integer.toString(Node.getLeftChild().getValue()));
//    }

//    @Test
//    void getLeftChild() {
//        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl();
//        binaryTree2.addElement(2);
//        binaryTree2.createRootNode(1);
//        assertEquals("2", Integer.toString(Node.getLeftChild(1).getValue()));
//    }

//
//    @Test
//    void getRightChild() {
//    }
//
//    @Test
//    void getSortedTreeAsc() {
//    }
//
//    @Test
//    void getSortedTreeDesc() {
//    }
}