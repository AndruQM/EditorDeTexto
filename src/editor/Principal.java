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
		private JMenuBar menu;
		private JMenu archivo, editar, seleccionar, ver, apariencia;
		private JMenuItem elementItem;
		public Panel() {
			//-------------------MENU---------------------------
			JPanel panelMenu =new JPanel();
			menu=new JMenuBar();
			archivo= new JMenu("Archivo");
			editar= new JMenu("Editar");
			seleccionar= new JMenu("Seleccion");
			ver= new JMenu("ver");
			apariencia= new JMenu("Aparencia");

			menu.add(archivo);
			menu.add(editar);
			menu.add(seleccionar);
			menu.add(ver);
			
			//items Archivos
			crearItem("Nuevo Archivo", "archivo", "nuevo");
			crearItem("Abrir Archivo", "archivo", "abrir");
			crearItem("Guardar", "archivo", "guardar");
			crearItem("Guardar Como", "archivo", "guardar como");

			//items Editar
			crearItem("Deshacer", "editar", "");
			crearItem("Rehacer", "editar", "");
			crearItem("Deshacer", "editar", "");
			crearItem("Cortar", "editar", "");
			crearItem("Copiar", "editar", "");
			crearItem("Pegar", "editar", "");

			//items Seleccionar
			crearItem("Seleccionar Todo", "seleccionar", "");

			//items Ver
			crearItem("Numeracion", "ver", "");
			ver.add(apariencia);
			crearItem("Modo Blanco", "apariencia", "");
			crearItem("Modo Oscuro", "apariencia", "");
			panelMenu.add(menu);

			//--------------------------------------------------
			/*
			JLabel etiqueta= new JLabel("editor de texto personalizado echo por mi");
			add(etiqueta);*/
			//---------------area de texto------------------
			tPane=new JTabbedPane();
			//----------------------------------------------
			crearPlanel();
			add(panelMenu);
			add(tPane);
			

		}
		public void crearPlanel(){
			ventana = new JTabbedPane();
			areaDeTexto = new JTextArea();
			ventana.add(areaDeTexto);
			tPane.addTab("title", ventana);
		}
		public void crearItem(String rotulo, String menu, String accion){
			elementItem=new JMenuItem(rotulo);
			if (menu.equals("archivo")) {
				archivo.add(elementItem);
			} else if (menu.equals("editar")) {
				editar.add(elementItem);
			}else if (menu.equals("seleccionar")) {
				seleccionar.add(elementItem);
			} else if (menu.equals("ver")) {
				ver.add(elementItem);
			}else if (menu.equals("apariencia")) {
				apariencia.add(elementItem);
			}
				
			

		}

		
		
	}
