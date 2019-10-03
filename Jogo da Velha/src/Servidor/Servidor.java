/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.awt.List;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Ruth Maria e Jhonatan Mickael
 */
public class Servidor {
    
    private ArrayList<Socket> listaDeEspera;
    private HashMap<Socket,Socket> pares;
	public Servidor() throws IOException{
		listaDeEspera = new ArrayList <Socket>();
		pares = new HashMap<Socket,Socket>();
        ServerSocket servidor = null;
        Socket conexaoCliente;
        
		try {
			servidor = new ServerSocket(8422);
			
	    	while (true) { 
	    		  System.out.println("Aguardando conexão");
		          conexaoCliente = servidor.accept();
		          listaDeEspera.add(conexaoCliente);
		          
		          if (listaDeEspera.size() >= 2) {
		        	  Socket s1 = listaDeEspera.get(0);
		        	  Socket s2 = listaDeEspera.get(1);
		        	  
		        	  DataOutputStream saida1 = new DataOutputStream(s1.getOutputStream());
		        	  DataOutputStream saida2 = new DataOutputStream(s2.getOutputStream());
		        	  saida1.writeBytes("jogador=x\n");
		        	  saida2.writeBytes("jogador=o\n");
		        	  
		        	  
		        	  listaDeEspera.remove(0);
		        	  listaDeEspera.remove(0);
		        	  
		        	  pares.put(s1, s2);
		        	  pares.put(s2, s1);
		        	  
		          }
		          
		          
		          new Thread(new EscutaCliente(conexaoCliente, pares)).start(); 
                }
	    	
		} catch (IOException e) {
			e.printStackTrace();
		} 
                
		finally{
			servidor.close();
		}
	}
        
        private class EscutaCliente implements Runnable{

            Socket conexaoCliente;
            HashMap<Socket,Socket> pares;
            String mensagem;
            boolean conectado;
            public EscutaCliente(Socket cliente, HashMap<Socket,Socket> pares) throws IOException {
                conexaoCliente = cliente;
                this.pares = pares;
                this.conectado = true;
                
                
            }

            @Override
            public void run() {
            	BufferedReader entrada = null;
				try {
					entrada = new BufferedReader( new InputStreamReader((conexaoCliente.getInputStream())));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                while (conectado) {
                	try {
						mensagem = entrada.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	Socket openente = (Socket)pares.get(conexaoCliente);
                	DataOutputStream saida = null;
					try {
						saida = new DataOutputStream(openente.getOutputStream());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
						try {
							saida.writeBytes(mensagem+"\n");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
                            try {
                                new DataOutputStream(conexaoCliente.getOutputStream()).writeBytes("desconectou\n");
                                pares.remove(openente);
                                pares.remove(conexaoCliente);
                                conectado = false;
                            } catch (IOException ex) {
                                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                                        
						}
					
                }
            }
            
        }
        
        public static void main(String[] args) throws IOException{
		new Servidor();
	}
    
}

