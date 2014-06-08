package com.rustyrazorblade.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import static java.util.UUID.randomUUID;

/**
 * Created by jhaddad on 6/7/14.
 */
public class Vertex extends Element {
    public List<Edge> in_edges, out_edges;

    private UUID id;

    public Vertex() {
        this(randomUUID());
    }
    public Vertex(UUID id) {
        this.id = id;
        in_edges = new LinkedList<Edge>();
        out_edges = new LinkedList<Edge>();
    }

    public Edge addEdge(String label, Vertex v) {
        Edge e = new Edge(label, this, v);
        this.out_edges.add(e);
        this.in_edges.add(e);
        return e;
    }

}
