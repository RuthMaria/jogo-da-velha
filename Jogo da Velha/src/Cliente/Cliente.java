/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Servidor.Espera;
import java.awt.Dialog;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruth Maria e Jhonatan Mickael
 */

public class Cliente extends javax.swing.JFrame {

    boolean jogadorAtivo = true;
    
    boolean ganhou = false;
    boolean eX;
    Socket cliente;
    Espera telaEspera;
    JButton botoes[][];
    DataOutputStream saida;
    public Cliente() {
        initComponents();
        
        telaEspera = new Espera(this,true);
        telaEspera.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        botoes = new JButton[3][3];
        botoes[0][0] = botao1;
        botoes[0][1] = botao2;
        botoes[0][2] = botao3;
        botoes[1][0] = botao4;
        botoes[1][1] = botao5;
        botoes[1][2] = botao6;
        botoes[2][0] = botao7;
        botoes[2][1] = botao8;
        botoes[2][2] = botao9;
        
        
        
        Thread threadEspera = new Thread(){
            @Override
            public void run() {
                telaEspera.setVisible(true);
            }
        };
        threadEspera.start();
        
        
        
        ConexaoServidor();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botao2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(botao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Você:");

        jLabel2.setText("Simbolo: ");

        jLabel4.setText("Oponente:");

        jLabel5.setText("Simbolo: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConexaoServidor() {
		try {
			cliente = new Socket("localhost", 8422);
                        saida = new DataOutputStream(cliente.getOutputStream());
                        new Thread(new EscutaServidor(cliente)).start();

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void jogadorAtivo(){
        
       jogadorAtivo = !jogadorAtivo;
        
        jogada("X");
        jogada("O");
    }
    
    
    public void jogada(String valorJogado){
       
        /****************** Verificando as linhas *********************/
        if (botao1.getText().equals(valorJogado) && 
            botao2.getText().equals(valorJogado) &&
            botao3.getText().equals(valorJogado)){
            
            if(eX && valorJogado.equals("X"))
                   vencedor("Você");
                                          
            else if(!eX && !valorJogado.equals("X"))
                   vencedor("Você");
                   else
                        vencedor("O oponente");
                        
            ganhou = true;
        }
        
        else if (botao4.getText().equals(valorJogado) && 
            botao5.getText().equals(valorJogado) &&
            botao6.getText().equals(valorJogado)){
           
            if(eX && valorJogado.equals("X"))
                   vencedor("Você");
                                          
            else if(!eX && !valorJogado.equals("X"))
                   vencedor("Você");
                   else
                        vencedor("O oponente");
            
            ganhou = true;
        }
        
        else if (botao7.getText().equals(valorJogado) && 
            botao8.getText().equals(valorJogado) &&
            botao9.getText().equals(valorJogado)){
           
            if(eX && valorJogado.equals("X"))
                   vencedor("Você");
                                          
            else if(!eX && !valorJogado.equals("X"))
                   vencedor("Você");
                   else
                        vencedor("O oponente");
            
            ganhou = true;
        }
    
        
        /****************** Verificando as colunas *********************/
        else if (botao1.getText().equals(valorJogado) && 
            botao4.getText().equals(valorJogado) &&
            botao7.getText().equals(valorJogado)){
           
            if(eX && valorJogado.equals("X"))
                   vencedor("Você");
                                          
            else if(!eX && !valorJogado.equals("X"))
                   vencedor("Você");
                   else
                        vencedor("O oponente");
            
            ganhou = true;
        }
        
        else if (botao2.getText().equals(valorJogado) && 
            botao5.getText().equals(valorJogado) &&
            botao8.getText().equals(valorJogado)){
           
            if(eX && valorJogado.equals("X"))
                   vencedor("Você");
                                          
            else if(!eX && !valorJogado.equals("X"))
                   vencedor("Você");
                   else
                        vencedor("O oponente");
            
            ganhou = true;
        }
        
        else if (botao3.getText().equals(valorJogado) && 
            botao6.getText().equals(valorJogado) &&
            botao9.getText().equals(valorJogado)){
           
            if(eX && valorJogado.equals("X"))
                   vencedor("Você");
                                          
            else if(!eX && !valorJogado.equals("X"))
                   vencedor("Você");
                   else
                        vencedor("O oponente");
            
            ganhou = true;
        }
        
        /****************** Verificando as diagonais *********************/
        else if (botao1.getText().equals(valorJogado) && 
            botao5.getText().equals(valorJogado) &&
            botao9.getText().equals(valorJogado)){
           
            if(eX && valorJogado.equals("X"))
                   vencedor("Você");
                                          
            else if(!eX && !valorJogado.equals("X"))
                   vencedor("Você");
                   else
                        vencedor("O oponente");
            ganhou = true;
        }
        
        else if (botao3.getText().equals(valorJogado) && 
            botao5.getText().equals(valorJogado) &&
            botao7.getText().equals(valorJogado)){
           
            if(eX && valorJogado.equals("X"))
                   vencedor("Você");
                                          
            else if(!eX && !valorJogado.equals("X"))
                   vencedor("Você");
                   else
                        vencedor("O oponente");
            
            ganhou = true;
        }
        
        
        /****************** Verificando empate *********************/
        else if (!botao1.getText().equals("") && 
                 !botao2.getText().equals("") &&
                 !botao3.getText().equals("") &&
                 !botao4.getText().equals("") && 
                 !botao5.getText().equals("") &&
                 !botao6.getText().equals("") &&
                 !botao7.getText().equals("") && 
                 !botao8.getText().equals("") &&
                 !botao9.getText().equals("") && 
                 !ganhou){
           
            vencedor("Ninguem");
        }               
    }
    
   public void vencedor (String jogador){
        
            JOptionPane.showMessageDialog(Cliente.this, jogador +" ganhou!");
            
            
        
        
        limparCampos();
        
    }
    
    public void limparCampos(){
       botao1.setText("");
       botao2.setText("");
       botao3.setText("");
       botao4.setText("");
       botao5.setText("");
       botao6.setText("");
       botao7.setText("");
       botao8.setText("");
       botao9.setText("");
       
    }
   
    
    private void jogadaX(int x, int y){
        botoes[x][y].setText("X");
        jogadorAtivo();
        
    }
    
    private void jogadaO(int x, int y){
        botoes[x][y].setText("O");
        jogadorAtivo();
    
    }
    
    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        if (jogadorAtivo){
            if(botao2.getText().equals("")) {
                if (eX) {
                    botao2.setText("X");
                }else {
                     botao2.setText("O");
                }
                try {
                    saida.writeBytes("jogada=0,1\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
        
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
       if (jogadorAtivo){
            if(botao1.getText().equals("")) {
                if (eX) {
                    botao1.setText("X");
                }else {
                     botao1.setText("O");
                }
                try {
                    saida.writeBytes("jogada=0,0\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        if (jogadorAtivo){
            if(botao3.getText().equals("")) {
                if (eX) {
                    botao3.setText("X");
                }else {
                     botao3.setText("O");
                }
                try {
                    saida.writeBytes("jogada=0,2\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        if (jogadorAtivo){
            if(botao4.getText().equals("")) {
                if (eX) {
                    botao4.setText("X");
                }else {
                     botao4.setText("O");
                }
                try {
                    saida.writeBytes("jogada=1,0\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        if (jogadorAtivo){
            if(botao5.getText().equals("")) {
                if (eX) {
                    botao5.setText("X");
                }else {
                     botao5.setText("O");
                }
                try {
                    saida.writeBytes("jogada=1,1\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        if (jogadorAtivo){
            if(botao6.getText().equals("")) {
                if (eX) {
                    botao6.setText("X");
                }else {
                     botao6.setText("O");
                }
                try {
                    saida.writeBytes("jogada=1,2\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        if (jogadorAtivo){
            if(botao7.getText().equals("")) {
                if (eX) {
                    botao7.setText("X");
                }else {
                     botao7.setText("O");
                }
                try {
                    saida.writeBytes("jogada=2,0\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
       if (jogadorAtivo){
            if(botao8.getText().equals("")) {
                if (eX) {
                    botao8.setText("X");
                }else {
                     botao8.setText("O");
                }
                try {
                    saida.writeBytes("jogada=2,1\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
       if (jogadorAtivo){
            if(botao9.getText().equals("")) {
                if (eX) {
                    botao9.setText("X");
                }else {
                     botao9.setText("O");
                }
                try {
                    saida.writeBytes("jogada=2,2\n");
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jogadorAtivo();        
        }
    }//GEN-LAST:event_botao9ActionPerformed
    
    private class EscutaServidor implements Runnable{
    	
    	private Socket socket;
    	
    	public EscutaServidor(Socket socket) {
    		this.socket = socket;
		}
    	
		@Override
		public void run() {
			String mensagem;
			BufferedReader in = null;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (true) {
				try {
					mensagem = in.readLine();
					if(mensagem.contains("jogador=")) {
                                                telaEspera.setVisible(false);
						System.out.println(mensagem.substring(8, 9));
						if (mensagem.substring(8, 9).equals("x")) 
						{
							eX = true;
                                                        jogadorAtivo = true;
                                                        jLabel2.setText("Símbolo: X");
                                                        jLabel5.setText("Símbolo: O");
						} else {
                                                        eX = false;
                                                        jogadorAtivo = false;
                                                        jLabel2.setText("Símbolo: O");
                                                        jLabel5.setText("Símbolo: X");
                                                }
					}else if (mensagem.contains("jogada=")) {
						int x = Integer.parseInt(mensagem.substring(7,8));
                                                int y = Integer.parseInt(mensagem.substring(9,10));
                                                if (eX) {
                                                    jogadaO(x, y);
                                                }else {
                                                    jogadaX(x, y);
                                                 }
                                                System.out.println(x+","+y);
					}else if (mensagem.equals("deconectou")) {
						JOptionPane.showMessageDialog(Cliente.this, "O oponente saiu!");
                                                System.exit(0);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
    	
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Cliente().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}