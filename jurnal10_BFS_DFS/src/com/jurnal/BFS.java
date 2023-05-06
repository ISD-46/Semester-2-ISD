package com.jurnal;

import java.util.*;

public class BFS {
    private Queue<NodeAdjacent> queue = new LinkedList<NodeAdjacent>(); // daftar queue, untuk menyimpan queue
    static ArrayList<NodeAdjacent> nodes = new ArrayList<NodeAdjacent>(); // dafta node, untuk menyimpan daftar node
    /**
     * Method ini digunakan untuk mencari tetangga dari suatu node.
     * Daftar tetangga didapatkan dari matriks adjacent
     */

    public ArrayList<NodeAdjacent> listTetangga(int matriks[][], NodeAdjacent x){
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for(int i = 0; i < nodes.size(); i++){
            if(nodes.get(i).getData() == x.getData()){
                idx = i;
                break;
            }
        }
        if(idx != -1){
            for(int j = 0; j < matriks[idx].length; j++){
                if(matriks[idx][j] == 1){
                    tetangga.add(nodes.get(j));
                }
            }
        }
        return tetangga;
    }

    /**
     * Algoritma utama dari BFS. sesuai dengan Algoritma pada bagian 13.3.1.1 parameter
     * a. matriks : daftar matriks adjacent
     * b. node : simpul awal
     */

    public void bfs(int matriks[][], NodeAdjacent node){
        queue.add(node);
        node.setVisited(true);
        while(!queue.isEmpty()){
            NodeAdjacent element = queue.remove();
            System.out.print(element.getData() + " ");
            ArrayList<NodeAdjacent> tetangga = listTetangga(matriks, element);
            for(int i = 0; i < tetangga.size(); i++){
                NodeAdjacent n = tetangga.get(i);
                if(n != null && !n.isVisited()){
                    queue.add(n);
                    n.setVisited(true);
                }
            }
        }
    }

    /**
     * Method utama, berisi penentuan matriks dan pemanggilan algoritma
     * Daftar simpul, dengan asumsi value unik
     */

    public static void main(String[] args){
        NodeAdjacent nodeA = new NodeAdjacent('A');
        NodeAdjacent nodeB = new NodeAdjacent('B');
        NodeAdjacent nodeC = new NodeAdjacent('C');
        NodeAdjacent nodeD = new NodeAdjacent('D');
        NodeAdjacent nodeE = new NodeAdjacent('E');
        NodeAdjacent nodeF = new NodeAdjacent('F');
        NodeAdjacent nodeG = new NodeAdjacent('G');
        NodeAdjacent nodeH = new NodeAdjacent('H');
        NodeAdjacent nodeI = new NodeAdjacent('I');

        nodes.add(nodeA);
        nodes.add(nodeB);
        nodes.add(nodeC);
        nodes.add(nodeD);
        nodes.add(nodeE);
        nodes.add(nodeF);
        nodes.add(nodeG);
        nodes.add(nodeH);
        nodes.add(nodeI);

        int matriks[][] = {
                // Simpul    A  B  C  D  E  F  G  H  I
                            {0, 1, 0, 1, 1, 0, 0, 0, 0}, // Simpul A = value 1
                            {0, 0, 0, 0, 1, 0, 0, 0, 0}, // Simpul B = value 2
                            {0, 1, 0, 0, 0, 0, 0, 0, 0}, // Simpul C = value 3
                            {0, 0, 0, 0, 0, 0, 1, 0, 0}, // Simpul D = value 4
                            {0, 0, 0, 0, 0, 1, 0, 1, 0}, // Simpul E = value 5
                            {0, 0, 1, 0, 0, 0, 0, 1, 0}, // Simpul F = value 6
                            {0, 0, 0, 0, 0, 0, 0, 1, 0}, // Simpul G = value 7
                            {0, 0, 0, 0, 0, 0, 0, 0, 1}, // Simpul H = value 8
                            {0, 0, 0, 0, 0, 1, 0, 0, 0} // Simpul I = value 9
        };

        System.out.print("Traversal Graph BFS : ");
        BFS bfs_adjacent = new BFS();
        bfs_adjacent.bfs(matriks, nodeA);
        System.out.print("");
    }
}
