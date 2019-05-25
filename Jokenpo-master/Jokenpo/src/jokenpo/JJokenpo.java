/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

import javax.swing.JOptionPane;

/**
 *
 * @author luisf
 */
public class JJokenpo extends javax.swing.JFrame {

	// Declaração das variáveis
	
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<Itens> cItensJogadorA;
    private javax.swing.JComboBox<Itens> cItensJogadorB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    StringBuilder sb = new StringBuilder();
    // Fim das variáveis de classe
    
    // Contstrutor da classe iniciando os componentes da interface
    public JJokenpo() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")

    // Inicializador dos componentes da interface
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        cItensJogadorA = new javax.swing.JComboBox<>();
        cItensJogadorB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jokenpo - Objetivo");
        setResizable(false);

        jLabel1.setText("Jogador A");

        jLabel2.setText("Jogador B");

        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        cItensJogadorA.setModel(new javax.swing.DefaultComboBoxModel<>(Itens.values()));

        cItensJogadorB.setModel(new javax.swing.DefaultComboBoxModel<>(Itens.values()));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Juiz Jokenpo - Objetivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnJogar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cItensJogadorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cItensJogadorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cItensJogadorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cItensJogadorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJogar)
                    .addComponent(btnSair))
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
        
    }//Fim da Interface

    
    /**
     * Botões de Ação
     * @param evt
     */
    // Botão Sair
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
    	
        System.exit(0);
    }

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
           	
    	juiz(this.cItensJogadorA.getSelectedIndex(), this.cItensJogadorB.getSelectedIndex());
    
    }
 
    
    public void juiz(int jogadorA, int jogadorB) {
    	    		
    		switch (jogadorA) {
    		
    		case 1: 
    			
    			switch (jogadorB) {
    			
    			case 1: JOptionPane.showMessageDialog(null, "Jogador A e Jogador B escolheram Pedra. Empate!"); 
    				break;
    			case 2: JOptionPane.showMessageDialog(null, "Jogador A escolheu Pedra e Jogador B escolherou Papel. Jogador B Venceu!");
    				break;
    			case 3: JOptionPane.showMessageDialog(null, "Jogador A escolheu Pedra e Jogador B escolherou Tesoura. Jogador A Venceu!");
    				break;
    				
    			default: JOptionPane.showMessageDialog(null, "Jogador B selecione Pedra, Papel ou Tesoura!");

    			} break;
    			
    		case 2: 
    			
    			switch (jogadorB) {
    			
    			case 1: JOptionPane.showMessageDialog(null, "Jogador A escolheu Papel e Jogador B escolherou Pedra. Jogador A Venceu!"); 
    				break;
    			case 2: JOptionPane.showMessageDialog(null, "Jogador A e Jogador B escolheram Papel. Empate!");
    				break;
    			case 3: JOptionPane.showMessageDialog(null, "Jogador A escolheu Papel e Jogador B escolherou Tesoura. Jogador B Venceu!");
    				break;
    				
    			default: JOptionPane.showMessageDialog(null, "Jogador B selecione Pedra, Papel ou Tesoura!");

    			} break;
    		
    		case 3: 
    			
    			switch (jogadorB) {
    			
    			case 1: JOptionPane.showMessageDialog(null, "Jogador A escolheu Tesoura e Jogador B escolherou Pedra. Jogador B Venceu!"); 
    				break;
    			case 2: JOptionPane.showMessageDialog(null, "Jogador A escolheu Tesoura e Jogador B escolheu Papel. Jogador A Venceu!");
    				break;
    			case 3: JOptionPane.showMessageDialog(null, "Jogador A e Jogador B escolheram Tesoura. Empate!");
    				break;
    				
    			default: JOptionPane.showMessageDialog(null, "Jogador B selecione Pedra, Papel ou Tesoura!");

    			} break;
    		
			default: JOptionPane.showMessageDialog(null, "Jogador A selecione Pedra, Papel ou Tesoura!");	
    		
    		} 
    	  	
    	}
    
     
    
}
