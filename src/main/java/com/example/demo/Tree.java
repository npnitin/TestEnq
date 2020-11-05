package com.example.demo;

public class Tree {

    private Node root;

    public Node getNode() {
        return root;
    }

    public void setNode(Node root) {
        this.root = root;
    }

    public void insert(int data){
        if(root == null){
            root = new Node();
            root.setData(data);
        }else{
            Node current = root;
            while(true){
                if(current.getData()>data){
                    if(current.getLeft()==null){
                        Node node = new Node();
                        node.setData(data);
                        current.setLeft(node);
                    }else{
                        current = current.getLeft();
                    }
                }
                if(current.getData()<data){
                    if(current.getRight()==null){
                        Node node = new Node();
                        node.setData(data);
                        current.setRight(node);
                    }else{
                        current = current.getRight();
                    }

                }
            }

        }

    }
}
