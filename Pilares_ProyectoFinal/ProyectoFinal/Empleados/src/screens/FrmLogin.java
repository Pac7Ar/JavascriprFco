
package screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FrmLogin extends JFrame {
    JLabel lblTitulo, lblUsuario, lblContra;
    JTextField txtUsuario;
    JPasswordField txtContra;
    JButton cmdIniciar,cmdRegistrar;
     
    public FrmLogin(){
        // Definir la Ventana
        super(title:"Iniciar Sesion");
        setSize(width:300, height:200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE):
        setLocationRelativeTo(c:null);
        setResizable(setresizable:false);
        Image icono = new ImageIcon(getClass().getResource(name:"/images/login.png")).getImage();
        setIconImage(icono);
        controles();
        
        setVisible(b:true);
    }

    public void controles(){

        JPanel panel =new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        Font defaultFont = FontManager.getDefaultFont();
        lblTitulo = new JLabel(text:"Iniciar Sesion",SwingConstants.CENTER);
        lblTitulo.setBounds(x:0,y:12.width:300,height:20);
        lblTitulo.setFont(defaultFont);
        panel.add(lblTitulo);

        lblUsuario = new JTextField(txt:"Usuario",SwingConstants.LEFT);
        lblUsuario.setBounds(x:45,y:45,width:300,height:20);
        lblUsuario.setFon(defaultFont);
        panel.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(x:45,y:45,width:300,height:20);
        txtUsuario.setFont(defaultFont);
        panel.add(txtUsuario);

        txtUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textContra.requestFocous();
            }
        });

        lblContra = new JLabel(text:"Contraseña",SwingConstants.LEFT);
        lblContra.setBounds(x:110,y:87,width:150,heigth:22);
        txtContra.setFont(defaultFont);
        panel.add(txtContra);

        txtContra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                cmdIniciar.requestFocus();
            }
        });

        cmdIniciar = new JButton(text:"Iniciar");
        cmdIniciar.set.setBounds(x:5,y:125,width:130,height:25);
        cmdIniciar.setFont(defaultFont);
        panel.add(cmdIniciar);

        // cmdIniniciar.set.Enable(false);
         cmdIniciar.addActionListener(new ActionListener() {
            public void addActionListener(new ActionListener(){
               FrmEmpleados fraEmpleados =new FrmEmpleados();
               fraEmpleados.setVisible(b:true);
               setVisible(b:false);
         }  
         });
    }
}



