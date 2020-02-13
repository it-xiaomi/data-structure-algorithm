package com.xiaomi.datastructure.tree;

/**
 * 二叉树遍历
 * 前序遍历
 *      1.先输出当前结点（初始化时的结点）
 *      2.如果左子节点不为空，则递归前序遍历左子节点
 *      3.如果右子节点不为空，则递归前序遍历右子节点
 * 中序遍历
 *      1.如果当前结点的左子节点不为空，则递归中序遍历左子节点
 *      2.输出当前结点
 *      3.如果点前结点的右子节点不为空，则递归中序遍历右子节点
 * 后序遍历
 *      1.如果当前结点的左子节点不为空，则递归后序遍历左子节点
 *      2.如果当前结点的右子节点不为空，则递归后序遍历右子节点
 *      3.输出当前结点
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        EmpNode node1 = new EmpNode(1, "A");
        EmpNode node2 = new EmpNode(2, "B");
        EmpNode node3 = new EmpNode(3, "C");
        EmpNode node4 = new EmpNode(4, "D");
        EmpNode node5 = new EmpNode(5, "E");
        EmpNode node6 = new EmpNode(6, "F");
        EmpNode node7 = new EmpNode(7, "G");
        EmpNode node8 = new EmpNode(8, "H");
        EmpNode node9 = new EmpNode(9, "K");

        node1.setLeftNode(node2);
        node1.setRightNode(node5);

        node2.setRightNode(node3);

        node3.setLeftNode(node4);

        node5.setRightNode(node6);

        node6.setLeftNode(node7);

        node7.setLeftNode(node8);
        node7.setRightNode(node9);

        binaryTree.setRoot(node1);

        /*//前序遍历
        System.out.println("前序遍历结果：");
        binaryTree.preTraversal();

        //中序遍历
        System.out.println("中序遍历结果：");
        binaryTree.middleTraversal();

        //后序遍历
        System.out.println("后序遍历结果：");
        binaryTree.postTraversal();*/

        //前序遍历查找
//        EmpNode resultNode = binaryTree.proSearch(5);
//        System.out.println(resultNode);

        //中序遍历查找
//        EmpNode resultNode = binaryTree.middleSearch(5);
//        System.out.println(resultNode);

        //后序遍历查找
        EmpNode resultNode = binaryTree.postSearch(5);
        System.out.println(resultNode);
    }
}

class BinaryTree {
    private EmpNode root;

    public void setRoot(EmpNode root) {
        this.root = root;
    }

    //前序遍历
    public void preTraversal() {
        if(this.root != null) {
            this.root.preTraversal();
        } else {
            System.out.println("二叉树为空，无法遍历！");
        }
    }

    //中序遍历
    public void middleTraversal() {
        if(this.root != null) {
            this.root.middleTraversal();
        } else {
            System.out.println("二叉树为空，无法遍历！");
        }
    }

    //后序遍历
    public void postTraversal() {
        if(this.root != null) {
            this.root.postTraversal();
        } else {
            System.out.println("二叉树为空，无法遍历！");
        }
    }

    //前序遍历查找
    public EmpNode proSearch(int id) {
        EmpNode resultNode = this.root.preSearch(id);
        return resultNode != null ? resultNode:null;
    }

    //中序遍历查找
    public EmpNode middleSearch(int id) {
        EmpNode resultNode = this.root.middleSearch(id);
        return resultNode != null ? resultNode:null;
    }

    //后序遍历查找
    public EmpNode postSearch(int id) {
        EmpNode resultNode = this.root.postSearch(id);
        return resultNode != null ? resultNode:null;
    }
}

//结点信息
class EmpNode {
    private int id;
    private String name;
    private EmpNode leftNode;
    private EmpNode rightNode;

    public EmpNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(EmpNode leftNode) {
        this.leftNode = leftNode;
    }

    public EmpNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(EmpNode rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "EmpNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 前序遍历
     *      1.先输出当前结点（初始化时的结点）
     *      2.如果左子节点不为空，则递归前序遍历左子节点
     *      3.如果右子节点不为空，则递归前序遍历右子节点
     */
    public void preTraversal() {
        //this 表示当前结点对象
        System.out.println(this);

        if(this.leftNode != null) {
            this.leftNode.preTraversal();
        }

        if(this.rightNode != null) {
            this.rightNode.preTraversal();
        }
    }

    /**
     * 中序遍历
     *     1.如果当前结点的左子节点不为空，则递归中序遍历左子节点
     *     2.输出当前结点
     *     3.如果点前结点的右子节点不为空，则递归中序遍历右子节点
     */
    public void middleTraversal() {
        if(this.leftNode != null) {
            this.leftNode.middleTraversal();
        }

        System.out.println(this);

        if(this.rightNode != null) {
            this.rightNode.middleTraversal();
        }
    }

    /**
     * 后序遍历
     *      1.如果当前结点的左子节点不为空，则递归后序遍历左子节点
     *      2.如果当前结点的右子节点不为空，则递归后序遍历右子节点
     *      3.输出当前结点
     */
    public void postTraversal() {
        if(this.leftNode != null) {
            this.leftNode.postTraversal();
        }

        if(this.rightNode != null) {
            this.rightNode.postTraversal();
        }

        System.out.println(this);
    }

    /**
     * 前序遍历查找
     *  1.先判断当前结点的id是否等于要查找的id
     *  2.如果相等，则返回当前结点
     *  3.如果不相等，则判断当前结点的左子节点是否为空，如果不为空，则递归查找左子节点
     *  4.如果左递归找到则返回
     *  5.如果左递归没有找到，则继续判断当前结点的右子节点是否为空，如果不为空，则继续遍历右子节点
     */
    public EmpNode preSearch(int id) {
        System.out.println("执行了");
        if(this.id == id) {
            return this;
        }

        EmpNode resultNode = null;
        if(this.leftNode != null) {
            resultNode = this.leftNode.preSearch(id);
        }

        if(resultNode != null) {
            return resultNode;
        }

        if(this.rightNode != null) {
            resultNode = this.rightNode.preSearch(id);
        }

        return resultNode;
    }

    /**
     * 中序遍历查找
     *   1.先判断当前结点的左子节点是否为空，如果不为空，则递归查找左子节点
     *   2.如果左递归找到则返回
     *   3.如果左递归没有找到，就和当前结点id比较，如果相等，则返回当前结点
     *   4.如果不相等，则判断当前结点的右子节点是否为空，如果不为空，则继续遍历右子节点
     */
    public EmpNode middleSearch(int id) {
        EmpNode resultNode = null;
        if(this.leftNode != null) {
            resultNode = this.leftNode.middleSearch(id);
        }

        if(resultNode != null) {
            return resultNode;
        }

        System.out.println("执行了");
        if(this.id == id) {
            return this;
        }

        if(this.rightNode != null) {
            resultNode = this.rightNode.middleSearch(id);
        }

        return  resultNode;
    }

    /**
     * 后序遍历查找
     *   1.先判断当前结点的左子节点是否为空，如果不为空，则递归查找左子节点
     *   2.如果左递归找到则返回
     *   3.如果左递归没有找到，则判断当前结点的右子节点是否为空，如果不为空，则继续遍历右子节点
     *   4.如果右递归找到，则返回
     *   5.如果右递归没有找到，就和当前结点id比较，如果相等，则返回当前结点，如果不相等，则返回null
     */
    public EmpNode postSearch(int id) {
        EmpNode resultNode = null;
        if(this.leftNode != null) {
            resultNode = this.leftNode.postSearch(id);
        }

        if(resultNode != null) {
            return resultNode;
        }

        if(this.rightNode != null) {
            resultNode = this.rightNode.postSearch(id);
        }

        if(resultNode != null) {
            return resultNode;
        }

        System.out.println("执行了");
        if(this.id == id) {
            return this;
        }
        return null;
    }


}


