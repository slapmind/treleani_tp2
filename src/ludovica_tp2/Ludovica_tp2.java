package ludovica_tp2;

import javax.swing.*;

class Ludovica_tp2 {

	public static void main(String[] args) {
		int juego, c1, c2, c3, punt= 0, tot;
		String anim;
		
		juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el juego que quiere jugar: \n1- Tarot "
				+ "\n2- Test de Personalidad \n3- Prediccion 2021/2022"));
				
		switch (juego) {
		case 1:	JOptionPane.showMessageDialog(null, "Vamos a ver lo que el tarot nos dice. \nPor favor presione OK para continuar");
				JOptionPane.showMessageDialog(null, "Elija tres numeros y a continuacion \ningrese los numeros elejidos", "Tarot",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/Mazo.jpg")));
				
				c1=Integer.parseInt(JOptionPane.showInputDialog("Elija la primera carta"));
				if (c1==1) {
					punt = punt + 15;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta1.jpg")));
				}else if (c1==2) {
					punt = punt + 8;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta2.jpg")));
				}else if (c1==3) {
					punt = punt + 10;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta3.jpg")));
				}else if (c1==4) {
					punt = punt + 20;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta4.jpg")));
				}else if (c1==5) {
					punt = punt + 25;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta5.jpg")));
				}else if (c1==6) {
					punt = punt + 30;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta6.jpg")));
				}else if (c1==7) {
					punt = punt + 5;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta7.jpg")));
				}
				
				c2=Integer.parseInt(JOptionPane.showInputDialog("Elija la segunda carta"));
				while (c2==c1) {
					c2=Integer.parseInt(JOptionPane.showInputDialog("Elija la segunda carta"));
				}
				if (c2==1 && c2!=c1) {
					punt = punt + 15;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta1.jpg")));
				}else if (c2==2 && c2!=c1) {
					punt = punt + 8;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta2.jpg")));
				}else if (c2==3 && c2!=c1) {
					punt = punt + 10;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta3.jpg")));
				}else if (c2==4 && c2!=c1) {
					punt = punt + 20;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta4.jpg")));
				}else if (c2==5 && c2!=c1) {
					punt = punt + 25;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta5.jpg")));
				}else if (c2==6 && c2!=c1) {
					punt = punt + 30;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta6.jpg")));
				}else if (c2==7 && c2!=c1) {
					punt = punt + 8;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta7.jpg")));
				}
				c3=Integer.parseInt(JOptionPane.showInputDialog("Elija la tercera carta"));
				while (c3==c2 || c3==c1 || c2==c1) {
					c3=Integer.parseInt(JOptionPane.showInputDialog("Elija la tercera carta"));
				}
				if (c3==1) {
					punt = punt + 15;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta1.jpg")));
				}else if (c3==2) {
					punt = punt + 8;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta2.jpg")));
				}else if (c3==3) {	
					punt = punt + 10;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta3.jpg")));
				}else if (c3==4) {
					punt = punt + 20;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta4.jpg")));
				}else if (c3==5) {
					punt = punt + 25;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta5.jpg")));
				}else if (c3==6) {
					punt = punt + 30;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta6.jpg")));
				}else if (c3==7) {
					punt = punt + 8;
					JOptionPane.showMessageDialog(null, "Esta es tu carta", "Tarot", JOptionPane.DEFAULT_OPTION, 
						new ImageIcon(Ludovica_tp2.class.getResource("/img/carta7.jpg")));
				}
				tot = punt;
				if (punt>=65 && punt<=75) {
					JOptionPane.showMessageDialog(null, "El puntaje total es de: " + tot + "\nTienes mucha suerte. El tarot esta de tu lado...!!!!!");	
				} else if(punt>=33 && punt<=64){
					JOptionPane.showMessageDialog(null, "El puntaje total es de: " + tot + "\nTienes una vida normal. Intenta tener un poco mas de aventuras...!!!!! ");
				}else if(punt<=32 && punt>=23){
					JOptionPane.showMessageDialog(null, "El puntaje total es de: " + tot + "\nLe aconsejamos que tenga cuidado. Esta al borde de que le pase algo ...!!!!! ");
				}
				break;
				
		case 2: JOptionPane.showMessageDialog(null, "Vamos a ver que clase de personalidad tenes.");
				JOptionPane.showMessageDialog(null, "Mire atentamente la imagen \ny elija el primer animal que vea", "Test de Personalidad",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/Imagen.jpg")));
				anim=JOptionPane.showInputDialog("Ingrese el animal que vio primero: ");
				
				while (!anim.equalsIgnoreCase("aguila") && !anim.equalsIgnoreCase("mariposa") && !anim.equalsIgnoreCase("perro") && !anim.equalsIgnoreCase("mantis") && !anim.equalsIgnoreCase("cangrejo") 
						&& !anim.equalsIgnoreCase("lobo") && !anim.equalsIgnoreCase("caballo") && !anim.equalsIgnoreCase("gallo") && !anim.equalsIgnoreCase("paloma")){
					JOptionPane.showMessageDialog(null, "Mire atentamente la imagen \ny elija el primer animal que vea", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/Imagen.jpg")));
					anim=JOptionPane.showInputDialog("Ingrese el animal que haya visto primero: ");
				}
				
				if (anim.equalsIgnoreCase("aguila")) {
					JOptionPane.showMessageDialog(null, "Aguila:\nUna criatura regia destinada a volar alto, el águila es afilada pero elegante."
					+ "\nSi viste primero un águila, eres enfocado y preciso en tu acercamiento y no dejas nada al azar."
					+ "\nTe comportas con una noble confianza, ya que no tienes tiempo para el drama y otras cosas"
					+ " \ninsignificantes de la vida. Eres valiente y no tienes miedo de"
					+ " \nvolar solo hacia lo desconocido.", "Test de Personalidad",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/1_Aguila.png")));
				} else if (anim.equalsIgnoreCase("mariposa")) {
					JOptionPane.showMessageDialog(null, "Mariposa:\nUna mariposa representa la dualidad de la vida. La criatura más suave"
					+ "\ny gentil conocida por su belleza, es también la que ha atravesado los momentos más oscuros dentro de un capullo. "
					+ "\nSi esta imagen es lo primero que llamó tu atención, al igual que una mariposa, eres encantador por fuera, "
					+ "\npero tienes un espíritu indomable en tu interior.", "Test de Personalidad",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/2_Mariposa.png")));
				} else if (anim.equalsIgnoreCase("perro")) {
					JOptionPane.showMessageDialog(null, "Perro:", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/3_Perro.png")));
				} else if (anim.equalsIgnoreCase("mantis")) {
					JOptionPane.showMessageDialog(null, "Mantis:", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/4_Mantis.png")));
				} else if (anim.equalsIgnoreCase("cangrejo")) {
					JOptionPane.showMessageDialog(null, "Cangrejo:", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/5_Cangrejo.png")));
				} else if (anim.equalsIgnoreCase("lobo")) {
					JOptionPane.showMessageDialog(null, "Lobo: ", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/6_Lobo.png")));
				} else if (anim.equalsIgnoreCase("caballo")) {
					JOptionPane.showMessageDialog(null, "Caballo: ", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/7_Caballo.png")));
				} else if (anim.equalsIgnoreCase("gallo")) {
					JOptionPane.showMessageDialog(null, "Gallo: ", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/8_Gallo.png")));
				} else if (anim.equalsIgnoreCase("paloma")) {
					JOptionPane.showMessageDialog(null, "Paloma: ", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/9_Paloma.png")));
				} else {}
				break;
		case 3:JOptionPane.showMessageDialog(null, "Todavia no existe el juego 3");
		break;
		}
	}
}


