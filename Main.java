import javax.swing.*;

public class Main {
    public static void main(String[] args) {

            PerfilMedico perfil = new PerfilMedico("","","",0,0,0,0.0,0.0);

                String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre:");
                String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
                String sexo = JOptionPane.showInputDialog("Ingrese su sexo (M/F):");
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento:"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento:"));
                int anio = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("altura:"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));


                perfil.setPrimerNombre(nombre);
                perfil.setApellido(apellido);
                perfil.setSexo(sexo);
                perfil.setDiaNacimiento(dia);
                perfil.setMesNacimiento(mes);
                perfil.setAnioNacimiento(anio);
                perfil.setAltura(altura);
                perfil.setPeso(peso);

                JOptionPane.showMessageDialog(null, perfil.detallesPaciente(), "Perfil Médico", JOptionPane.INFORMATION_MESSAGE);



    }
}
