/*
 * 
 * For educational purposes only.
 * 
 */
package Model;

import java.util.Observable;

/**
 *
 * @author rolley
 */
public class Model extends Observable {
    
    IQueries queries;
    
    public Model( IQueries iq ) {
        super();
        queries = iq;
    }
    
}
