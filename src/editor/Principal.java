package editor;

import javax.swing.*;

public class Principal {
	public static void main(String []args) {
		DimencionesEditor marco=new DimencionesEditor();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
     
	}
}
	class DimencionesEditor extends JFrame{
		public DimencionesEditor() {
			setBounds(500,100,500,500);
			setTitle("Editor Personalizado AndruQM");
			add(new Panel());
		}
		
	}
	class Panel extends JPanel{
		private JTabbedPane tPane ;
		private JTabbedPane ventana ;
		private JTextArea areaDeTexto;
		public Panel() {
			/*
			JLabel etiqueta= new JLabel("editor de texto personalizado echo por mi");
			add(etiqueta);*/
			//---------------area de texto------------------
			tPane=new JTabbedPane();
			//----------------------------------------------
			crearPlanel();
			add(tPane);
			

		}
		public void crearPlanel(){
			ventana = new JTabbedPane();
			areaDeTexto = new JTextArea();
			ventana.add(areaDeTexto);
			tPane.addTab("title", ventana);
		}

		
		
	}
