package day4;

import day4.dto.Worker;
import day4.service.WorkerServiceInterface;
import day4.service.impl.WorkerService;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WorkerServiceInterface workerService = new WorkerService();
		System.out.println("Worker Manager");
		List<Worker> workers = workerService.insert(scanner);
		workerService.show(workers);
		workers = workerService.delete(workers, scanner);
		workerService.show(workers);
	}
}