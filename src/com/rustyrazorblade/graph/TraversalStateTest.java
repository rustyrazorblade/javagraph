package com.rustyrazorblade.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraversalStateTest {
    Graph g;

    @Before
    public void setUp() throws Exception {
        g = new Graph();
        Vertex v1 = g.addVertex();
        Vertex v2 = g.addVertex();

        v1.addEdge("likes", v2);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testOutV() throws Exception {
        // we create a simple graph of 2 nodes
    }

    @Test
    public void testTraversal() throws Exception {

    }
}
