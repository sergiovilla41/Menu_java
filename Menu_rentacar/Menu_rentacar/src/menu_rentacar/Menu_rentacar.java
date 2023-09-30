/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_rentacar;

import java.util.Scanner;

/**
 *
 * @author Trabajo
 */
public class Menu_rentacar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner sc = new Scanner (System.in);
        //Variables de Sede Palace 
        float valVentPalace = 0, comPalace = 0, promVenPalace = 0;
        int emplPalace = 6, cantVentPalace = 0;
        //Variables de Sede Poblado 
        float valVentPoblado = 0, comPoblado = 0, promVenPoblado = 0;
        int emplPoblado = 16, cantVentPoblado = 0;
        //Variables de Sede Rionegro 
        float valVentRionegro = 0, comRionegro = 0, promVenRionegro = 0;
        int emplRionegro = 9, cantVentRionegro = 0;
        //Variables y constantes generales 
        int sede, opcion, techoComision = 100000000, vlrComision = 10000000, bandera = 1, ventas = 0;
        float monto = 0;
        String y = "si";

        String menu = 
                      
                      "MENU AUTOLARTE\n"+
                      "1.Sede Palac\n"+
                      "2.Sede Poblado\n"+
                      "3.Sede Rionegro\n"
                      +"4.Datos estad\n"+
                      "0.Salir\n"
                      ;

        String subMenu = 
                         
                         "1.Ventas mes\n"+
                         "2.Promedio ventas en el mes\n"+
                         "3.Comisiones\n"
                         ;
        
        while (bandera == 1) {
         
            System.out.println("Que sede desea gestionar?: \n");
            System.out.println(menu);
            sede = sc.nextInt();

            //Elegir la sede
            switch (sede) {
                case 1: {

                    System.out.println("--SEDE PALACÉ--");
                    System.out.println("Cantidad de Empleados: " + emplPalace);
                    System.out.println("Que Desea Realizar");
                    System.out.println(subMenu);
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1: {
                          
                            System.out.println("Ingrese la cantidad de ventas a facturar: ");
                            ventas = sc.nextInt();

                            for (int i = 0; i < ventas; i++) {
                                System.out.println("Ingrese el monto de la venta: " + (i + 1));
                                monto = sc.nextFloat();
                                valVentPalace = valVentPalace + monto;
                                cantVentPalace = cantVentPalace + 1;
                                monto = 0;
                            }
                            //Hallar promedio
                            promVenPalace = valVentPalace / cantVentPalace;
                            //Hallar Comision
                            if (valVentPalace > techoComision) {
                                comPalace = vlrComision / emplPalace;
                            }
                            ventas = 0;
                            break;
                        
                        }
                        case 2: {
                            
                            if (promVenPalace > 0) {
                                System.out.println("El promedio de ventas en el mes es: $" + promVenPalace);
                            } else {
                                System.out.println("Aun no se han facturado ventas");
                            }
                            break;
                         
                        }
                        case 3: {
                             
                            if (comPalace > 0) {
                                System.out.println("La comision de los empleados es: $" + comPalace+"\n");
                            } else {
                                System.out.println("No se ha vendido lo suficiente para comisionar");
                            }
                            break;
                           
                        }
                        default:
                            break;
                    }
                    break;

                }

                case 2: {
                    System.out.println("--SEDE Poblado--");
                    System.out.println("Cantidad de Empleados: " + emplPoblado);
                    System.out.println("Que Desea Realizar");
                    System.out.println(subMenu);
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1: {
                           
                            System.out.println("Ingrese la cantidad de ventas a facturar: ");
                            ventas = sc.nextInt();

                            for (int i = 0; i < ventas; i++) {
                                System.out.println("Ingrese el monto de la venta: " + (i + 1));
                                monto = sc.nextFloat();
                                valVentPoblado = valVentPoblado + monto;
                                cantVentPoblado = cantVentPoblado + 1;
                                monto = 0;
                            }
                            //Hallar promedio
                            promVenPoblado = valVentPoblado / cantVentPoblado;
                            //Hallar Comision
                            if (valVentPoblado > techoComision) {
                                comPoblado = vlrComision / emplPoblado;
                            }
                            ventas = 0;
                            break;
                           
                        }
                        case 2: {
                          
                            if (promVenPoblado > 0) {
                                System.out.println("El promedio de ventas en el mes es: $" + promVenPoblado);
                            } else {
                                System.out.println("Aun no se han facturado ventas");
                            }
                            break;
                            
                        }
                        case 3: {
                            
                            if (comPoblado > 0) {
                                System.out.println("La comision de los empleados es: $" + comPoblado);
                            } else {
                                System.out.println("No se ha vendido lo suficiente para comisionar");
                            }
                            break;
                             
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 3: {
                    System.out.println("--SEDE Rionegro--");
                    System.out.println("Cantidad de Empleados: " + emplRionegro);
                    System.out.println("Que Desea Realizar");
                    System.out.println(subMenu);
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1: {
                             
                            System.out.println("Ingrese la cantidad de ventas a facturar: ");
                            ventas = sc.nextInt();

                            for (int i = 0; i < ventas; i++) {
                                System.out.println("Ingrese el monto de la venta: " + (i + 1));
                                monto = sc.nextFloat();
                                valVentRionegro = valVentRionegro + monto;
                                cantVentRionegro = cantVentRionegro + 1;
                                monto = 0;
                            }
                            //Hallar promedio
                            promVenRionegro = valVentRionegro / cantVentRionegro;
                            //Hallar Comision
                            if (valVentRionegro > techoComision) {
                                comPalace = vlrComision / emplRionegro;
                            }
                            ventas = 0;
                            break;
                            
                        }
                        case 2: {
                           
                            if (promVenRionegro > 0) {
                                System.out.println("El promedio de ventas en el mes es: $" + promVenRionegro);
                            } else {
                                System.out.println("Aun no se han facturado ventas");
                            }
                            break;
                           
                        }
                        case 3: {
                        
                            if (comRionegro > 0) {
                                System.out.println("La comision de los empleados es: $" + comRionegro);
                            } else {
                                System.out.println("No se ha vendido lo suficiente para comisionar");
                            }
                            break;
                          
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 4: {
                    
                    
                    System.out.println("--DATOS ESTADISTICOS--");
                    //Numero de ventas
                    if (cantVentPalace > cantVentPoblado && cantVentPalace > cantVentRionegro) {
                        System.out.println("La sede con mayor numero de ventas es Palace con: " + cantVentPalace+"\n");
                    }

                    if (cantVentPoblado > cantVentPalace && cantVentPoblado > cantVentRionegro) {
                        System.out.println("La sede con mayor numero de ventas es Poblado con: " + cantVentPoblado+"\n");
                    }

                    if (cantVentRionegro > cantVentPalace && cantVentRionegro > cantVentPoblado) {
                        System.out.println("La sede con mayor numero de ventas es Rionegro con: " + cantVentRionegro+"\n");
                    }
                    //Emoleados
                    if (emplPalace > emplPoblado && emplPalace > emplRionegro) {
                        System.out.println("La sede con mas empleados es Palace con: " + emplPalace+"\n");
                    }

                    if (emplPoblado > emplPalace && emplPoblado > emplRionegro) {
                        System.out.println("La sede con mas empleados es es Poblado con: " + emplPoblado+"\n");
                    }

                    if (emplRionegro > emplPalace && emplRionegro > emplPoblado) {
                        System.out.println("La sede con mas empleados es es Rionegro con: " + emplRionegro+"\n");
                    }
                    //Promedio
                    if (promVenPalace > promVenPoblado && promVenPalace > promVenRionegro) {
                        System.out.println("La sede con el promedio mas alto es Palace con: $" + promVenPalace+"\n");
                    }

                    if (promVenPoblado > promVenPalace && promVenPoblado > promVenRionegro) {
                        System.out.println("La sede con el promedio mas alto es Poblado con: $" + promVenPoblado+"\n");
                    }

                    if (promVenRionegro > promVenPalace && promVenRionegro > promVenPoblado) {
                        System.out.println("La sede ccon el promedio mas alto es Rionegro con: $" + promVenRionegro+"\n");
                    }
                   

                    break;
                    
                }
                case 0: {
                    System.out.println("--HASTA PRONTO--");
                    bandera = 0;
                    break;

                }
                default:
                    System.out.println("--OPCIÓN INCORRECTA--");
                    break;
            }
      
        }
    }
    
}
