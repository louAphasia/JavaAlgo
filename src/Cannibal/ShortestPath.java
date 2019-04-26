package Cannibal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class ShortestPath<N extends Iterable<N>> {

	
	    List<N> search(N source, Predicate<N> targetPredicate);

	    /**
	     * Constructs a shortest path.
	     * 
	     * @param target    the target node.
	     * @param parentMap the map mapping each node to its predecessor on the 
	     *                  shortest path.
	     * @return a shortest path.
	     */
	    default List<N> tracebackPath(N target, Map<N, N> parentMap) {
	        List<N> ret = new ArrayList<>();
	        N current = target;

	        while (current != null) {
	            ret.add(current);
	            current = parentMap.get(current);
	        }

	        Collections.<N>reverse(ret);
	        return ret;
	    }
	}

