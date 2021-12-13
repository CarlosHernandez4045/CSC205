package CustomDeque.DataStructureJavaQueue.src;

import java.util.LinkedList;
import java.util.Queue;

public class JavaCoreQueue<X> {
	private Queue<Gad2Chair> data;
	public JavaCoreQueue() {
		data = new LinkedList<Gad2Chair>();
	}

	public int size() {
		return data.size();
	}
	
	public void enQueue(Gad2Chair item) {
		data.add(item);
	}
	
	public Gad2Chair deQueue() {
		if(data.isEmpty()){
			return null;
		}
		return data.remove();
	}
	
	public boolean contains(Gad2Chair item) {
		
		return data.contains(item);
	}
	
	public Gad2Chair access(int position) {
		Gad2Chair item = new Gad2Chair("","");
		for(int i = 0; i < position; i++) {
			item = data.poll();
		}
		return item;
	}
	

}
