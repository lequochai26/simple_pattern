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

    public boolean isPath() {
        return (left != null || right != null);
    }

    public boolean isUniPath() {
        return (
            (left != null && right == null)
            ||
            (right != null && left == null)
        );
    }

    public PathNode getUniNode() {
        return (
            isUniPath()
            ? (
                (left != null)
                ? left
                : right
            )
            : null
        );
    }

    public boolean isNode() {
        return (left == null && right == null);
    }

    public void removeNode(PathNode node) {
        if (node == left) {
            left = null;
        }
        else if (node == right) {
            right = null;
        }
    }

    public void removeNode(String key) {
        if (left.getKey().equals(key)) {
            left = null;
        }
        else if (right.getKey().equals(key)) {
            right = null;
        }
    }

    public void replaceNode(PathNode target, PathNode node) {
        if (left == target) {
            left = node;
        }
        else if (right == target) {
            right = node;
        }
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
