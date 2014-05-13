package br.com.devschool.terminal.visao;

import br.com.devschool.entidade.Terminal;
import br.com.devschool.terminal.servico.TerminalServico;
import br.com.devschool.util.FrameUtil;
import br.com.devschool.util.MensagemUtil;
import br.com.devschool.util.template.IFrame;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 * @author @atilla8huno
 */
public class TerminalFrame extends JFrame implements IFrame<Terminal> {

    private Terminal entidade;
    private TerminalServico servico;
    private TerminalTableModel modeloTabela;
    private List<Terminal> terminals;
    
    /** Atributos de filtros */
    private Integer numero;
    private Boolean status;
    
    /**
     * Método construtor
     */
    public TerminalFrame() {
        initComponents();
        
        terminals = new ArrayList<Terminal>();
        modeloTabela = new TerminalTableModel(terminals);
        jTableTerminals.setModel(modeloTabela);
        
        try {
            servico = new TerminalServico();
        } catch (Exception ex) {
            MensagemUtil.addMensagemErro(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jTabbedPaneAbas = new javax.swing.JTabbedPane();
        jPanelFormulario = new javax.swing.JPanel();
        jPanelAcaoFormulario = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jPanelCampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroTerminal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxStatusTerminal = new javax.swing.JCheckBox();
        jPanelConsulta = new javax.swing.JPanel();
        jPanelAcaoConsulta = new javax.swing.JPanel();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimparConsulta = new javax.swing.JButton();
        jPanelResultados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTerminals = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNumeroTerminalFiltro = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jCheckBoxStatusTerminalFiltro = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caso de Uso: Cargo");
        setResizable(false);

        jPanelPrincipal.setLayout(null);

        jPanelFormulario.setLayout(null);

        jPanelAcaoFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAcaoFormulario.setLayout(null);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/disk.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelAcaoFormulario.add(jButtonSalvar);
        jButtonSalvar.setBounds(30, 30, 120, 50);

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/clean.png"))); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanelAcaoFormulario.add(jButtonLimpar);
        jButtonLimpar.setBounds(180, 30, 120, 50);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png"))); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanelAcaoFormulario.add(jButtonFechar);
        jButtonFechar.setBounds(640, 30, 120, 50);

        jPanelFormulario.add(jPanelAcaoFormulario);
        jPanelAcaoFormulario.setBounds(10, 460, 790, 110);

        jPanelCampos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCampos.setLayout(null);

        jLabel1.setText("Número do Terminal: *");
        jPanelCampos.add(jLabel1);
        jLabel1.setBounds(30, 20, 140, 20);
        jPanelCampos.add(jTextFieldNumeroTerminal);
        jTextFieldNumeroTerminal.setBounds(30, 40, 90, 20);

        jLabel2.setText("Status: *");
        jPanelCampos.add(jLabel2);
        jLabel2.setBounds(390, 20, 110, 20);
        jPanelCampos.add(jCheckBoxStatusTerminal);
        jCheckBoxStatusTerminal.setBounds(390, 40, 90, 21);

        jPanelFormulario.add(jPanelCampos);
        jPanelCampos.setBounds(10, 10, 790, 440);

        jTabbedPaneAbas.addTab("Formulário de Cadastro", jPanelFormulario);

        jPanelConsulta.setLayout(null);

        jPanelAcaoConsulta.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAcaoConsulta.setLayout(null);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelAcaoConsulta.add(jButtonEditar);
        jButtonEditar.setBounds(30, 30, 120, 50);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/trash.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelAcaoConsulta.add(jButtonExcluir);
        jButtonExcluir.setBounds(180, 30, 120, 50);

        jButtonLimparConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/clean.png"))); // NOI18N
        jButtonLimparConsulta.setText("Limpar");
        jButtonLimparConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparConsultaActionPerformed(evt);
            }
        });
        jPanelAcaoConsulta.add(jButtonLimparConsulta);
        jButtonLimparConsulta.setBounds(330, 30, 120, 50);

        jPanelConsulta.add(jPanelAcaoConsulta);
        jPanelAcaoConsulta.setBounds(10, 460, 790, 110);

        jPanelResultados.setBackground(new java.awt.Color(255, 255, 255));
        jPanelResultados.setLayout(null);

        jTableTerminals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableTerminals);

        jPanelResultados.add(jScrollPane1);
        jScrollPane1.setBounds(30, 92, 730, 340);

        jLabel3.setText("Número do Terminal:");
        jPanelResultados.add(jLabel3);
        jLabel3.setBounds(30, 20, 140, 20);

        jLabel4.setText("Status:");
        jPanelResultados.add(jLabel4);
        jLabel4.setBounds(390, 20, 60, 20);
        jPanelResultados.add(jTextFieldNumeroTerminalFiltro);
        jTextFieldNumeroTerminalFiltro.setBounds(30, 40, 90, 20);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search.png"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanelResultados.add(jButtonPesquisar);
        jButtonPesquisar.setBounds(710, 23, 50, 40);
        jPanelResultados.add(jCheckBoxStatusTerminalFiltro);
        jCheckBoxStatusTerminalFiltro.setBounds(390, 40, 90, 21);

        jPanelConsulta.add(jPanelResultados);
        jPanelResultados.setBounds(10, 10, 790, 440);

        jTabbedPaneAbas.addTab("Consulta de Registros", jPanelConsulta);

        jPanelPrincipal.add(jTabbedPaneAbas);
        jTabbedPaneAbas.setBounds(0, 0, 810, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        salvar();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        limparFormulario(jPanelFormulario);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        pesquisar();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        excluir();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparConsultaActionPerformed

        limparConsulta();
    }//GEN-LAST:event_jButtonLimparConsultaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        editar();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TerminalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminalFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLimparConsulta;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxStatusTerminal;
    private javax.swing.JCheckBox jCheckBoxStatusTerminalFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelAcaoConsulta;
    private javax.swing.JPanel jPanelAcaoFormulario;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneAbas;
    private javax.swing.JTable jTableTerminals;
    private javax.swing.JTextField jTextFieldNumeroTerminal;
    private javax.swing.JTextField jTextFieldNumeroTerminalFiltro;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método preenche a entidade de acordo com o preenchimento do formulário e o persiste.
     */
    @Override
    public void salvar() {
        try {
            preencherEntidade();
            
            getServico().salvar(getEntidade());
            MensagemUtil.addMensagemSalvoSucesso();
        } catch (Exception ex) {
            MensagemUtil.addMensagemErro(ex.getMessage());
        }
        limparFormulario(jPanelFormulario);
    }
    
    /**
     * Este método obtem o registro selecionado e o exclui do banco de dados.
     */
    @Override
    public void excluir() {
        try {
            obterLinhaSelecionada();
            
            getServico().excluir(getEntidade());
            pesquisar();
            MensagemUtil.addMensagemExcluidoSucesso();
        } catch (Exception ex) {
            MensagemUtil.addMensagemErro(ex.getMessage());
        }
    }
    
    /**
     * Este método obtem o objeto selecionado na tabela e prepara o formulário para edição.
     */
    @Override
    public void editar() {
        try {
            obterLinhaSelecionada();
            
            jTabbedPaneAbas.setSelectedComponent(jPanelFormulario);
        } catch (Exception ex) {
            MensagemUtil.addMensagemErro(ex.getMessage());
        }
    }
    
    /**
     * Este método pesquisa os registros do banco e exibe-os na JTable.
     */
    @Override
    public void pesquisar() {
        try {
            numero = Integer.parseInt(jTextFieldNumeroTerminalFiltro.getText().equals("") ? "0" : jTextFieldNumeroTerminalFiltro.getText());
            status = jCheckBoxStatusTerminalFiltro.isSelected();
            
            modeloTabela.setTerminals(getServico().listarPorNumeroStatus(numero, status));
        } catch (Exception e) {
            MensagemUtil.addMensagemErro(e.getMessage());
        }
    }
    
    /**
     * Este método verifica se os campos obrigatórios da tela foram preenchidos.
     */
    @Override
    public boolean isValidarCamposObrigatorios() {
        if (jTextFieldNumeroTerminal.getText().equals("")) {
            marcarCamposObrigatorios();
            throw new IllegalArgumentException("É necessário preencher os campos obrigatórios!");
        } else {
            return true;
        }
    }
    
    /**
     * Este método marca de vermelho os campos obrigatórios.
     */
    @Override
    public void marcarCamposObrigatorios() {
       jTextFieldNumeroTerminal.setBorder(FrameUtil.BORDA_VERMELHA);
    }
    
    /**
     * Este método limpa os campos do formulário.
     */
    @Override
    public void limparFormulario(Container formulario) {
        FrameUtil.limparCamposDoContainer(formulario);
        
        entidade = null;
        jTextFieldNumeroTerminal.setBorder(FrameUtil.BORDA_PADRAO);
        jTextFieldNumeroTerminal.requestFocus();
    }
    
    /**
     * Este método limpa os campos da consulta.
     */
    @Override
    public void limparConsulta() {
        limparFormulario(jPanelResultados);
        modeloTabela.limparLista();
    }

    /**
     * Este método preenche a entidade Terminal de acordo com os campos da tela.
     */
    @Override
    public void preencherEntidade() {
        if (isValidarCamposObrigatorios()) {
            getEntidade().setNumero(Integer.parseInt(jTextFieldNumeroTerminal.getText()));
            getEntidade().setStatus(jCheckBoxStatusTerminal.isSelected());
        }
    }

    /**
     * Este método preenche o formulário de acordo com a entidade Terminal.
     */
    @Override
    public void preencherFormulario(Terminal terminal) {
        if (terminal != null) {
            jTextFieldNumeroTerminal.setText(terminal.getNumero().toString());
            jCheckBoxStatusTerminal.setSelected(terminal.isStatus());
        }
    }

    /**
     * Este método obtem a linha selecionada da JTable e preenche a entidade.
     */
    @Override
    public void obterLinhaSelecionada() {
        if(jTableTerminals.getSelectedRow() >= 0){
            int row = jTableTerminals.getSelectedRow();
        
            entidade = modeloTabela.getTerminals().get(row);
            preencherFormulario(entidade);
        } else {
            throw new IllegalArgumentException("É necessário selecionar algum registro na tabela antes de efetuar alguma ação!");
        }
    }
    
    /* GETTERS and SETTERS */
    
    public Terminal getEntidade() {
        if (entidade == null) {
            entidade = new Terminal();
        }
        return entidade;
    }

    public void setEntidade(Terminal entidade) {
        this.entidade = entidade;
    }

    public TerminalServico getServico() {
        if (servico == null) {
            try {
                servico = new TerminalServico();
            } catch (Exception ex) {
                MensagemUtil.addMensagemErro(ex.getMessage());
            }
        }
        return servico;
    }
}
