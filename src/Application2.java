
public class Application2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub



	//Testing Task empty argument constructor with out of bounds 11 parameter
	Task task1=new Task("must feed the dog",11);
	
	//instantiating status object in Process
	
	Task.Status stat1= Task.Status.IN_PROCESS;
	
	
	//setting status object stat1 to task1 object
	task1.setStatus(stat1);

	
	
	//printing to String method
	System.out.println(task1.toString());
	

	//setting new priority value
	task1.setPriority(3);
	
	System.out.println(task1.toString());
	
	
	//instantiating another Task 
	
	Task task2=new Task("need to do Homework",8);
	//setting status for Task 2
	Task.Status task2Status=Task.Status.NOT_STARTED;
	
	
	//invoking compareTo method comparing priorities of task2 to task 1 
	System.out.println(task2.compareTo(task1)+"\n\n");
	
	//instantiating process
	
	Process proc1=new Process("12A78D34",0);
	
	System.out.println(proc1);
	
	//instantiating new process
	Process proc2=new Process( "314561S",7);
	//printing process2 
	
	System.out.println(proc2);
	
	//printing comparison of priority values
	System.out.println(proc2.compareTo(proc1));
	
	

	}
}
