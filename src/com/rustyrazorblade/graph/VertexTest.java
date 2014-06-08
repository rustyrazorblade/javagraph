package com.rustyrazorblade.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VertexTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddEdge() throws Exception {
        Vertex v = new Vertex();
        Vertex v2 = new Vertex();
        Edge e = v.addEdge("knows", v2);
        assertEquals(e.in, v);
        assertEquals(e.out, v2);

        Edge e2 = v.in_edges.get(0);
        Edge e3 = v.out_edges.get(0);

        assertEquals(e, e2);
        assertEquals(e, e3);
    }
}
