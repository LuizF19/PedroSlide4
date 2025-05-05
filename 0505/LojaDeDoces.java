
import java.awt.Image;
import javax.swing.*;

public class LojaDeDoces extends JFrame {

    private JTextField txtBrigadeiro, txtCookie, txtPudim;
    private JButton btnPedir;

    public LojaDeDoces() {
        setTitle("Venda de Doces");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 550);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Brigadeiro
        painel.add(carregarImagem("imagem/brigadeiro.png"));
        painel.add(new JLabel("Brigadeiro (R$10):"));
        txtBrigadeiro = new JTextField("0");
        painel.add(txtBrigadeiro);

        // Cookie
        painel.add(carregarImagem("imagem/cookie.png"));
        painel.add(new JLabel("Cookie (R$15):"));
        txtCookie = new JTextField("0");
        painel.add(txtCookie);

        // Pudim
        painel.add(carregarImagem("imagem/pudim.png"));
        painel.add(new JLabel("Pudim (R$25):"));
        txtPudim = new JTextField("0");
        painel.add(txtPudim);

        btnPedir = new JButton("Pedir");
        painel.add(Box.createVerticalStrut(10));
        painel.add(btnPedir);

        PedidoHandler handler = new PedidoHandler(txtBrigadeiro, txtCookie, txtPudim);
        btnPedir.addActionListener(handler);

// Adiciona ENTER nos campos
        txtBrigadeiro.addActionListener(handler);
        txtCookie.addActionListener(handler);
        txtPudim.addActionListener(handler);

        add(painel);
        setVisible(true);

    }

    private JLabel carregarImagem(String caminho) {
        ImageIcon icone = new ImageIcon(caminho);
        Image imagem = icone.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return new JLabel(new ImageIcon(imagem));
    }

    public static void main(String[] args) {
        new LojaDeDoces();
    }
}
