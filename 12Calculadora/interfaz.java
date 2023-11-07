
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class interfaz  extends JFrame implements ActionListener{
   
    //VAMOS ARMAR LA CALCULADORA 
    // DEFINIR LOS CAMPOS

    JTextField txtnum1;
    JTextField txtnum2;
    //definir mis botones 

    JButton btnsuma;
    JButton btnresta;
    JButton btnproducto;
    JButton btndivsion;
    JButton btnseno;
    JButton btncoseno;
    JButton btntangente;
    JButton btnpotencias;
    JButton btnraices ;
    JButton btnborrarresultado;

    //etuquetas 

    JLabel numero1;
    JLabel numero2;
    JLabel resultado;
    JLabel mostarresultado;

    // creo mi panel donde voy a incorporar mis componentes 
    JPanel panel = (JPanel)this.getContentPane();
    // es el contenedor de mi interfaz 
    private Object btnraiz;

    //constructor 
    public interfaz(){
        //inicializo los elementos del frame o ventana 
        setLayout(null);
        //localizacion
        setLocation(100,80);
        // propiedades como sin redimensionar 
        setResizable(false);
        //ancho y largo 
        setSize(600, 600);
        //opciones de salir 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creo el metodo para la carga de los componentes
        componentes();


    }
    /**
     * 
     */
    private void componentes (){
        // empiezo con sus definiciones 
        panel.setLayout(null);

        // con la carga de la etiqueta 
        numero1 = new JLabel("numero 1");
        numero1.setBounds(10,10,70,30);
        panel.add(numero1);

        numero2 = new JLabel("numero 2");
        numero2.setBounds(10,70,70,30);
        panel.add(numero2);
        

        resultado = new JLabel("resultado");
        resultado.setBounds(10,140,70,30);
        panel.add(resultado);

        mostarresultado = new JLabel("");
        mostarresultado.setBounds(100, 140,70, 30);
        panel.add(mostarresultado);

        //agrego los campos 
        txtnum1 = new JTextField();
        txtnum1.setBounds(100, 70, 70, 30);
            panel.add(txtnum1);


txtnum2 = new JTextField();
        txtnum2.setBounds(100, 70, 70, 30);
            panel.add(txtnum2);

            //agrego los botones
            btnsuma= new JButton("+");
            btnsuma.setBounds(10, 200, 50,50);
        panel.add(btnsuma);
        // agregamos el listener
        btnsuma.addActionListener(new ActionListener(this));
        

        //agrego los botones
            btnresta= new JButton("-");
            btnresta.setBounds(100, 200, 50,50);
        panel.add(btnresta);
        // agregamos el listener
        btnproducto.addActionListener(new ActionListener(this));


        //agrego los botones
            btnproducto= new JButton("*");
            btnproducto.setBounds(10, 270, 50,50);
        panel.add(btnproducto);
        // agregamos el listener
        btnproducto.addActionListener(new ActionListener(this));


        //agrego los botones
            btndivsion= new JButton("/");
            btndivsion.setBounds(100, 270, 50,50);
        panel.add(btndivsion);
        // agregamos el listener
        btndivsion.addActionListener(new ActionListener(this));
        //botones
        btnseno = new JButton("sin");
        btnseno.setBounds(100, 270, 50, 50);
        panel.add(btnseno);
        btnseno.addActionListener(new ActionListener(this) );

         btncoseno = new JButton("cos");
        btnseno.setBounds(100, 270, 50, 50);
        panel.add(btncoseno);
        btncoseno.addActionListener(new ActionListener(this) );

         btntangente = new JButton("tan");
        btntangente.setBounds(100, 270, 50, 50);
        panel.add(btncoseno);
        btntangente.addActionListener(new ActionListener(this) );

         btnpotencias = new JButton("potencia");
        btnpotencias.setBounds(100, 270, 50, 50);
        panel.add(btnpotencias);
        btnpotencias.addActionListener(new ActionListener(this) );

         btnraices = new JButton("raiz");
        btnpotencias.setBounds(100, 270, 50, 50);
        panel.add(btnraices);
        btnraices.addActionListener(new ActionListener(this) );

         btnborrarresultado = new JButton("borrar");
        btnborrarresultado.setBounds(100, 270, 50, 50);
        panel.add(btnborrarresultado);
        btnborrarresultado.addActionListener(new ActionListener(this) );





    }
    @Override
    public void actionPerformed(ActionEvent e){
        //tenemos que aprender a diferenciar cada operacion del boton
        //una instancia de operaciones 
        operaciones op = new operaciones();
        if(event.getSource() == btnsuma){
             double num1 = Double.parseDouble(txtnum1.getText());
             op.setNum1(num1);
              double num2 = Double.parseDouble(txtnum2.getText());
             op.setNum2(num2);
             //mostrar resultado 
             mostarresultado.setText(String.valueOf(op.suma()));

        }
        if(event.getSource() == btnresta){
             double num1 = Double.parseDouble(txtnum1.getText());
             op.setNum1(num1);
              double num2 = Double.parseDouble(txtnum2.getText());
             op.setNum2(num2);
             //mostrar resultado 
             mostarresultado.setText(String.valueOf(op.resta()));

        }
        if(event.getSource() == btnproducto){
             double num1 = Double.parseDouble(txtnum1.getText());
             op.setNum1(num1);
              double num2 = Double.parseDouble(txtnum2.getText());
             op.setNum2(num2);
             //mostrar resultado 
             mostarresultado.setText(String.valueOf(op.producto()));

        }
        if(event.getSource() == btndivsion){
             double num1 = Double.parseDouble(txtnum1.getText());
             op.setNum1(num1);
              double num2 = Double.parseDouble(txtnum2.getText());
             op.setNum2(num2);
             //mostrar resultado 
             mostarresultado.setText(String.valueOf(op.division()));

        }
        if (event.getSource() == btnseno){
            double num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);

            //resultado
            mostarresultado.setText(String.valueOf(op.seno()));
        }

        if (event.getSource() == btncoseno ){
            double num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);

            //resultado
            mostarresultado.setText(String.valueOf(op.coseno()));
        }
        if (event.getSource() == btntangente ){
            double num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);

            //resultado
            mostarresultado.setText(String.valueOf(op.tangente()));
        }
        if (event.getSource() == btnpotencias){
            double num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);

            //resultado
            mostarresultado.setText(String.valueOf(op.potencia()));
        }
        if (event.getSource() == btnraiz){
            double num1 = Double.parseDouble(txtnum1.getText());
            op.setNum1(num1);
            double num2 = Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);

            //resultado
            mostarresultado.setText(String.valueOf(op.raiz()));
        }
        }
    }

