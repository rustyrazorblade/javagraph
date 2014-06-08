package com.rustyrazorblade.graph;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jhaddad on 6/7/14.
 */
public class Path {
    LinkedList<Element> path;

    public Path[] createFromRoot() {
        Path[] p = new Path[1];
        p[0] = new Path();
        return p;
    }

    public Path(Element ... elements) {
        path = new LinkedList<>();

        for(Element e: elements) {
            path.add(e);
        }

    }
}
