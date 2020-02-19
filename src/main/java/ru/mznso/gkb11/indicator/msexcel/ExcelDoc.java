package ru.mznso.gkb11.indicator.msexcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ru.mznso.gkb11.indicator.msaccess.DataBase;

public class ExcelDoc {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {

		DataBase dataBase = new DataBase();
		dataBase.init();
		String toExcel = dataBase.getTestString();
		
		
		System.out.println("Excel!");

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Birthdays");

        // Нумерация начинается с нуля
        Row row = sheet.createRow(0); 
        
        // Мы запишем имя и дату в два столбца
        // имя будет String, а дата рождения --- Date,
        // формата dd.mm.yyyy
        Cell name = row.createCell(0);
        name.setCellValue(toExcel);
        
        book.write(new FileOutputStream("/tmp/excel_file.xlsx"));
        book.close();
	}
}
