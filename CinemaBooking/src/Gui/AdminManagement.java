package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import Services.MovieServices;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminManagement extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField_movieName;
	private JTextField textField_movieUrl;
	private JTextField textField_description;
	private JTextField textField_movieRate;
	private JTextField textField_price;
	private JTextField textField_session;
	private MovieServices movieServices = new MovieServices();
	private boolean isSuccessful = false;
	private JTextField textField_deleteMovieName;

	public AdminManagement() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHoGeldiniz = new JLabel("Ho\u015F Geldiniz");
		lblHoGeldiniz.setFont(new Font("Georgia", Font.BOLD, 16));
		lblHoGeldiniz.setForeground(new Color(255, 255, 255));
		lblHoGeldiniz.setBounds(74, 72, 197, 31);
		contentPane.add(lblHoGeldiniz);
		
		JLabel lblFilmEkle = new JLabel("Film Ekle");
		lblFilmEkle.setFont(new Font("Georgia", Font.PLAIN, 14));
		lblFilmEkle.setForeground(new Color(255, 255, 255));
		lblFilmEkle.setBounds(172, 172, 171, 31);
		contentPane.add(lblFilmEkle);
		
		JLabel lblFilmAd = new JLabel("Film Ad\u0131 :");
		lblFilmAd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblFilmAd.setForeground(new Color(255, 255, 255));
		lblFilmAd.setBounds(74, 243, 125, 25);
		contentPane.add(lblFilmAd);
		
		JLabel lblFilmUrl = new JLabel("Film Url :");
		lblFilmUrl.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblFilmUrl.setForeground(new Color(255, 255, 255));
		lblFilmUrl.setBounds(74, 281, 125, 25);
		contentPane.add(lblFilmUrl);
		
		JLabel lblAklama = new JLabel("A\u00E7\u0131klama  :");
		lblAklama.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblAklama.setForeground(new Color(255, 255, 255));
		lblAklama.setBounds(74, 319, 125, 25);
		contentPane.add(lblAklama);
		
		JLabel lblSeanslar = new JLabel(" Seans :");
		lblSeanslar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblSeanslar.setForeground(new Color(255, 255, 255));
		lblSeanslar.setBounds(71, 357, 128, 25);
		contentPane.add(lblSeanslar);
		
		JLabel lblFilmPuan = new JLabel(" Film Puan\u0131 :");
		lblFilmPuan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblFilmPuan.setForeground(new Color(255, 255, 255));
		lblFilmPuan.setBounds(74, 395, 125, 25);
		contentPane.add(lblFilmPuan);
		
		JLabel lblFiyat = new JLabel(" Fiyat :");
		lblFiyat.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblFiyat.setForeground(new Color(255, 255, 255));
		lblFiyat.setBounds(74, 433, 125, 25);
		contentPane.add(lblFiyat);
		
		textField_movieName = new JTextField();
		textField_movieName.setBounds(209, 243, 134, 20);
		contentPane.add(textField_movieName);
		textField_movieName.setColumns(10);
		
		textField_movieUrl = new JTextField();
		textField_movieUrl.setColumns(10);
		textField_movieUrl.setBounds(209, 281, 134, 20);
		contentPane.add(textField_movieUrl);
		
		textField_description = new JTextField();
		textField_description.setColumns(10);
		textField_description.setBounds(209, 319, 134, 20);
		contentPane.add(textField_description);
		
		textField_movieRate = new JTextField();
		textField_movieRate.setColumns(10);
		textField_movieRate.setBounds(209, 395, 134, 20);
		contentPane.add(textField_movieRate);
		
		textField_price = new JTextField();
		textField_price.setColumns(10);
		textField_price.setBounds(209, 433, 134, 20);
		contentPane.add(textField_price);
		
		textField_session = new JTextField();
		textField_session.setBounds(209, 357, 134, 20);
		contentPane.add(textField_session);
		textField_session.setColumns(10);
		
		JLabel lblFilmSil = new JLabel("Film Sil");
		lblFilmSil.setFont(new Font("Georgia", Font.PLAIN, 16));
		lblFilmSil.setForeground(new Color(255, 255, 255));
		lblFilmSil.setBounds(590, 172, 126, 31);
		contentPane.add(lblFilmSil);
		
		JLabel lblFilmAd_1 = new JLabel("Film Ad\u0131 :");
		lblFilmAd_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblFilmAd_1.setForeground(new Color(255, 255, 255));
		lblFilmAd_1.setBounds(478, 241, 54, 25);
		contentPane.add(lblFilmAd_1);
		
		textField_deleteMovieName = new JTextField();
		textField_deleteMovieName.setColumns(10);
		textField_deleteMovieName.setBounds(582, 243, 134, 20);
		contentPane.add(textField_deleteMovieName);
		
		JLabel btnAdd = new JLabel("Ekle");
		btnAdd.setFont(new Font("Georgia", Font.BOLD, 14));
		btnAdd.setHorizontalAlignment(SwingConstants.CENTER);
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBounds(133, 498, 150, 30);
		contentPane.add(btnAdd);
		
		JLabel lblAdd = new JLabel("");
		lblAdd.setIcon(new ImageIcon(AdminManagement.class.getResource("/adminScreen/button.png")));
		lblAdd.setBounds(133, 498, 150, 30);
		contentPane.add(lblAdd);
		
		JLabel btnDelete = new JLabel("Sil");
		btnDelete.setHorizontalAlignment(SwingConstants.CENTER);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Georgia", Font.BOLD, 14));
		btnDelete.setBounds(516, 309, 150, 30);
		contentPane.add(btnDelete);
		
		JLabel lblDelete = new JLabel("");
		lblDelete.setIcon(new ImageIcon(AdminManagement.class.getResource("/adminScreen/button.png")));
		lblDelete.setBounds(516, 309, 150, 30);
		contentPane.add(lblDelete);
		
		JLabel btnMenu = new JLabel("Men\u00FC");
		
		btnMenu.setHorizontalAlignment(SwingConstants.CENTER);
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFont(new Font("Georgia", Font.BOLD, 14));
		btnMenu.setBounds(516, 498, 150, 30);
		contentPane.add(btnMenu);
		
		JLabel lblMenu = new JLabel("");
		lblMenu.setIcon(new ImageIcon(AdminManagement.class.getResource("/adminScreen/button.png")));
		lblMenu.setBounds(516, 498, 150, 30);
		contentPane.add(lblMenu);
		
		JLabel lblWallpaper = new JLabel("");
		lblWallpaper.setIcon(new ImageIcon(AdminManagement.class.getResource("/adminScreen/wallpaper.jpg")));
		lblWallpaper.setBounds(0, 0, 800, 600);
		contentPane.add(lblWallpaper);
		
		
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				isSuccessful =  movieServices.addMovie(textField_movieName.getText(),textField_movieUrl.getText(), textField_description.getText(), textField_session.getText(), textField_movieRate.getText(), textField_price.getText());
				if(isSuccessful){
					JOptionPane.showMessageDialog(null,"Ýþlem tamamlandý");
					textField_movieName.setText("");
					textField_movieUrl.setText("");
					textField_description.setText("");
					textField_movieRate.setText("");
					textField_price.setText("");
					textField_session.setText("");
				}
					
				else
					JOptionPane.showMessageDialog(null,"Ýþlem Baþarýsýz");
			}
		});
		
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				isSuccessful = movieServices.deleteMovie(textField_deleteMovieName.getText());
				if(isSuccessful){
					JOptionPane.showMessageDialog(null,"Ýþlem tamamlandý");
					textField_deleteMovieName.setText("");
					
				}
					
				else
					JOptionPane.showMessageDialog(null,"Ýþlem Baþarýsýz");
			}
		});
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomeScreen homeScreen = new HomeScreen();
				homeScreen.setVisible(true);
				dispose();
			}
		});
	}
}
