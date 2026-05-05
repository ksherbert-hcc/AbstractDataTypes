package adt;

import java.util.Iterator;

/// A data structure where data is organized into a mathematical tree structure,
///  comprised of nodes which have a certain number of children.
/// 
/// This interface is meant to be implemented by the following concrete classes:
/// - `BinarySearchTree`
/// - `MinHeap`
/// 
/// @param <T> the type of elements in the tree
public interface Tree<T> extends Iterable<T> {    
    /**
     * Compute the number of items in this collection.
     * @return the number of items
     */
    int length();
    
    /**
     * Compute the degree of the tree, i.e. the largest number of children any single node has.
     * @return the degree of the tree
     */
    int degree();
    
    /**
     * Compute the height of the tree, i.e. the longest path to descend from the root to a leaf.
     * @return the height of the tree
     */
    int height();
    
    /**
     * Perform a pre-order traversal of the tree.
     * @return an iterator
     */
    Iterator<T> preorder();
    
    /**
     * Perform an in-order traversal of the tree.
     * @return an iterator
     */
    Iterator<T> inorder();
    
    /**
     * Perform a post-order traversal of the tree.
     * @return an iterator
     */
    Iterator<T> postorder();
    
    /**
     * Perform a level order traversal of the tree.
     * @return an iterator
     */
    Iterator<T> levelorder();

    /*
     *
     * Iterator<T> iterator() inherited from Iterable<T>
     * 
     */

    /**
     * Run generic interface validation on a concrete tree type.
     * @param tree an empty tree of integers
     */
    public static void validate(Tree<Integer> tree) {
        assert tree.length() == 0 : "Tree validation requires an empty data structure.";

        // Empty trees have trivial behavior.
        assert tree.degree() == 0;
        assert tree.height() == 0;
        assert !tree.preorder().hasNext();
        assert !tree.inorder().hasNext();
        assert !tree.postorder().hasNext();
        assert !tree.levelorder().hasNext();
        assert !tree.iterator().hasNext();

        System.out.println(String.format("""
            %s passes Tree interface validation. (But that doesn't mean a whole lot!)
        """, tree.getClass().getSimpleName()));
    }

}
