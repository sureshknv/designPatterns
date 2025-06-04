package com.adobe.Graphs;

import java.util.ArrayList;
import java.util.List;

public class BFS {


    public  static void  addUndirectedEdge(List<List<Integer>> graph, int n1,int n2){
        //edge from n1->n2 and n2->n1
        if(graph.size()<n1 ){
            for(int i=graph.size();i<n1;i++)
            graph.add(new ArrayList<>());
        }
        if(graph.size()<n2){
            for(int i=graph.size();i<n2;i++)
                graph.add(new ArrayList<>());
        }
        graph.get(n1).add(n2);
        graph.get(n2).add(n1);
    }




    public static void main(String args[]){
//        int[] arr={1,2,3,4,5,10,6,13,6,18,8,19,20,9,201,221,412,312,}
//        List<List<Integer>> graph= new GraphUtil.createGraph();
        List<List<Integer>> graph= new ArrayList<>();
        addUndirectedEdge(graph,1,2);
        addUndirectedEdge(graph,0,4);
        addUndirectedEdge(graph,1,3);
        addUndirectedEdge(graph,2,3);
        addUndirectedEdge(graph,2,4);
        System.out.println("Graph created");
    }


}
