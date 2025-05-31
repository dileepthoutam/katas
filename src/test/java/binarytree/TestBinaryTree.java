package binarytree;

import com.dileep.binarytree.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestBinaryTree {
    @Test
    void testBT1() {

        BinaryTree<String> tree = new BinaryTree<>();
        tree.insert("dileep");
        tree.insert("thoutam");
        tree.insert("abc");

        List<String> want = List.of("ab", "dileep", "thoutam");
        List<String> got = tree.inorder();

        Assertions.assertFalse(want.equals(got));
    }
}
