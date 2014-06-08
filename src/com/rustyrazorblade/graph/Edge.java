package com.rustyrazorblade.graph;

/**
 * Created by jhaddad on 6/7/14.
 */
public class Edge extends Element {
    Vertex in, out;
    String label;

    public Edge(String label, Vertex in, Vertex out) {
        this.in = in;
        this.out = out;
        this.label = label;
    }
}
