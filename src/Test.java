

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int[] nodes = {1, 2, 3, 4, 5, 6, 7};

        String[] result = test.Solution(nodes);
        for (String string : result) {
            System.out.println(string);
        }
    }

    private static String[] Solution(int[] nodes) {
        String[] result = new String[3];
        result[0] = preorder(nodes, 0).trim();
        result[1] = inorder(nodes, 0).trim();
        result[2] = postorder(nodes, 0).trim();
        return result;
    }

    private static String preorder(int[] nodes, int i) {
        if (i >= nodes.length) {
            return "";
        }
        return nodes[i] + " " +
                preorder(nodes, 2 * i + 1) +
                preorder(nodes, 2 * i + 2);
    }
    private static String inorder(int[] nodes, int i) {
        if (i >= nodes.length) {
            return "";
        }
        return inorder(nodes, 2 * i + 1) +
                nodes[i] + " " +
                inorder(nodes, 2 * i + 2);
    }

    private static String postorder(int[] nodes, int i) {
        if (i >= nodes.length) {
            return "";
        }
        return postorder(nodes, 2 * i + 1) +
                postorder(nodes, 2 * i + 2) +
                nodes[i] + " ";
    }
}
