/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Rafiqul Jakir
 */
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    public ComputerFacade(){
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();
    }
    public void StartComputer(){
        cpu.ProcessData();
        hardDrive.readData();
        memory.Load();
        System.out.println("Computer Start Started Successfully.....");
    }
    
}
