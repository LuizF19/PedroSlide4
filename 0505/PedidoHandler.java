import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PedidoHandler implements ActionListener {

    private JTextField campoBrigadeiro, campoCookie, campoPudim;

    public PedidoHandler(JTextField brigadeiro, JTextField cookie, JTextField pudim) {
        campoBrigadeiro = brigadeiro;
        campoCookie = cookie;
        campoPudim = pudim;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int qtdBrigadeiro = Integer.parseInt(campoBrigadeiro.getText());
        int qtdCookie = Integer.parseInt(campoCookie.getText());
        int qtdPudim = Integer.parseInt(campoPudim.getText());

        double total = (qtdBrigadeiro * 10.0) + (qtdCookie * 15.0) + (qtdPudim * 25.0);

        JOptionPane.showMessageDialog(null,
                "Total da compra: R$ " + total,
                "Resumo do Pedido",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
