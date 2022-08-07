import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
public class TaskApplication {
	public static void main(String[] args) {

			ArrayList<Task> tasks = new ArrayList<Task>();

	
		tasks.add(new Task("Task1", Priority.LOW));
		tasks.add(new Task("Task2", Priority.HIGH));
		tasks.add(new Task("Task3", Priority.MEDIUM));
		tasks.add(new Task("Task4", Priority.LOW));
		tasks.add(new Task("Task5", Priority.HIGH));
		tasks.add(new Task("Task6", Priority.HIGH));

	
		Collections.sort(tasks, Collections.reverseOrder());
		
		Iterator<Task> itr = tasks.iterator();
	
		System.out.println("Tasks ranked by priority(highest to lowest): ");
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}

		}
}
