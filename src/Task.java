public class Task implements Priority {
	
	enum Status {

	NOT_STARTED,IN_PROCESS,COMPLETE,
		
		Status(){
			
		}//end Status Constructor
		
		
	}// end enum
	
	
	String name;
	int priority;
	private Status stat;
	/**
	* The preferred-argument constructor should initialize the instance variables
	*/
	public Task(String name,int priority) {
		//name of task
		this.name=name;
		this.priority=priority;
		
		//acts as boundaries
		if(this.priority < MIN_PRIORITY) {
			this.priority=MIN_PRIORITY;;
		}
		else if (this.priority >MAX_PRIORITY) {
			this.priority=MAX_PRIORITY;
		}
	}// end Task
		

	
	
	//setters and getters
	/**
	* @return the current value of priority
	*/

	public int getPriority() {
		return priority;
	}
	/**
	* @param priority the value of priority to be set
	*/

	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	/**
	* @return the current value of name
	*/
	
	public String getName() {
		return name;
	}

	/**
	* This method compares priority with another priority
	*
	* @param other is value sent in to the method
	* 
	* @return the difference between priority and other priority
	*
	*/

	public int compareTo(Task other) {
	       return(priority - other.priority);
	 }//end compareTo

	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", stat=" + stat + ", getPriority()=" + getPriority()
				+ ", getName()=" + getName() + ", getStatus()=" + getStatus() + "]";
	}//end toString method
	
	/**
	* @return the current value of Status
	*/
	public Status getStatus() {
	return 	stat;
	}//end getStatus

	/**
	* @param stat the value of l to be set
	*/

	public void setStatus( Task.Status l) {
		this.stat=l;
	}//end setStatus

	
	
	
	
}//end class