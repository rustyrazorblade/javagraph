package com.rustyrazorblade.graph;

/**
 * Created by jhaddad on 6/7/14.
 */
public class Element {
    public TraversalState query() {
        return new TraversalState(this);
    }
}
