package com.rustyrazorblade.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VertexTest {

    Vertex v, v2;
    Edge e;

    @Before
    public void setUp() throws Exception {
        v = new Vertex();
        v2 = new Vertex();
        e = v.addEdge("knows", v2);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddEdge() throws Exception {
        assertEquals(e.in, v);
        assertEquals(e.out, v2);

        Edge e2 = v.in_edges.get(0);
        Edge e3 = v.out_edges.get(0);

        assertEquals(e, e2);
        assertEquals(e, e3);
    }

    @Test
    public void testOutV() throws Exception {
        Vertex[] results = v.outV();
        assertEquals(results[0], v2);
    }

    @Test
    public void testInV() throws Exception {
        Vertex[] results = v2.inV();
        assertEquals(results[0], v);
    }

    @Test
    public void testQuery() throws Exception {
        Vertex v = new Vertex();
        TraversalState t = v.query();
    }
}
