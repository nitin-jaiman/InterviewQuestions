package BinarySearchTree;

/**
 * Created by apple on 10/02/17.
 */
public class BSTTheory {

    /*

    Total number of possible Binary Search Trees with n keys

    is  Catalan number Cn = (2n)!/(n+1)!*n!

    Here is a systematic way to enumerate these BSTs. Consider all possible binary search trees with each element at the root. If there are n nodes, then for each choice of root node, there are n – 1 non-root nodes and these non-root nodes must be partitioned into those that are less than a chosen root and those that are greater than the chosen root.

Let’s say node i is chosen to be the root. Then there are i – 1 nodes smaller than i and n – i nodes bigger than i. For each of these two sets of nodes, there is a certain number of possible subtrees.

Let t(n) be the total number of BSTs with n nodes. The total number of BSTs with i at the root is t(i – 1) t(n – i). The two terms are multiplied together because the arrangements in the left and right subtrees are independent. That is, for each arrangement in the left tree and for each arrangement in the right tree, you get one BST with i at the root.





     */


}
