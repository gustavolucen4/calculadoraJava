/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.visao;

import com.br.calculadora.controller.CalculadoraController;
import com.br.calculadora.conversor.Conversor;

/**
 *
 * @author gusta
 */
public class VisaoCalc extends javax.swing.JFrame {

    /**
     * Creates new form VisaoCalc
     */
    public VisaoCalc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInput = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnOFF = new javax.swing.JButton();
        btnElevadoQuadrado = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        bntMaisMenos = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        bntVirgula = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Manual");

        txtInput.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtInput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtInput.setText("0");

        jPanel2.setLayout(new java.awt.GridLayout(5, 4, 1, 1));

        btnOFF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOFF.setText("OFF");
        btnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOFFActionPerformed(evt);
            }
        });
        jPanel2.add(btnOFF);

        btnElevadoQuadrado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnElevadoQuadrado.setText("x\"");
        btnElevadoQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevadoQuadradoActionPerformed(evt);
            }
        });
        jPanel2.add(btnElevadoQuadrado);

        btnAC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAC.setText("AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        jPanel2.add(btnAC);

        btnDividir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        jPanel2.add(btnDividir);

        btn7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);

        btn8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);

        btn9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);

        btnMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicar);

        btn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);

        btn5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        btn6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);

        btnMenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenos);

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);

        btnMais.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMais.setText("+");
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });
        jPanel2.add(btnMais);

        bntMaisMenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bntMaisMenos.setText("+/-");
        bntMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMaisMenosActionPerformed(evt);
            }
        });
        jPanel2.add(bntMaisMenos);

        btn0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0);

        bntVirgula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bntVirgula.setText(",");
        bntVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVirgulaActionPerformed(evt);
            }
        });
        jPanel2.add(bntVirgula);

        btnResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnResultado);

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResultado.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(txtInput)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVirgulaActionPerformed
        digita(".");
    }//GEN-LAST:event_bntVirgulaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        digita("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        digita("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        digita("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        digita("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        digita("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        digita("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        digita("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        digita("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        digita("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        digita("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        
        if(ultimaOperacao == "="){

        }
        verifica("+");
        ultimaOperacao = "+";
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        verifica("-");
        ultimaOperacao = "-";
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        verifica("*");
        ultimaOperacao = "*";
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        verifica("/");
        ultimaOperacao = "/";
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        limparTxt();
        limparlbl();
    }//GEN-LAST:event_btnACActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        resultado();
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOFFActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnOFFActionPerformed

    private void bntMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMaisMenosActionPerformed
        trocaSinal();
    }//GEN-LAST:event_bntMaisMenosActionPerformed

    private void btnElevadoQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevadoQuadradoActionPerformed
        elevadoQuadrado();
    }//GEN-LAST:event_btnElevadoQuadradoActionPerformed
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntMaisMenos;
    private javax.swing.JButton bntVirgula;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnElevadoQuadrado;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnOFF;
    private javax.swing.JButton btnResultado;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

    CalculadoraController calculadora = new CalculadoraController();
    Conversor conversor = new Conversor();
    private String ultimaOperacao;

    private void digita(String input){
        if(txtInput.getText().equals("0") || txtInput.equals("0.0")){
            txtInput.setText(input);
        }else{
            if(input.equals(".") && txtInput.getText().contains(".")){

            }else {
                txtInput.setText(txtInput.getText().concat(input));
            }
        }
    }

    private void digitaCalculo(){
        lblResultado.setText(txtInput.getText());
        txtInput.setText("0");
    }

    private void limparTxt(){
        txtInput.setText("0");
    }

    private void limparlbl(){
        lblResultado.setText("0");
    }

    private void verifica(String operador){
        if(lblResultado.getText().contains("=")){
            limparlbl();
        }

        if(lblResultado.getText().contains("+") || lblResultado.getText().contains("-") || lblResultado.getText().contains("*") || lblResultado.getText().contains("/")){
            resultado();
        }else{
            digita(operador);
            digitaCalculo();
        }
    }

    private void resultado(){
                
        if(txtInput.getText().equals("0")){
            txtInput.setText("Não é possivel dividir por 0");
            return;
        }

        calculadora.calcular(lblResultado.getText(),txtInput.getText() , ultimaOperacao);

        String equacao;
        equacao = lblResultado.getText().concat(txtInput.getText().concat("=").concat(conversor.doubleToString(calculadora.getResultado())));

        lblResultado.setText(equacao);
        txtInput.setText(conversor.doubleToString(calculadora.getResultado()));
    }

    private void  trocaSinal(){
        
        double numero;
        numero = conversor.stringToDouble(txtInput.getText());
        numero = numero * (-1);
        
        txtInput.setText(conversor.doubleToString(numero));
    }

    private void elevadoQuadrado(){

        double numero;
        numero = conversor.stringToDouble(txtInput.getText());
        double resultado = Math.pow(numero, 2);
        
        txtInput.setText(conversor.doubleToString(numero));
        lblResultado.setText(numero + "^2 = " + resultado);
        }
}
