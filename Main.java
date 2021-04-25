package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//class Test{
//    public float func(float a,float b){
//        return 0;
//    };
//    public float func(float a,float b,float c) {
//        return -1;
//    }
//
//}
public class Main {

    //二叉树的层序遍历 II
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if(root == null) return result;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        while(!q.isEmpty()) {
//            List<Integer> list = new ArrayList<>();
//            int size = q.size();
//            while(size != 0) {
//                TreeNode cur = q.poll();
//                list.add(cur.val);
//                if(cur.left != null) {
//                    q.offer(cur.left);
//                }
//                if(cur.right != null) {
//                    q.offer(cur.right);
//                }
//                size--;
//            }
//            result.add(0,list);
//        }
//        return result;
//    }

    //验证二叉搜索树
//    public long min = Long.MIN_VALUE;//设定边界值
//    public boolean isValidBST(TreeNode root) {
//        if(root == null) return true;
//        boolean l = isValidBST(root.left);
//        if(root.val <= min) return false;
//        min = root.val;
//        boolean r = isValidBST(root.right);
//        return l && r;
//    }

    //二叉树展开为链表
//    public List<TreeNode> list = new ArrayList<>();
//    public void flatten(TreeNode root) {
//        if(root == null) return;
//        midOrd(root);
//        int size = list.size();
//        for(int i = 1; i < size; i++) {
//            TreeNode prev = list.get(i - 1);
//            TreeNode cur = list.get(i);
//            prev.left = null;
//            prev.right = cur;
//        }
//    }
//    public void midOrd(TreeNode root) {
//        if(root != null){
//            list.add(root);
//            midOrd(root.left);
//            midOrd(root.right);
//        }
//    }

    //路劲总和
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        //非递归
//        if(root == null) return false;
//        Queue<TreeNode> qNode = new LinkedList<>();
//        Queue<Integer> qVal = new LinkedList<>();
//        qNode.offer(root);
//        qVal.offer(root.val);
//        while(!qNode.isEmpty()) {
//            TreeNode cur = qNode.poll();
//            int tmp = qVal.poll();
//            if(cur.left == null && cur.right == null) {
//                if(tmp == targetSum) return true;
//                continue;
//            }
//            if(cur.left != null) {
//                qNode.offer(cur.left);
//                qVal.offer(cur.left.val + tmp);
//            }
//            if(cur.right != null) {
//                qNode.offer(cur.right);
//                qVal.offer(cur.right.val + tmp);
//            }
//
//        }
//        return false;
//        //递归
//        // if(root.left == null && root.right == null) {
//        //     return root.val == targetSum;
//        // }
//        // return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val);
//    }
    public static void main(String[] args) {
	// write your code here

    }
}
