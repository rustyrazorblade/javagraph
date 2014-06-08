package com.rustyrazorblade.graph;

import sun.awt.image.ImageWatched;

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
        v.in_edges.add(e);
        return e;
    }
    public Vertex[] outV(String ... labels) {
        LinkedList<Vertex> vertices = new LinkedList<Vertex>();
        for(Edge e: out_edges) {
            vertices.add(e.out);
        }
        return vertices.toArray(new Vertex[vertices.size()]);
    }

    public Vertex[] inV(String ... labels) {
        LinkedList<Vertex> vertices = new LinkedList<Vertex>();
        for(Edge e: in_edges) {
            vertices.add(e.in);
        }
        return vertices.toArray(new Vertex[vertices.size()]);
    }

    public Edge[] inE(String ... labels) {
        LinkedList<Edge> edges = new LinkedList<>();
        for(Edge e: in_edges) {
            edges.add(e);
        }

        return edges.toArray(new Edge[edges.size()]);
    }

    public Edge[] outE(String ... labels) {
        LinkedList<Edge> edges = new LinkedList<>();
        for(Edge e: out_edges) {
            edges.add(e);
        }

        return edges.toArray(new Edge[edges.size()]);
    }

}
