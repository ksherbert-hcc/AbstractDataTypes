package adt;

import java.util.Iterator;

public interface Tree<T> extends Iterable<T> {    
    /**
     * 
     */
    int length();
    
    /**
     * 
     */
    int degree();
    
    /**
     * 
     */
    int height();
    
    /**
     * 
     */
    Iterator<T> preorder();
    
    /**
     * 
     */
    Iterator<T> inorder();
    
    /**
     * 
     */
    Iterator<T> postorder();
    
    /**
     * 
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
     * @return true iff all tests pass
     */
    public static boolean validate(Tree<Integer> tree) {
        /* TODO: generic tests on
            
            int length();
            int degree();
            int height();
            Iterator<T> preorder();
            Iterator<T> inorder();
            Iterator<T> postorder();
            Iterator<T> levelorder();
            Iterator<T> iterator()
    
        */
       /* TODO: But there is no way to modify the generic tree, so... */
       return true;
    }

}
