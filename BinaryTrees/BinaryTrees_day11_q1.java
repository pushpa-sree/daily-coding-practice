import java.util.*;
//day 11
//finding the maximum depth of the tree 
//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

public class BinaryTrees_day11_q1 {

    public static TreeNode buildTree(String[] arr){
        if(arr.length == 0 || arr[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while(!q.isEmpty() && i < arr.length){

            TreeNode curr = q.poll();

            if(!arr[i].equals("null")){
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;

            if(i < arr.length && !arr[i].equals("null")){
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

    public static int Traverse(TreeNode root){
        if(root == null){
            return 0; 
        }
        int LeftHeigh = 1 + Traverse(root.left);
        int rightHeigh = 1 + Traverse(root.right);
        return Math.max(LeftHeigh , rightHeigh);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.next();
        }

        TreeNode root = buildTree(arr);

        int depth = Traverse(root);

        System.out.println(depth);
    }
}