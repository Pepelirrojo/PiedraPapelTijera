package piedraPapelTijera;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowGame extends PiedraPapelTijera {
	private JFrame frmpiedraPapelO;
	private JButton btnPiedra;
	private JButton btnPapel;
	private JButton btnTijera;
	private JLabel lblMarcadorPlay;
	private JLabel lblMarcadorIA;
	private JLabel lblContadorPlay;
	private JLabel lblContadorIA;
	private JLabel lblRival;
	private JLabel lblResultado;
	private PiedraPapelTijera miJuego;

	public static void main(String[] args) {
		WindowGame window = new WindowGame();
	}

	public void tirada() {
		miJuego.jugar();
		lblRival.setText(miJuego.getMensajeRival());
		lblResultado.setText(miJuego.getMiMensaje());
		lblContadorPlay.setText(miJuego.getJugador());
		lblContadorIA.setText(miJuego.getEnemigo());
		}


	public WindowGame() {
		miJuego = new PiedraPapelTijera();
		frmpiedraPapelO = new JFrame();
		frmpiedraPapelO.setTitle("\u00BFPiedra, Papel O Tijera?");
		frmpiedraPapelO.setBounds(100, 100, 450, 300);
		frmpiedraPapelO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmpiedraPapelO.getContentPane().setLayout(null);

		btnPiedra = new JButton("Piedra");
		btnPiedra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPiedra.setBounds(81, 169, 90, 46);
		frmpiedraPapelO.getContentPane().add(btnPiedra);
		btnPiedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miJuego.setMiTirada(0);
				tirada();
			}
		});

		btnPapel = new JButton("Papel\r\n");
		btnPapel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPapel.setBounds(169, 169, 90, 46);
		frmpiedraPapelO.getContentPane().add(btnPapel);
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miJuego.setMiTirada(1);
				tirada();
			}
		});

		btnTijera = new JButton("Tijera\r\n");
		btnTijera.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTijera.setBounds(257, 169, 90, 46);
		frmpiedraPapelO.getContentPane().add(btnTijera);
		btnTijera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miJuego.setMiTirada(2);
				tirada();
			}
		});
		lblMarcadorPlay = new JLabel("Marcador: ");
		lblMarcadorPlay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcadorPlay.setBounds(81, 53, 128, 32);
		frmpiedraPapelO.getContentPane().add(lblMarcadorPlay);

		lblMarcadorIA = new JLabel("MarcadorIA: ");
		lblMarcadorIA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcadorIA.setBounds(81, 87, 128, 32);
		frmpiedraPapelO.getContentPane().add(lblMarcadorIA);

		lblContadorPlay = new JLabel("0\r\n");
		lblContadorPlay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContadorPlay.setBounds(198, 53, 107, 32);
		frmpiedraPapelO.getContentPane().add(lblContadorPlay);

		lblContadorIA = new JLabel("0\r\n");
		lblContadorIA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContadorIA.setBounds(198, 87, 107, 32);
		frmpiedraPapelO.getContentPane().add(lblContadorIA);

		lblRival = new JLabel("MensajeRival");
		lblRival.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRival.setBounds(272, 53, 136, 32);
		frmpiedraPapelO.getContentPane().add(lblRival);

		lblResultado = new JLabel("MensajeResultado\r\n");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado.setBounds(257, 87, 169, 32);
		frmpiedraPapelO.getContentPane().add(lblResultado);
		frmpiedraPapelO.setVisible(true);
	}
}
