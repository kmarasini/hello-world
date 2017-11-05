 
 
import java.awt.*;
import java.util.*;


public class DemoJFileChooser extends JPanel
   implements ActionListener {
   JButton go;
   
   JFileChooser chooser;
   String choosertitle;
   
  public DemoJFileChooser() {
    go = new JButton("Do it");
    go.addActionListener(this);
    add(go);
   }

  public void actionPerformed(ActionEvent e) {
    int result;
        
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      System.out.println("getCurrentDirectory(): " 
         +  chooser.getCurrentDirectory());
      System.out.println("getSelectedFile() : " 
         +  chooser.getSelectedFile());
      }
    else {
      System.out.println("No Selection ");
      }
     }
   
  public Dimension getPreferredSize(){
    return new Dimension(200, 200);
    }
    
  public static void main(String s[]) {
    JFrame frame = new JFrame("");
    DemoJFileChooser panel = new DemoJFileChooser();
    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
          }
        }
      );
    frame.getContentPane().add(panel,"Center");
    frame.setSize(panel.getPreferredSize());
    frame.setVisible(true);
    }
}

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

{
                    JFileChooser chooser = new JFileChooser();
                    chooser.setCurrentDirectory( new File( "./") );
                    int actionDialog = chooser.showSaveDialog(this);
                    if ( actionDialog == JFileChooser.APPROVE_OPTION )
                    {
                    File fileName = new File( chooser.getSelectedFile( ) + ".log" );
                    if(fileName != null)
                    {
                    if(fileName.exists())
                    {
                    actionDialog = JOptionPane.showConfirmDialog(this, "Replace existing file?");
 
                    while (actionDialog == JOptionPane.NO_OPTION)
                    {
                    actionDialog=chooser.showSaveDialog(this);
                    if (actionDialog == JFileChooser.APPROVE_OPTION)
                     {
                            fileName = new File( chooser.getSelectedFile( ) + ".log" );
                             if(fileName.exists())
                             {
                                 actionDialog = JOptionPane.showConfirmDialog(this, "Replace existing file?");
                                                                        
                               }
                      }
 
                    }
                    if(actionDialog == JOptionPane.YES_OPTION)
                    {
                    BufferedWriter outFile = new BufferedWriter( new FileWriter( fileName ) );
                    outFile.write( "hhhhh" ); //put in textfile
                    outFile.flush( ); // redundant, done by close()
                    outFile.close( );
                    }
                    return;
                    //AttestDialog.getInstance( ).showErrorDialog(languageBundle.getString("LogFil eAlreadyExists"));
                    }
 
                    BufferedWriter outFile = new BufferedWriter( new FileWriter( fileName ) );
                    outFile.write( "hhhh" ); //put in textfile
                    outFile.flush( ); // redundant, done by close()
                    outFile.close( );
					//http://stackoverflow.com/questions/23006139/java-gui-program-with-aes-encryption
					//http://stackoverflow.com/questions/356671/jfilechooser-showsavedialog-how-to-set-suggested-file-name
 
                    }
                    }
					
					
					
					
					