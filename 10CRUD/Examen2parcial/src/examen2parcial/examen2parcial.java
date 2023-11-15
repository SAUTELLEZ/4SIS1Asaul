/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2parcial;

/**
 *
 * @author Telle
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.PdfWriter;



public class examen2parcial {

    
  private ArrayList<Registro> registros;
    private DefaultTableModel tableModel;
    private JTable table;

    public examen2parcial() {
        registros = new ArrayList<>();

        // Configuración de la interfaz gráfica
        setTitle("Registro de Bellacos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear tabla
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido Paterno");
        tableModel.addColumn("Apellido Materno");
        tableModel.addColumn("Edad");
        tableModel.addColumn("Fecha Entrada");
        tableModel.addColumn("Hora Entrada");
        tableModel.addColumn("Hora Salida");

        table = new JTable(tableModel);

        // Botón Guardar
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarRegistro();
            }
        });

        // Botón Visualizar
        JButton btnVisualizar = new JButton("Visualizar");
        btnVisualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visualizarRegistros();
            }
        });

        // Botón Imprimir en PDF
        JButton btnImprimirPDF = new JButton("Imprimir PDF");
        btnImprimirPDF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imprimirPDF();
            }
        });

        // Agregar componentes a la interfaz
        add(new JScrollPane(table));
        add(btnGuardar);
        add(btnVisualizar);
        add(btnImprimirPDF);

        setLayout(null);

        // Posición y tamaño de los componentes
        table.setBounds(25, 30, 600, 250);
        btnGuardar.setBounds(25, 350, 150, 30);
        btnVisualizar.setBounds(200, 350, 150, 30);
        btnImprimirPDF.setBounds(350, 300, 150, 30);
    }

    private void agregarRegistro() {
        // Obtener datos del formulario y agregarlos a la lista de registros
        String nombre = "Joel"; 
        String apellidoPaterno = "Tellez";
        String apellidoMaterno = "Barbosa"; 
        int edad = 25; 
        // Obtener la fecha y hora actual
        Date fechaEntrada = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        String fechaEntradaStr = dateFormat.format(fechaEntrada);
        String horaEntradaStr = hourFormat.format(fechaEntrada);

        // Crear un nuevo registro
        Registro nuevoRegistro = new Registro(nombre, apellidoPaterno, apellidoMaterno, edad, fechaEntradaStr,
                horaEntradaStr);

        // Agregar el registro a la lista
        registros.add(nuevoRegistro);

        // Actualizar la tabla
        actualizarTabla();
    }

    private void visualizarRegistros() {
        // Mostrar los registros en la consola
        for (Registro registro : registros) {
            System.out.println(registro);
        }
    }

    private void imprimirPDF() {
        String d=jtxtdir.getText();
        String tex=jtxcont.getText();
        try{
      FileOutputStream archivo = new FileOutputStream(d +".pdf");
      Document doc = new Document();
      PdfWriter.getInside(doc,archivo);
      doc.open();
      doc.add(new paragraph(text));
      doc.close();
      JOptionPane.showMessageDialog(null,"el docuemento se a creado con exito");
      
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    private void actualizarTabla() {
        // Limpiar la tabla
        tableModel.setRowCount(0);

        // Agregar los registros a la tabla
        for (Registro registro : registros) {
            Object[] rowData = {registro.getNombre(), registro.getApellidoPaterno(), registro.getApellidoMaterno(),
                    registro.getEdad(), registro.getFechaEntrada(), registro.getHoraEntrada(),
                    registro.getHoraSalida()};
            tableModel.addRow(rowData);
        }
    }

    public static void main(String[] args) {
        examen2parcial  Examen2parcial= new examen2parcial();
        Examen2parcial.setVisible(true);
    }

    private void setTitle(String registro_de_Bellacos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JScrollPane jScrollPane) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JButton btnGuardar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class Registro {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String fechaEntrada;
    private String horaEntrada;
    private String horaSalida;

    public Registro(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String fechaEntrada,
            String horaEntrada) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.horaSalida = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + ", Edad: " + edad + ", Fecha Entrada: "
                + fechaEntrada + ", Hora Entrada: " + horaEntrada + ", Hora Salida: " + horaSalida;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
