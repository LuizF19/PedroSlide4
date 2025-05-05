// ComboBoxFrame.java
// JComboBox que exibe uma lista de nomes de imagem.
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame
{
    private JComboBox<String> imagesJComboBox; // caixa de combinação para armazenar nomes de ícones
    private JLabel label; // rótulo para exibir ícone selecionado

    private static final String[] names = { "bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif" };
    private Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))
    };

    // construtor ComboBoxFrame adiciona JComboBox ao JFrame
    public ComboBoxFrame()
    {
        super("Testing JComboBox");
        setLayout(new FlowLayout()); // configura o layout do frame

        imagesJComboBox = new JComboBox<>(names); // configura JComboBox
        imagesJComboBox.setMaximumRowCount(3); // exibe três linhas

        imagesJComboBox.addItemListener(
            new ItemListener() // classe interna anônima
            {
                // trata evento JComboBox
                public void itemStateChanged(ItemEvent event)
                {
                    // determina se o item foi selecionado
                    if (event.getStateChange() == ItemEvent.SELECTED) {
                        label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                    }
                }
            } // fim da classe interna anônima
        ); // fim da chamada para addItemListener

        add(imagesJComboBox); // adiciona combobox ao JFrame
        label = new JLabel(icons[0]); // exibe primeiro ícone
        add(label); // adiciona rótulo ao JFrame
    } // fim do construtor ComboBoxFrame
}
