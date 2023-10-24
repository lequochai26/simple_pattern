package org.lequochai.simple_pattern.path;

public class PathNode {
    // FIELDS:
    private String key;
    private Object value;
    private PathNode left;
    private PathNode right;

    // CONSTURCTORS:
    public PathNode() {

    }
    public PathNode(String key, Object value, PathNode left, PathNode right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // METHODS:
    public int height() {
        return Math.max(
            (left != null ? left.height() : 0),
            (right != null ? right.height() : 0)
        )+1;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public PathNode getLeft() {
        return left;
    }
    public void setLeft(PathNode left) {
        this.left = left;
    }
    public PathNode getRight() {
        return right;
    }
    public void setRight(PathNode right) {
        this.right = right;
    }
}
