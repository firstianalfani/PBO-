/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rini Angraeni
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener, FocusListener{
    private JLabel 		lNip	   = new JLabel ("NIM       "),
            lNama	   = new JLabel ("Nama        "),
            lPassword  = new JLabel ("Password    "),
            lcreate    = new JLabel ("nama");
    private JTextField 	fNip	   = new JTextField (),
            fNama	   = new JTextField ();
    private TextField	fPassword  = new TextField ();
    private JButton 	btnOk      = new JButton (),
            btnBatal   = new JButton ();


    public Login() {
        setPreferredSize(new Dimension(350,230));
        setTitle("LOGIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane dLogin = new JDesktopPane();

        /* Mengatur letak objek Label Di container*/
        lNip.setBounds (15, 20, 100, 25);
        lNama.setBounds (15, 55, 100, 25);
        lPassword.setBounds (15, 90, 100, 25);

        /* Mengatur letak objek Text Di Container */
        fNip.setBounds (110, 20, 100, 25);
        fNama.setBounds (110, 55, 205, 25);
        fPassword.setBounds (110, 90, 92, 25);
        fPassword.setEchoChar('*');

        fNip.setToolTipText("Ex : a122106638");

        /* Mengatur letak objek Button di Container */
        btnOk.setBounds (130, 140, 85, 25);
        btnOk.setLabel("Ok");
        btnBatal.setBounds (230, 140, 85, 25);
        btnBatal.setLabel("Batal");
        btnBatal.setToolTipText("Mengakhiri Program");

        // Mengatur objek untuk dapat berinteraksi
        fNip.addFocusListener (this);
        btnOk.addActionListener (this);
        btnBatal.addActionListener (this);

        // Meletakkan seluruh kontrol pada objek panel */
        dLogin.add (lNip);
        dLogin.add (fNip);
        dLogin.add (lNama);
        dLogin.add (fNama);
        dLogin.add (lPassword);
        dLogin.add (fPassword);
        dLogin.add (btnOk);
        dLogin.add (btnBatal);

        /* Menambahkan objek panel (pPgr) ke container frame */
        getContentPane().add (dLogin).setBackground(Color.getHSBColor(0,0,90));

        /* Menampilkan frame ke layar monitor */
        pack();
        setLocationRelativeTo(null);
        Kosong();
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

    /* Fungsi untuk memeriksa kursor saat meninggalkan objek txtKode_Barang */
    public void focusGained (FocusEvent fe) { }
    public void focusLost (FocusEvent fe) {

        if (fNip.getText().equals ("")) { }
        else
        {
            int xcari = Cari();
            if (xcari == 1)
            {
                fPassword.requestFocus();
            }
            else
            {
                btnBatal.requestFocus();
            }
        }
    }

    /* Fungsi jika user melakukan action penekanan tombol Button */
    public void actionPerformed (ActionEvent ae) {
        Object obj = ae.getSource();

        if (obj == btnOk)
        {
            int xcari = CariPassword();
            System.out.println(xcari);
            if (xcari == 1)
            {
                this.dispose();
                System.out.println("Coba");
                menuTiket xmenu = new menuTiket();
                xmenu.setVisible(true);
            }
        }

        if (obj == btnBatal)
        {
            System.exit(0);
        }
    }


    int Cari(){
        int x = 0;
        try	{

            KoneksiDBMS CnTiket = new KoneksiDBMS();
            Connection con = CnTiket.BukaCn();
            Statement stat = con.createStatement();

            //cari nama berdasar nim terdaftar
            String strsql = "SELECT * FROM user WHERE nip ='" + fNip.getText () + "'";
            ResultSet rs = stat.executeQuery(strsql);

            if(rs.next())
            {
                fNama.setText (rs.getString ("nama"));
                x = 1;
            }
            else
            {
                // Jika Nip tidak ditemukan 
                fNip.setText("");
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan !");
                fNip.requestFocus ();
            }
            rs.close();
            con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Data kosong !");
        }
        return x;
    }

    // Fungsi untuk mencari Kode_Barang ke tabel barang 
    int CariPassword(){
        int x = 0;
        try	{

            KoneksiDBMS CnTiket = new KoneksiDBMS();
            Connection con = CnTiket.BukaCn();
            Statement stat = con.createStatement();

            String strsql = "SELECT * FROM user WHERE nip ='" + fNip.getText () + "' and pass ='" + fPassword.getText () + "'";
            ResultSet rs = stat.executeQuery(strsql);

            if(rs.next())
            {
                fNama.setText (rs.getString ("nama"));
                x = 1;
            }
            else
            {
                fPassword.setText("");
                fPassword.requestFocus();
                JOptionPane.showMessageDialog(this,"Password Salah !");
            }
            rs.close();
            con.close();
        }
        catch(SQLException e)
        {
        }
        return x;
    }


    // Fungsi untuk mengkosongkan Objek masukan 
    void Kosong ()
    {
        fNip.setText ("");
        fNama.setText ("");
        fPassword.setText ("");
        fNip.requestFocus ();
    }
}
