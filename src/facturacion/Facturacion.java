
package facturacion;

import java.util.Scanner;
import model.suma;
import model.iva;    
import model.productos;

public class Facturacion {

   
    public static void main(String[] args) {
        
        iva oh= new iva();
        suma obs= new suma();
        productos pro= new productos();
        Scanner O=new Scanner(System.in);
      String[] l= new String[20];
          int num=0;
          
        int total=0;
         int [] c=new int [18];
       
        String [] productos=new String [18];
         productos [0]="Arroz";
         productos [1]="Carne";
         productos [2]="Azurcar";
         productos [3]="Pan";
         productos [4]="Zanahoria";
         productos [5]="Leche";
         productos [6]="Sal";
         productos [7]="Tomate";
         productos [8]="Cebolla";
         productos [9]="Dulces";
         productos [10]="Granos";
         productos [11]="Pollo";
         productos [12]="Pez";
         productos [13]="Galletas";
         productos [14]="Frijoles";
         productos [15]="Lava platos";
         productos [16]="Bolsas";
         productos [17]="Desodorante";
        
         int [] valor=new int [18];
         valor [0]=800;
         valor [1]=8600;
         valor [2]=2000;
         valor [3]=1200;
         valor [4]=800;
         valor [5]=1800;
         valor [6]=800;
         valor [7]=1200;
         valor [8]=1100;
         valor [9]=500;
         valor [10]=800;
         valor [11]=2300;
         valor [12]=4600;
         valor [13]=200;
         valor [14]=1500;
         valor [15]=1100;
         valor [16]=30;
         valor[17]=1200;
        System.out.println("BIENVENIDO AL SUPER \n Lista Productos disponibles:");
        for( int i=0; i<18; i++){
            
        System.out.println(1+i+" "+ productos [i]+"= $"+ valor [i]);
        }
        int X=0;
        int R=0;
        String b;
        System.out.println("");
         System.out.println("por numero de referencia Indique productos que desee añadir a la canasta");
    
           R=O.nextInt();
         while(R<=18){
    
        
     
     switch(R){
         case 1:
           num=num+1;
              System.out.println(productos[0]);
              b=productos[0];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
              c[0]=O.nextInt();
              obs.guardar(c[0]*valor[0]);
             
             
               break;
         case 2:
                
              System.out.println(productos[1]);
              b = productos[1];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[1]=O.nextInt();
              obs.guardar(c[1]*valor[1]);
               
               break;
         case 3:
          
              System.out.println(productos[2]);
              b = productos[2];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[2]=O.nextInt();
              obs.guardar(c[2]*valor[2]);
     
             
               break;
         case 4:
               
              System.out.println(productos[3]);
              b = productos[3];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[3]=O.nextInt();
              obs.guardar(c[3]*valor[3]);
             
            
               break;
         case 5:
       
              System.out.println(productos[4]);
              b = productos[4];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
              c[4]=O.nextInt();
              obs.guardar(c[4]*valor[4]);
           
             
               break;
         case 6:
                
              System.out.println(productos[5]);
              b = productos[5];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
              c[5]=O.nextInt();
              obs.guardar(c[5]*valor[5]);
              
            
               break;
         case 7: 
              System.out.println(productos[6]);
              b = productos[6];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
              c[6]=O.nextInt();
              obs.guardar(c[6]*valor[6]);
             
             
               break;
         case 8:
               
              System.out.println(productos[7]);
              b = productos[7];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[7]=O.nextInt();
              obs.guardar(c[7]*valor[7]);
            
            
               break;
         case 9:
           
              System.out.println(productos[8]);
              b=productos[8];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[8]=O.nextInt();
              obs.guardar(c[8]*valor[8]);
            
               break;
         case 10:
              
              
              System.out.println(productos[9]);
              b=productos[9];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[9]=O.nextInt();
              obs.guardar(c[9]*valor[9]);
           
            
               break;
         case 11:
             
              System.out.println(productos[10]);
              b=productos[10];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[10]=O.nextInt();
              obs.guardar(c[10]*valor[10]);
              
             
               break;
         case 12:
               
              System.out.println(productos[11]);
              b=productos[11];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[11]=O.nextInt();
              obs.guardar(c[11]*valor[11]);
            
               break;
         case 13:
         
              System.out.println(productos[12]);
              b=productos[12];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[12]=O.nextInt();
              obs.guardar(c[12]*valor[12]);
              
             
               break;
         case 14:
              
              System.out.println(productos[13]);
              b=productos[13];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[13]=O.nextInt();
              obs.guardar(c[13]*valor[13]);
              
               break;
         case 15:
             
              System.out.println(productos[14]);
              b=productos[14];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[14]=O.nextInt();
              obs.guardar(c[14]*valor[14]);
       
             
               break;
         case 16:
               
              System.out.println(productos[15]);
              b=productos[15];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[15]=O.nextInt();
              obs.guardar(c[15]*valor[15]);
              
               break;
         case 17:
           
              System.out.println(productos[16]);
              b=productos[16];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[16]=O.nextInt();
              obs.guardar(c[16]*valor[16]);
              
             
               break;
         case 18:
              
              System.out.println(productos[17]);
              b=productos[17];
              pro.setA(b);
             l[num]=pro.pro();
             num=num+1;
              System.out.println("cantidad?");
               c[17]=O.nextInt();
              obs.guardar(c[17]*valor[17]);
            
            
               break;
              
     }
       System.out.println("---------------------------------------------");
     for( int i=0; i<18; i++){
            
        System.out.println(1+i+" "+ productos [i]+"= $"+ valor [i]);
        }
          System.out.println("Insertar nuemero del siguiente producto o 19 para ver la factura");
            R=O.nextInt();
          
        }
     double x=obs.Sumar();

        double f=0;
        f=x*oh.iva();
       
        
        double h=0;
        h=f+x;
    
        

     
        
        
        
        System.out.println("----------------------------------------------");
        System.out.println("|--------------------------------------------|");
        System.out.println("|------------ supertienda poli --------------|");
        System.out.println("|                                            |");
        System.out.println("|10/12/2019        precio                    |");
        System.out.println("|                  subtotal="+ x +"          |");
        System.out.println("|                  iva="+f+"                 |");
        System.out.println("|                  total="+h+"               |");
        System.out.println("|                                            |");
        System.out.println("|                                            |");
        System.out.println("Productos:-------------------------------------");
        for(int i=0; i<=num; i++){
        System.out.println(l[i]);
        
        }
        System.out.println("|                                            |");
           System.out.println("|--------------------------------------------|");
      }
     

     
     
        
     
     
     
     
     
     
    
       
  

}