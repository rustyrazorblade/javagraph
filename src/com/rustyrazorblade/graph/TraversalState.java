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

    public TraversalState outV(String ... labels) {
        for(Path p: paths) {

        }
        return new TraversalState(root);
    }

    public TraversalState traversal(Function<Vertex, Path[]> t) {
        // applies the traversal t to the
        LinkedList<Path> result = new LinkedList<Path>();

        for(Path p: paths) {
            Element e = p.path.getLast();
        }
        // start with the current end of every path
        // perform the t op on every element
        return new TraversalState(this.root);

    }

}
