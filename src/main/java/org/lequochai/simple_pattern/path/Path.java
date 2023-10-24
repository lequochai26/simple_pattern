package org.lequochai.simple_pattern.path;

public class Path implements IPath {
    // FIELDS:
    private PathNode root;

    // CONSTRUCTORS:
    public Path() {

    }

    public Path(PathNode root) {
        this.root = root;
    }

    // METHODS:
    @Override
    public void set(String key, Object value) {
        // Create a new node
        PathNode node = new PathNode();
        node.setKey(key);
        node.setValue(value);

        // Root case
        if (root == null) {
            root = node;
            return;
        }

        // Not root case
        this.set(node, root);
    }

    private void set(PathNode node, PathNode root) {
        // Get keys
        String nodeKey = node.getKey();
        String rootKey = root.getKey();

        // Get keys hashes
        int nodeKeyHash = nodeKey.hashCode();
        int rootKeyHash = rootKey.hashCode();

        // Hashes comparison
        // Left way case
        if (nodeKeyHash < rootKeyHash) {
            // Get root's left node
            PathNode rootLeft = root.getLeft();

            // Root's left node null case
            if (rootLeft == null) {
                // Set node into root's left node
                root.setLeft(node);
            }
            // Root's left node not null case
            else {
                // Keep going
                this.set(node, rootLeft);
            }
        }
        // Right way case
        else if (nodeKeyHash > rootKeyHash) {
            // Get root's right node
            PathNode rootRight = root.getRight();

            // Root's right node null case
            if (rootRight == null) {
                // Set node into root's right node
                root.setRight(node);
            }
            // Root's right node not null case
            else {
                // Keep going
                this.set(node, rootRight);
            }
        }
        // Otherwise
        else {
            // Set value for this root
            root.setValue(
                node.getValue()
            );
        }
    }

    @Override
    public void remove(String key) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(String key) {
        return null;
    }

    public PathNode getRoot() {
        return root;
    }
    public void setRoot(PathNode root) {
        this.root = root;
    }
}
