package day4.service;

import day4.dto.Worker;

import java.util.List;
import java.util.Scanner;

public interface WorkerServiceInterface {
	List<Worker> insert(Scanner scanner);
	void show(List<Worker> workers);
}
