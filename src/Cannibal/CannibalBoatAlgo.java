package Cannibal;

import java.util.List;

import net.coderodde.fun.cannibals.support.BreadthFirstSearchPathFinder;

public class CannibalBoatAlgo {


	public static void main(String[] args) {
	        ShortestPath<StateNode> finder = 
	                new breadCannibal<>();

	        long ta = System.currentTimeMillis();

	        List<StateNode> path = 
	                finder.search(StateNode.getInitialStateNode(5, 5, 3), 
	                             (StateNode node) -> 
	                             { return node.isSolutionState(); });

	        long tb = System.currentTimeMillis();

	        System.out.println("Duration: " + (tb - ta) + " milliseconds.");

	        int fieldLength = ("" + path.size()).length();

	        if (path.isEmpty()) {
	            System.out.println("No solution.");
	        } else {
	            for (int i = 0; i < path.size(); ++i) {
	                System.out.printf("State %" + fieldLength + "d: %s\n", 
	                                  (i + 1), 
	                                  path.get(i));
	            }
	        }
	    }
	}
	


