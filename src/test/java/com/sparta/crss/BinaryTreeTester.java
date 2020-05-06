package com.sparta.crss;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertTrue;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTester {

    private BinaryTreeImpl binaryTree;
    private BinaryTreeImpl binaryTree2;
    private BinaryTreeImpl binaryTree3;
    private BinaryTreeImpl binaryTree4;

    @BeforeEach
    public void setUp() {
//        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree = new BinaryTreeImpl(7);
        binaryTree.addElement(2);
        binaryTree.addElements(new int[]{12, 3, 5, 8, 15, 43});

        binaryTree2 = new BinaryTreeImpl(10);
        binaryTree2.addElements(new int[]{4, 7, 1, 65, 3, 21, 45, 9});

        binaryTree3 = new BinaryTreeImpl(1);
        binaryTree3.addElement(2);
        binaryTree3.addElement(3);

        binaryTree4 = new BinaryTreeImpl(2);
        binaryTree4.addElement(3);

        System.out.println("setUp() is running");
        System.out.println(Arrays.toString(binaryTree.getSortedTreeAsc()));
        System.out.println(Arrays.toString(binaryTree2.getSortedTreeAsc()));
        System.out.println(Arrays.toString(binaryTree3.getSortedTreeAsc()));
        System.out.println(Arrays.toString(binaryTree4.getSortedTreeAsc()));
    }

//    @AfterEach
//    void tearDown() {
//    }

    @Test
    void testGetRootElement() {
        assertEquals("7", Integer.toString(binaryTree.getRootElement()));
    }

    @Test
    void testGetRootElement2() {
        assertEquals("10", Integer.toString(binaryTree2.getRootElement()));
    }

    @Test
    void testGetRootElement3() {
        assertEquals("1", Integer.toString(binaryTree3.getRootElement()));
    }

    @Test
    void testGetNumberOfElements() {
        assertEquals(8, binaryTree.getNumberOfElements());
    }

    @Test
    void testGetNumberOfElements2() {
        assertEquals(9, binaryTree2.getNumberOfElements());
    }

    @Test
    void testGetNumberOfElementsAfterAddingArrayOfElements() {
        int[] array = {7, 4, 6, 1, 9, 13, 54, 97};
        binaryTree.addElements(array);
        assertEquals(16, binaryTree.getNumberOfElements());
    }

    @Test
    void testAddElement() {
        assertEquals(8, binaryTree.getNumberOfElements());
    }

    @Test
    void testAddElements() {
        assertEquals(9, binaryTree2.getNumberOfElements());
    }

    @Test
    void testFindElement() {
        assertEquals(true, binaryTree2.findElement(65));
    }

    @Test
    void testFindElement2() {
        assertEquals(false, binaryTree.findElement(33));
    }

//    @Test
//    void getSortedTreeAsc() {
//        int[] array = {2, 3};
//        Arrays.equals(array, binaryTree4.getSortedTreeAsc());
//    }

    @Test
    void getSortedTreeAsc() {
        int[] array = {2, 3};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(binaryTree4.getSortedTreeAsc()));
        assertTrue(Arrays.equals(array, binaryTree4.getSortedTreeAsc()));
    }

    @Test
    void getSortedTreeDesc() {
        int[] array = {3, 2};
        assertTrue(Arrays.equals(array, binaryTree4.getSortedTreeDesc()));
    }

    @Test
    void getSortedTreeAsc2() {
        int[] array = {1, 3, 4, 7, 9, 10, 21, 45, 65};
        assertTrue(Arrays.equals(array, binaryTree2.getSortedTreeAsc()));
    }

    @Test
    void getSortedTreeDesc2() {
        int[] array = {1, 3, 4, 7, 9, 10, 21, 45, 65};
        assertTrue(Arrays.equals(array, binaryTree2.getSortedTreeDesc()));
    }

    //tests for sorted arrays also test .getLeftChild() and .getRightChild()
}