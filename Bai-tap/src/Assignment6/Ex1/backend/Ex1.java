package Assignment6.Ex1.backend;

import Assignment6.Ex1.entity.CPU;
import Assignment6.Ex1.entity.CPU.Processor;
import Assignment6.Ex1.entity.CPU.Ram;

public class Ex1 {
	public void Question1() {
		System.out.println("-------Question 1-------");
		CPU cpu = new CPU(1305f);
		Processor processor = cpu.new Processor(8, "Intel");
		System.out.println(processor.getCache());
		Ram ram = cpu.new Ram(8, "Intel");
		System.out.println(ram.getClockSpeed());
	}
}
