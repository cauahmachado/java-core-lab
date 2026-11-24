package oop.projectsubscriptionloyaltyclub.visao;

import oop.projectsubscriptionloyaltyclub.excecoes.PontuacaoInsuficienteException;
import oop.projectsubscriptionloyaltyclub.model.MembroClube;
import oop.projectsubscriptionloyaltyclub.model.NivelMembro;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TelaClube extends JFrame {

    // Persistência 100% em memória RAM
    private final List<MembroClube> membros = new ArrayList<>();
    private boolean ordenarPorRanking = true;

    private final JTextField txtId = new JTextField(10);
    private final JTextField txtNome = new JTextField(20);
    private final JComboBox<NivelMembro> cmbNivel = new JComboBox<>(NivelMembro.values());
    private final JComboBox<String> cmbOperacao =
            new JComboBox<>(new String[]{"Registrar compra (R$)", "Resgatar pontos"});
    private final JTextField txtValor = new JTextField(10);
    private final JTextArea txtRelatorio = new JTextArea(15, 50);

    public TelaClube() {
        setTitle("Clube de Fidelidade");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        add(criarPainelFormulario(), BorderLayout.NORTH);

        txtRelatorio.setEditable(false);
        txtRelatorio.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        add(new JScrollPane(txtRelatorio), BorderLayout.CENTER);

        add(criarPainelBotoes(), BorderLayout.SOUTH);

        // WindowListener: confirma antes de fechar pelo X da janela
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                sair();
            }
        });

        atualizarRelatorio();
        pack();
        setLocationRelativeTo(null);
    }

    private JPanel criarPainelFormulario() {
        JPanel painel = new JPanel(new GridLayout(0, 2, 5, 5));
        painel.add(new JLabel("ID:"));
        painel.add(txtId);
        painel.add(new JLabel("Nome:"));
        painel.add(txtNome);
        painel.add(new JLabel("Nível:"));
        painel.add(cmbNivel);
        painel.add(new JLabel("Operação:"));
        painel.add(cmbOperacao);
        painel.add(new JLabel("Valor (R$ da compra ou pontos):"));
        painel.add(txtValor);
        return painel;
    }

    private JPanel criarPainelBotoes() {
        JPanel painel = new JPanel();

        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnPesquisar = new JButton("Pesquisar");
        JButton btnProcessar = new JButton("Processar Operação");
        JButton btnOrdenar = new JButton("Ordenar");
        JButton btnSair = new JButton("Sair");

        // ActionListener em cada botão
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });
        btnPesquisar.addActionListener(e -> pesquisar());
        btnProcessar.addActionListener(e -> processarOperacao());
        btnOrdenar.addActionListener(e -> ordenar());
        btnSair.addActionListener(e -> sair());

        painel.add(btnCadastrar);
        painel.add(btnPesquisar);
        painel.add(btnProcessar);
        painel.add(btnOrdenar);
        painel.add(btnSair);
        return painel;
    }

    // ---------- Operações ----------

    private void cadastrar() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            String nome = txtNome.getText().trim();

            if (id <= 0) {
                aviso("O ID deve ser maior que zero.");
                return;
            }
            if (nome.isEmpty()) {
                aviso("Informe o nome do membro.");
                return;
            }

            MembroClube novo = new MembroClube(id, nome, (NivelMembro) cmbNivel.getSelectedItem());
            if (membros.contains(novo)) { // usa equals() por ID
                aviso("Já existe um membro cadastrado com o ID " + id + ".");
                return;
            }

            membros.add(novo);
            limparCampos();
            atualizarRelatorio();
            JOptionPane.showMessageDialog(this, "Membro cadastrado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            erro("O ID deve ser um número inteiro.");
        }
    }

    private void pesquisar() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            MembroClube membro = buscarPorId(id);
            if (membro == null) {
                aviso("Nenhum membro encontrado com o ID " + id + ".");
                return;
            }
            txtNome.setText(membro.getNome());
            cmbNivel.setSelectedItem(membro.getNivel());
            txtRelatorio.setText("=== Resultado da pesquisa ===\n" + membro + "\n");
        } catch (NumberFormatException ex) {
            erro("O ID deve ser um número inteiro.");
        }
    }

    private void processarOperacao() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            MembroClube membro = buscarPorId(id);
            if (membro == null) {
                aviso("Nenhum membro encontrado com o ID " + id + ".");
                return;
            }

            String valorTexto = txtValor.getText().trim().replace(',', '.');

            if (cmbOperacao.getSelectedIndex() == 0) {
                double valorCompra = Double.parseDouble(valorTexto);
                int pontosBase = membro.calcularPontosCompra(valorCompra); // método default
                if (pontosBase <= 0) {
                    aviso("A compra precisa ser de pelo menos R$ 1,00 para gerar pontos.");
                    return;
                }
                int antes = membro.getPontos();
                membro.acumularPontos(pontosBase);
                JOptionPane.showMessageDialog(this,
                        "Compra registrada! " + membro.getNome() + " ganhou "
                                + (membro.getPontos() - antes) + " pontos (nível "
                                + membro.getNivel() + ").",
                        "Pontos acumulados", JOptionPane.INFORMATION_MESSAGE);
            } else {
                int pontos = Integer.parseInt(valorTexto);
                if (pontos <= 0) {
                    aviso("Informe uma quantidade de pontos maior que zero.");
                    return;
                }
                membro.resgatarPontos(pontos);
                JOptionPane.showMessageDialog(this,
                        "Resgate de " + pontos + " pontos realizado com sucesso!",
                        "Resgate", JOptionPane.INFORMATION_MESSAGE);
            }

            txtValor.setText("");
            atualizarRelatorio();
        } catch (NumberFormatException ex) {
            erro("ID e valor devem ser numéricos (o resgate aceita apenas números inteiros).");
        } catch (PontuacaoInsuficienteException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Resgate negado", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void ordenar() {
        ordenarPorRanking = !ordenarPorRanking;
        atualizarRelatorio();
    }

    private void sair() {
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?",
                "Sair", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }

    // ---------- Auxiliares ----------

    private MembroClube buscarPorId(int id) {
        for (MembroClube m : membros) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    private void atualizarRelatorio() {
        if (ordenarPorRanking) {
            Collections.sort(membros);           // Comparable (ranking)
        } else {
            membros.sort(MembroClube.POR_ID);    // Comparator (ID)
        }

        StringBuilder sb = new StringBuilder();
        sb.append("=== Membros (ordem: ")
                .append(ordenarPorRanking ? "ranking por pontos" : "ID crescente")
                .append(") ===\n");

        if (membros.isEmpty()) {
            sb.append("Nenhum membro cadastrado.\n");
        } else {
            int posicao = 1;
            for (MembroClube m : membros) {
                sb.append(posicao++).append("º  ").append(m).append("\n");
            }
        }
        txtRelatorio.setText(sb.toString());
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtValor.setText("");
        cmbNivel.setSelectedIndex(0);
        txtId.requestFocus();
    }

    private void aviso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
    }

    private void erro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
