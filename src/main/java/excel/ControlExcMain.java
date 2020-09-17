package excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class ControlExcMain {
    public static void main(String[] args) throws IOException {
//        String filePath="sample.xls";//文件路径
//        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
//        HSSFSheet firstSheet = hssfWorkbook.createSheet("first");
//        for (int i = 0; i < 5; i++) {
//            HSSFRow row = firstSheet.createRow(i);
//            for (int j = 0; j < 5; j++) {
//                row.createCell(j).setCellValue("he");
//            }
//        }
//        hssfWorkbook.write(new FileOutputStream(filePath));
        POIFSFileSystem poiFile = new POIFSFileSystem(new FileInputStream("sample.xls"));
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(poiFile);
        HSSFSheet sheet = hssfWorkbook.getSheetAt(0);
        for (int i = 0; i < 5; i++) {
            HSSFRow row = sheet.getRow(i);
            System.out.println("第"+ i + "行:");
            for (int j = 0; j < 5; j++) {
                System.out.print(row.getCell(j).getStringCellValue()+" ");
            }
            System.out.println();
        }
    }
}
