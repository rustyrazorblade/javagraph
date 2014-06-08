package com.rustyrazorblade.graph;

import java.util.LinkedList;
import java.util.function.Function;

/**
 * Created by jhaddad on 6/7/14.
 */
public class TraversalState {
    Element root;

    LinkedList<Path> paths;

    TraversalState(Element root) {
        this(root, new LinkedList<Path>());
    }

    TraversalState(Element root, LinkedList<Path> paths) {
        this.root = root;
        this.paths = paths;
    }

    public TraversalState outV(String label) {

        return this;
    }

    public TraversalState traversal(Function<Vertex, Path[]> t) {
        // applies the traversal t to the
        LinkedList<Path> result = new LinkedList<Path>();

        for(Path p: paths) {
            Element e = p.path.getLast();
        }
        return new TraversalState(this.root);

    }

}
