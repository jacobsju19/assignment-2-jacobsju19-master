package edu.up.cs301.shapefitter;

/**
 * Solver: finds fit for a shape; completed solution by Vegdahl.
 *
 * @author ****Justin Jacobs ****
 * @version **** 9/12/16 ****
 */
public class MyShapeSolver extends ShapeSolver {

    /**
     * Creates a solver for a particular problem.
     *
     * @param parmShape the shape to fit
     * @param parmWorld the world to fit it into
     * @param acc to send notification messages to
     */
    public MyShapeSolver(boolean[][] parmShape, boolean[][] parmWorld, ShapeSolutionAcceptor acc) {
        // invoke superclass constructor
        super(parmShape, parmWorld, acc);
    }

    /**
     * Solves the problem by finding a fit, if possible. The last call to display tells where
     * the fit is. If there is no fit, no call to display should be made--alternatively, a call to
     * undisplay can be made.
     */
    public void solve() {
        for(int a = 0; a < shape.length ; a++) {
            for (int b = 0; b < shape.length; b++) {
                for (int i = 0; i < world.length; i++) {
                    for (int j = 0; j < world.length; j++) {
                        if(shape[a][b]== world[i][j] )
                        {
                            display(i, j, Orientation.ROTATE_NONE);
                        }
                    }
                }

            }



        }
        //display(3, 4, Orientation.ROTATE_CLOCKWISE);
    }

    /**
     * Checks if the shape is well-formed: has at least one square, and has all squares connected.
     *
     * @return whether the shape is well-formed
     */
    public boolean check() {
        return Math.random() < 0.5;
    }

}
