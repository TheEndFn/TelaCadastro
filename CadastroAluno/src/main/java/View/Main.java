package View;

import javax.swing.*;
import javax.swing.SwingUtilities;

public class Main {
    
    public static void main(String[] args) {
        
       SwingUtilities.invokeLater(()-> new CadastroAluno().setVisible(true));
        
    }
    
}
