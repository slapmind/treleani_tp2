package ludovica_tp2;

import javax.swing.*;

class Ludovica_tp2 {

	public static void main(String[] args) {
		int juego, c1, c2, c3, punt= 0, tot, carta;
		String anim;
		
		do {
		juego = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el juego que quiere jugar: \n1- Tarot "
					+ "\n2- Test de Personalidad \n3- Prediccion 2021/2022"));
		} while (juego>3);
						
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
					c2=Integer.parseInt(JOptionPane.showInputDialog("Ese numero ya fue elejido, elije otra carta"));
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
					c3=Integer.parseInt(JOptionPane.showInputDialog("Esos numeros ya fueron elejidos, elije otra carta"));
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
					punt = punt + 8;
					JOptionPane.showMessageDialog(null, "Aguila:"
														+ "\nUna criatura regia destinada a volar alto, el �guila es afilada pero elegante."
														+ "\nSi viste primero un �guila, eres enfocado y preciso en tu acercamiento y no dejas nada al azar."
														+ "\nTe comportas con una noble confianza, ya que no tienes tiempo para el drama y otras cosas"
														+ " \ninsignificantes de la vida. Eres valiente y no tienes miedo de"
														+ " \nvolar solo hacia lo desconocido.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/1_Aguila.png")));
				} else if (anim.equalsIgnoreCase("mariposa")) {
					punt = punt + 6;
					JOptionPane.showMessageDialog(null, "Mariposa:"
														+ "\nUna mariposa representa la dualidad de la vida. La criatura m�s suave"
														+ "\ny gentil conocida por su belleza, es tambi�n la que ha atravesado los"
														+ "\nmomentos m�s oscuros dentro de un capullo. Si esta imagen es lo primero"
														+ "\nque llam� tu atenci�n, al igual que una mariposa, eres encantador por fuera,"
														+ "\npero tienes un esp�ritu indomable en tu interior.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/2_Mariposa.png")));
				} else if (anim.equalsIgnoreCase("perro")) {
					punt = punt + 9;
					JOptionPane.showMessageDialog(null, "Perro:"
														+ "\nLos perros son el mejor amigo de la humanidad por una raz�n."
														+ "\nLos perros ferozmente leales, cari�osos y absolutamente dignos"
														+ "\nde abrazos infunden alegr�a en los momentos m�s aburridos. Si lo"
														+ "\nque notaste primero fue un perro, significa que eres un alma sabia"
														+ "\n y que sabes lo que realmente importa en la vida. Te comprometes de"
														+ "\ntodo coraz�n con las personas y las causas, y nada puede quebrantar"
														+ "\ntu voluntad una vez que tomas una decisi�n.Sin embargo, tambi�n sabes"
														+ "\nc�mo relajarte y divertirte.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/3_Perro.png")));
				} else if (anim.equalsIgnoreCase("mantis")) {
					punt = punt + 6;
					JOptionPane.showMessageDialog(null, "Mantis:"
														+ "\nLa mantis es conocida por sus excepcionales habilidades como cazadora."
														+ "\nSus fortalezas son la precisi�n y la paciencia. Debido a que puede permanecer"
														+ "\nquieta durante horas y atacar en el momento exacto, no participa en acciones"
														+ "\nfr�volas. Si la peque�a criatura verde atrajo tu atenci�n primero, significa"
														+ "\nque tienes la determinaci�n y la voluntad feroz de la mantis. Las personas"
														+ "\npueden subestimar estos rasgos en funci�n de tu perfil bajo, pero cuando llega"
														+ "\nel momento siempre resultas ganador.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/4_Mantis.png")));
				} else if (anim.equalsIgnoreCase("cangrejo")) {
					punt = punt + 7;
					JOptionPane.showMessageDialog(null, "Cangrejo:"
														+ "\nLos cangrejos son criaturas fascinantes, con una personalidad compleja."
														+ "\nCon patrones y colores ex�ticos que cubren su c�scara dura, pueden camuflarse."
														+ "\nPero eso es porque la vida no es f�cil para ellos. Si esta es la primera"
														+ "\ncriatura que notaste, es probable que seas astuto y sabio como un cangrejo."
														+ "\nTienes una apariencia dura porque la vida te ha ense�ado muchas lecciones"
														+ "\ndif�ciles, pero dentro de ti hay un alma suave que siempre cuida"
														+ "\nde sus seres queridos.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/5_Cangrejo.png")));
				} else if (anim.equalsIgnoreCase("lobo")) {
					punt = punt + 7;
					JOptionPane.showMessageDialog(null, "Lobo:"
														+ "\nUn lobo es considerado un gu�a espiritual debido a la sabidur�a que lleva"
														+ "\ndentro. Misterioso, audaz e intuitivo, un lobo puede proteger a otros en el"
														+ "\ngrupo y aventurarse solo en el bosque oscuro. Si este es el primer animal"
														+ "\nque viste, a menudo caminas al borde de la vida. Buscas aventura y misterio."
														+ "\nTe niegas a seguir las normas y reglas sociales. Pero cuando se trata de proteger"
														+ "\na un ser querido, nadie puede ser tan feroz y apasionado como t�.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/6_Lobo.png")));
				} else if (anim.equalsIgnoreCase("caballo")) {
					punt = punt + 8;
					JOptionPane.showMessageDialog(null, "Caballo:"
														+ "\nNacido para ser libre y salvaje, un caballo valora la libertad por encima"
														+ "\nde todo lo dem�s. Siendo las criaturas dignas que son, los caballos dejan que"
														+ "\nsu coraz�n los dirija sin mucho alboroto. Si este animal majestuoso es el"
														+ "\nprimero que notaste, tienes un esp�ritu salvaje que te hace dif�cil de ser dominado."
														+ "\nNo obstante, al igual que un caballo, est�s m�s que dispuesto a ayudar y brindar"
														+ "\napoyo a las dem�s personas. Disfrutas del buen humor en compa��a de tus amigos"
														+ "\ncercanos. Si tienes que elegir entre la libertad y el amor, tu coraz�n"
														+ "\npone a tus seres queridos primero, antes que a ti.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/7_Caballo.png")));
				} else if (anim.equalsIgnoreCase("gallo")) {
					punt = punt + 10;
					JOptionPane.showMessageDialog(null, "Gallo:"
														+ "\nUn gallo es colorido, peculiar y r�pido. Utiliza su mente aguda para navegar"
														+ "\npor terrenos dif�ciles en la tierra, y cuando la situaci�n se pone dif�cil,"
														+ "\ntodo lo que necesita hacer es volar por encima de las peque�as molestias."
														+ "\nSi el gallo te llam� la atenci�n primero, eres ingenioso, inteligente y h�bil."
														+ "\nLa gente puede ser enga�ada por tus maneras calmadas, pero se sorprender�n"
														+ "\nsi te rozan el lado equivocado. Peleas sin miedo y no tienes miedo de hacer"
														+ "\nruido cuando ocurre algo injusto. Eres un l�der natural que no tiene miedo"
														+ "\nde decir lo que piensa.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/8_Gallo.png")));
				} else if (anim.equalsIgnoreCase("paloma")) {
					punt = punt + 7;
					JOptionPane.showMessageDialog(null, "Paloma:"
														+ "\nEste mensajero de paz es puro, hermoso y gentil. Pero poco se habla de la"
														+ "\nfuerza excepcional que tienen estas hermosas aves, lo que les permite atravesar"
														+ "\ndistancias de millas surcando el cielo cuando migran, a veces incluso a pa�ses vecinos."
														+ "\nSi una paloma te llam� la atenci�n primero, es probable que seas una persona"
														+ "\ntranquila y digna en el exterior, pero tienes una fuerza que te ayuda a superar"
														+ "\nlos momentos m�s fr�os. Eres sabio e inviertes tu energ�a en construir una"
														+ "\nfamilia o comunidad. Te niegas a pelear o a dejar que las peque�as cosas"
														+ "\nte molesten, porque s�lo quieres navegar suavemente por el cielo azul.", "Test de Personalidad",
														JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/9_Paloma.png")));
				} 
				tot = punt;
				JOptionPane.showMessageDialog(null, "Tu puntaje es: " + tot);	
				break;
		case 3: JOptionPane.showMessageDialog(null, "Vamos a ver que dice Baba Vanga sobre tu futuro.");
				
				carta=(int)(Math.random() * 6 + 1);
		
				if (carta==1) {
					JOptionPane.showMessageDialog(null, "El viaje"
							+ "\nGracias al esfuerzo que has realizado en este a�o vas a poder realizar ese viaje"
							+ "\nque tanto querias. Asi que ahora a disfrutar", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/pred1.jpg")));
				} else if (carta==2) {
					JOptionPane.showMessageDialog(null, "El trabajo"
							+ "\nHace varios a�os que venis trabajndo en el mismo lugar y ya te siente"
							+ "\nestancado. Es hora de cambiar. Este a�o tiene las puertas abiertas para"
							+ "\npara un nuevo trabajo", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/pred2.jpg")));
				} else if (carta==3) {
					JOptionPane.showMessageDialog(null, "El amor"
							+ "\nEste a�o se presentara el amor en tu puerta. No seas timido, esa persona"
							+ "\nque tanto so�aste esta a la vuelta de la esquina.", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/pred3.jpg")));
				} else if (carta==4) {
					JOptionPane.showMessageDialog(null, "La casa"
							+ "\nEs momento de dar el salto a lo grande. Es un buen a�o para poder"
							+ "\nexpandirte. Los nuevos aires son gratificantes", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/pred4.jpg")));
				} else if (carta==5) {
					JOptionPane.showMessageDialog(null, "Los gastos"
							+ "\nEste a�o que esta terminando no tuvo buenos frutos. La pandemia hizo"
							+ "\nque estemos un poco parados. Controla tus gastos", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/pred5.jpg")));
				} else if (carta==6) {
					JOptionPane.showMessageDialog(null, "La salud"
							+ "\nEste a�o estuviste bastante sedentario. Deberias hacer un poco ed ejercicios."
							+ "\nTu corazon y tu mente te lo agradeceran.", "Test de Personalidad",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Ludovica_tp2.class.getResource("/img/pred6.jpg")));
				}				
		break;
		}
	}
}


