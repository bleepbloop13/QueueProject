package queueController;

import java.util.Queue;

import queueModel.Customer;

public class QueueController
{
	private Queue<Customer> customerLine;
	
	public void start()
	{
		buildQueue();
	}
	
	private void buildQueue()
	{
		this.customerLine.add(new Customer(false, "George", 0.0));
		this.customerLine.add(new Customer(true, "Harry", 24.99));
		this.customerLine.add(new Customer(true, "Katelynn", 47.50));
	}
}
