package com.rustyrazorblade.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraversalStateTest {
    Graph g;
    Vertex v1, v2;

    @Before
    public void setUp() throws Exception {
        g = new Graph();
        v1 = g.addVertex();
        v2 = g.addVertex();

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
        TraversalState state = v1.query().outV("likes");
    }

    @Test
    public void testRootPathProperlySet() throws Exception {
        TraversalState t = v1.query();
        assertEquals(1, t.paths.size());
    }
}
