package queueController;

import java.util.LinkedList;
import java.util.Queue;

import queueModel.Customer;

public class QueueController
{
	private Queue<Customer> customerLine;
	
	public QueueController()
	{
		customerLine = new LinkedList<Customer>();
	}
	
	public void start()
	{
		buildQueue();
	}
	
	private void buildQueue()
	{
		customerLine.add(new Customer(false, "George", 1.0));
		customerLine.add(new Customer(true, "Harry", 24.99));
		customerLine.add(new Customer(true, "Katelynn", 47.50));
	}
}
