package RecursiveAction;

import java.util.concurrent.RecursiveAction;

public class ExampleRecursiveAction extends RecursiveAction {

	private int numb;
	
	ExampleRecursiveAction(int numb) {
		this.numb = numb;
	}
	
	@Override
	protected void compute() {
		
		if( numb > 100 ) {
			
			System.out.println("Parallel execution ExampleRecursiveAction and split the tasks: " + numb);

            ExampleRecursiveAction exampleRecursiveAction1 = new ExampleRecursiveAction(numb/2);
            ExampleRecursiveAction exampleRecursiveAction2 = new ExampleRecursiveAction(numb/2);

            exampleRecursiveAction1.fork();
            exampleRecursiveAction2.fork();
			
		} else {
			System.out.println("Sequential for this task: " + numb);
		}
	}
}
