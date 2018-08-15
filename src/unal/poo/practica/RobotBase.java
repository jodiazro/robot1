package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            objetos = new City("Field3.txt");
            objetos.showThingCounts(true);
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,0);
            int numObj=0;
            int numMov=0;
            estudiante.move();
            while(estudiante.canPickThing()){
                
                while(estudiante.canPickThing()){
                    estudiante.pickThing();
                    numObj++;
                }
                numMov=numObj;
                estudiante.turnLeft();
                while(numObj!=0){
                    estudiante.move();
                    estudiante.putThing();
                    numObj--;
                }
                estudiante.turnLeft();
                estudiante.turnLeft();
                while(numMov!=0){
                    estudiante.move();
                    numMov--;
                }
                estudiante.turnLeft();
                estudiante.move();
              }
            
            /*objetos = new City("Field2.txt");
	    objetos.showThingCounts(true);
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            
            for(int a=1;a<=3;a++)estudiante.turnLeft();
            for(int i=0; i<3;i++){
                estudiante.move();
                estudiante.turnLeft();
            }
            if(estudiante.canPickThing()){
                estudiante.pickThing();
            }
            estudiante.turnLeft();
            
            for(int i=0; i<3;i++){
                estudiante.move();
                for(int a=1;a<=3;a++)estudiante.turnLeft();
                
            }*/
            /*
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            
	    estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            
            
         */   
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}/*
becker.robots.Thing 6 5
   becker.robots.Thing 5 5
   becker.robots.Thing 4 5
   becker.robots.Thing 3 5
   becker.robots.Thing 3 5
   becker.robots.Thing 3 5
   becker.robots.Thing 3 5
   becker.robots.Thing 2 5
   becker.robots.Thing 1 5
   becker.robots.Thing 5 4
   becker.robots.Thing 4 4
   becker.robots.Thing 4 4
   becker.robots.Thing 4 4
   becker.robots.Thing 3 4
   becker.robots.Thing 2 4
   becker.robots.Thing 1 4
   becker.robots.Thing 5 3
   becker.robots.Thing 4 3
   becker.robots.Thing 3 3
   becker.robots.Thing 3 3
   becker.robots.Thing 3 3
   becker.robots.Thing 3 3
   becker.robots.Thing 3 3
   becker.robots.Thing 3 3
   becker.robots.Thing 2 3
   becker.robots.Thing 1 3
   becker.robots.Thing 4 2
   becker.robots.Thing 3 2
   becker.robots.Thing 2 2
   becker.robots.Thing 6 1
   becker.robots.Thing 5 1
   becker.robots.Thing 4 1
   becker.robots.Thing 3 1
   becker.robots.Thing 3 1
   becker.robots.Thing 3 1
   becker.robots.Thing 2 1
   becker.robots.Thing 1 1*/

