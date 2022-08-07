public class Task implements Priority, Comparable<Task>
{

private int priority;

private String description;

public Task(String description, int priority)
{
this.description = description;

this.priority = priority;

if(this.priority < LOW)
this.priority = LOW;
else if(this.priority > HIGH)
this.priority = HIGH;
}

@Override
public int compareTo(Task other) {
return(priority - other.priority);
}

@Override
public void setPriority(int priority) {
if(priority >= LOW && priority <= HIGH)
this.priority = priority;

}

@Override
public int getPriority() {
return priority;
}

public String getDescription()
{
return description;
}

public String toString()
{
return "Task: [Description: "+description+" Priority: "+priority+"]";
}

}