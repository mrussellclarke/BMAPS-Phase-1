/*************************************************************************
 *  Compilation:  javac BisonMaps.java
 *  Execution:    java BisonMaps mapfile < input.txt
 *  Dependencies: EuclideanGraph.java Dijkstra.java In.java StdIn.java
 *
 *  Reads in a map from a file, and repeatedly reads in two integers s
 *  and d from standard input, and prints the shortest path from s
 *  to d to standard output.
 *
 ****************************************************************************/


public class BisonMaps {

    public static void main(String[] args) {

        // read in the graph from a file
        In graphin = new In(args[0]); //Declares new object graphin of type In and sets value to function In with arguments called with program 
        EuclideanGraph G = new EuclideanGraph(graphin);//Declares object G of type EuclideanGraph and calls with file graphin
        System.err.println("Done reading the graph " + args[0]);
        System.err.println("Enter query pairs from stdin");

        // read in the s-d pairs from standard input
        Dijkstra dijkstra = new Dijkstra(G);//Declares new object dijkstra of type Dijkstra and sets value to result of calling Dijkstra with argument G
        while(!StdIn.isEmpty()) {
            int s = StdIn.readInt();
            int d = StdIn.readInt();
            dijkstra.showPath(s, d);
            System.out.println();
        }
    }
}
