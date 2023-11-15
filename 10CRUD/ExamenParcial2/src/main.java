/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Telle
 */
import javax.swing.*;
public class main {
     public static void main(String[] args) {
         JFrame ventana = new JFrame ("hola mundo");
         ventana.setSize(370, 170);
         ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JPanel panel = new JPanel();
        ventana.add(panel);
        agregarComponentes(panel);
          ventana.setVisible(true);
          
          private static void agregarComponentes(JPanel panel){
        // lo primero que tenemos que hacer es inicializare el panel
       panel.setLayout(null);
        //vamos agregar componentes al panel
        //quiero una etiqueta
        JLabel userlabel = new JLabel("Nombre del usuario");
        // ya que tenemo la etiqueta debemos definir sus propiedades 
        // el tamaño, la orientacion , el tipo de letra ,largo, ancho etc.
        userlabel.setBounds(10, 10, 120, 50);
        // lo agregamos al panel
        panel.add(userlabel);
        
        //campo de texto
        JTextField usertxt = new JTextField(20);
        //defino su propiedad
        usertxt.setBounds(160,20,160,25);
        // lo agrego
        panel.add(usertxt);
        
        // etiqueta de password
        JLabel userpass = new JLabel("password");
        userpass.setBounds(10, 40, 80, 50);
        panel.add(userpass);
        
        // agregamos campo de password
        JTextField passtxt = new JTextField(20);
        passtxt.setBounds(160,50,160,25);
        panel.add(passtxt);
        
        
        //agregamos los botones 
        JButton loginbutton = new JButton(" iniciar secion");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);
        
        JButton registrobutton = new JButton("registrate");
        registrobutton.setBounds(180, 80, 120, 25);
        panel.add(registrobutton);
        
     }
}
