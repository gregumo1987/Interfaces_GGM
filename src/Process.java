public class Process implements Priority {

	private String processID;
	private int priority;
	
	/**
	* The preferred-argument constructor should initialize the instance variables
	*/
	public Process(String Proc, int priority) {
		
		this.processID=Proc;
		this.priority=priority;
		
		//acts as boundaries must be between 1-10
		if(this.priority < MIN_PRIORITY) {
			this.priority=MIN_PRIORITY;;
		}
		else if (this.priority >MAX_PRIORITY) {
			this.priority=MAX_PRIORITY;
		}
	}
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
	* @return the current value of processID
	*/

	public String getProcessID() {
		return processID;
	}


	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}
	/**
	* This method compares Process priority with another priority
	*
	* @param other is value sent in to the method
	* 
	* @return the difference between priority and other priority
	*
	*/

	public int compareTo(Process other) {
	       return(priority - other.priority);
	 }//end compareTo
	
	
	
	
	
}//end class