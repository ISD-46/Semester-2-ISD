package com.jurnal;

import java.util.*;

public class Graph {
    ArrayList<LinkedList<Node>> adjalist;

    Graph(){
        adjalist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        adjalist.add(currentList);
    }

    public void addEdge(int awal, int tujuan){
        LinkedList<Node> currentList = adjalist.get(awal);
        Node tujuanNode = adjalist.get(tujuan).get(0);
        currentList.add(tujuanNode);
    }

    public boolean checkEdge(int awal, int tujuan){
        LinkedList<Node> currentList = adjalist.get(awal);
        Node wNode = adjalist.get(tujuan).get(0);

        for(Node node : currentList){
            if(node == wNode){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node> currentList : adjalist){
            for(Node node : currentList){
                System.out.print(node.data + "-> ");
            }
            System.out.println();
        }
    }
}
