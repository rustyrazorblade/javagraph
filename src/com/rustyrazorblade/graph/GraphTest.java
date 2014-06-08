package com.rustyrazorblade.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {
    public Graph g;

    @Before
    public void setUp() throws Exception {
        g = new Graph();

        Vertex v = g.addVertex();
        Vertex v2 = g.addVertex();
        Vertex v3 = g.addVertex();

        v.addEdge("knows", v2);
        v.addEdge("likes", v3);
    }

    @After
    public void tearDown() throws Exception {

    }
}
