import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame
{
    private JPanel         panelPrincipal;
    private JTextField     usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton        enviarBoton;

    public LoginForm()
    {
        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void inicializarForma()
    {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centramos la ventana
    }

    private void validar()
    {
        // Leer los valores
        String usuario  = usuarioTexto.getText();
        String password = new String(passwordTexto.getPassword());

        // Validar
        if ("admin".equals(usuario) && "admin".equals(password))
            mostrarMensaje("Datos correctos, Bienvenido!");
        else if ("root".equals(usuario))
            mostrarMensaje("Password incorrecto, corregirlo!");
        else
            mostrarMensaje("Usuario incorrecto, corregirlo!");
    }

    private void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args)
    {
        FlatDarculaLaf.setup(); // Cambiar el look and feel a modo oscuro
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }

}
