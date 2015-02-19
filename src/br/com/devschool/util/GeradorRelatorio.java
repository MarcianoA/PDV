package br.com.devschool.util;

import java.io.InputStream;
import java.util.Collection;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author ATILLA
 */
public class GeradorRelatorio {

    /**
     * Path das libs: ..\Jaspersoft\iReport-5.5.1\ireport\modules\ext
     */
    public static void gerarRelatorioDesktop(String arquivo, Collection<?> itens, Map<String, Object> parametros) {
        try {
            JasperPrint print = JasperFillManager.fillReport(arquivo, parametros,
                    new JRBeanCollectionDataSource(itens));
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void gerarRelatorioDesktop(InputStream arquivo, Collection<?> itens, Map<String, Object> parametros) {
        try {
            JasperPrint print = JasperFillManager.fillReport(arquivo, parametros,
                    new JRBeanCollectionDataSource(itens));
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void gerarRelatorioDesktop(JasperReport arquivo, Collection<?> itens, Map<String, Object> parametros) {
        try {
            JasperPrint print = JasperFillManager.fillReport(arquivo, parametros,
                    new JRBeanCollectionDataSource(itens));
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
