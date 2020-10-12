/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.utility;

import hr.balic.zavrsnirad.model.Termin;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Kira
 */
public class ExcelMaker {

    private static final String FILTER_DESC = "Excel datoteka(.xls)";
    private static final String FILTER_EXTENSION = "xls";
    private static final String FILTER_TITLE = "Odaberite datoteku za pohranu";
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    
    

    private static String getFilepath(String name) {

        FileNameExtensionFilter filter = new FileNameExtensionFilter(FILTER_DESC, FILTER_EXTENSION);

//        try {
//            UIManager.setLookAndFeel(new DarculaLaf());
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(ExcelMaker.class.getName()).log(Level.SEVERE, null, ex);
//        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle(FILTER_TITLE);
        fileChooser.setSelectedFile(new File(name + FILTER_EXTENSION));
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile().getAbsolutePath();
        }
//        try {
//            UIManager.setLookAndFeel(new NimbusLookAndFeel());
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(ExcelMaker.class.getName()).log(Level.SEVERE, null, ex);
//      }
        return null;

    }

    public static void terminUExcel(List<Termin> termini) {

        String filepath = getFilepath("Termini " + sdf.format(new Date()));

        if (filepath == null) {

            return;
        }

        try {
            HSSFWorkbook wb = new HSSFWorkbook();
            CreationHelper creationHelper = wb.getCreationHelper();

            Row row;
            Cell cell;
            int red = 0;
            int kolona;
            CellStyle cellStyle = wb.createCellStyle();
            cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("dd.MM.YYYY. HH:mm"));

            wb.createSheet("Termini");
            kolona = 0;
            row = wb.getSheetAt(0).createRow(red++);
            cell = row.createCell(kolona++);
            cell.setCellValue("Broj termina");
            cell = row.createCell(kolona++);
            cell.setCellValue("Ime klijenta");
            cell = row.createCell(kolona++);
            cell.setCellValue("Prezime klijenta");
            cell = row.createCell(kolona++);
            cell.setCellValue("Vrijeme početka");
            cell = row.createCell(kolona++);
            cell.setCellValue("Vrijeme završetka");
            cell = row.createCell(kolona++);
            cell.setCellValue("Zaposlenik");
            cell = row.createCell(kolona);
            cell.setCellValue("Otkazan");

            for (Termin t : termini) {

                kolona = 0;
                row = wb.getSheetAt(0).createRow(red++);
                cell = row.createCell(kolona++);
                cell.setCellValue(t.getId());
                cell = row.createCell(kolona++);
                cell.setCellValue(t.getKlijent().getIme());
                cell = row.createCell(kolona++);
                cell.setCellValue(t.getKlijent().getPrezime());
                cell = row.createCell(kolona++);
                cell.setCellValue(t.getVrijemePocetka());
                cell.setCellStyle(cellStyle);
                cell = row.createCell(kolona++);
                cell.setCellValue(t.getVrijemeZavrsetka());
                cell.setCellStyle(cellStyle);
                cell = row.createCell(kolona++);
                cell.setCellValue(t.getZaposlenik().getImePrezime());
                cell = row.createCell(kolona);
                cell.setCellValue(t.getOtkazan());
            }

            writeFile(wb, filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(HSSFWorkbook wb, String filepath) throws IOException {

        FileOutputStream fileOut = new FileOutputStream(filepath);
        wb.write(fileOut);
        wb.close();
        fileOut.close();
    }

}
