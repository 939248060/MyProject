package lianxi4;

public class Queue {

	int[] element;
	int size;
	int front;
	int rear;
	
	public Queue(int size) {
		this.size = size;
		front = 0;
		rear = 0;
		element = new int[size];
	}

	public void enqueue(int v) {
		if(getSize() == size){
            System.out.println("队列已满，无法插入新的元素！");
        }else{
        	//System.out.println(front+"ss"+rear+"长度："+getSize());
        	rear++;
        	
        	if(rear >= size) {
        		rear = rear % size;
    		}
        	element[rear]=v;
        	
        }
	}
	
	public int dequeue() {
		int elemFront = 0;
		if(empty()){
            System.out.println("空队列异常！");
        }else{
        	elemFront = element[front];
            front++;       
            if(front >= size) {
            	front = front % size;
            }
        }   
		return elemFront;
	}
	
    public boolean empty() {
    	return rear==front?true:false;
    }
    
    public int getSize() {
    	int front = this.front;
    	int rear = this.rear;
    	
    	int i=0;
    	while(true) {
    		if(rear == front % size) {
    			i++;
    			break;
    		}
    		i++;
    		front++;
    	}
    	
    	return i;
    }
	public static void main(String[] args) {

		Queue qe = new Queue(8);
		qe.enqueue(33);
		qe.enqueue(34);
		qe.enqueue(35);
		qe.enqueue(33);
		qe.enqueue(34);
		qe.enqueue(35);
		qe.enqueue(34);
		qe.enqueue(77);
		qe.enqueue(99);
		qe.enqueue(34);
		System.out.println("删除的元素"+qe.dequeue());
		System.out.println("删除的元素"+qe.dequeue());
		//System.out.println(qe.rear+"font"+qe.front);
//		System.out.println(qe.element[1]);
		qe.enqueue(34);
		qe.enqueue(77);
		qe.enqueue(88);
		//System.out.println(qe.rear+"font"+qe.front);
		System.out.println("队列的长度为"+qe.getSize());
		
	}

}
