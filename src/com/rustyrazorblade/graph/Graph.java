package com.rustyrazorblade.graph;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by jhaddad on 6/7/14.
 */
public class Graph {
    HashMap<UUID, Vertex> v;

    public Vertex addVertex() {
        return new Vertex();
    }


}
