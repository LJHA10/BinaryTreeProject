/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binarytreeproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luisj
 */
public class BinaryTreeProject {

    public static void main(String[] args) throws IOException {
        //Programa que crea un arbol binario y lo recorre en preorden, inorden y postorden.
        BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;
        int dato;        
        
        
        System.out.println("----------------------------------");
        System.out.println("Programa que crea un árbol binario");
        
        
        //Creacion de el arbol
        BinaryTree arbol = new BinaryTree();
        
        //Agregar datos al árbol 
        do{
            System.out.println("Escribe dato para ingresar al árbol");
            entrada = bufer.readLine();
            dato = Integer.parseInt(entrada);
            arbol.add(dato);
            System.out.println("Escribe n para parar, cualquier otra tecla para ingresar otro dato: ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
        }while(respuesta != 'n');
        
        System.out.println("Recorrido del arbol en preorder:");
        arbol.preorder(arbol.root);
    }
}
