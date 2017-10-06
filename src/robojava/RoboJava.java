/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robojava;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ev3dev.exception.InvalidMotorException;
import org.ev3dev.exception.InvalidPortException;
import org.ev3dev.hardware.motors.LargeMotor;
import org.ev3dev.hardware.motors.MediumMotor;
import org.ev3dev.hardware.ports.LegoPort;

/**
 *
 * @author SJleASoft(SS)
 */
public class RoboJava {

    /**
     * @param args the command line arguments
     */
    
    static MediumMotor garra;
    static LargeMotor leftMotor,rightMotor,auxMotor;
    
    
    public static void inicializar(){
        System.out.println("inicializando");
        try {
            garra = new MediumMotor(new LegoPort(LegoPort.OUTPUT_A));
            leftMotor = new LargeMotor(new LegoPort(LegoPort.OUTPUT_B));
            rightMotor = new LargeMotor(new LegoPort(LegoPort.OUTPUT_C));
            auxMotor = new LargeMotor(new LegoPort(LegoPort.OUTPUT_D));
        } catch (Exception ex) {
            System.out.println("opa, falhou");
            ex.printStackTrace();
        }
        System.out.println("tudo ok!");
    }
    
    
    public static void main(String[] args) {
        inicializar();
    }
    
}
