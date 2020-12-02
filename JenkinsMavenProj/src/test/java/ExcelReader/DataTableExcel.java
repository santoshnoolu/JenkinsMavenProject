package ExcelReader;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTableExcel {

		public String excelPath;
		public FileInputStream fis;
		public XSSFWorkbook workBook;
		public XSSFSheet sheet;
		public XSSFRow row;
		public XSSFCell cell;

		public DataTableExcel(String path) {
			this.excelPath = path;
			try {
				fis = new FileInputStream(excelPath);
				workBook = new XSSFWorkbook(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public String getCellData(String sheetName, String rowName, String colName) {
			int rowNum = 0, colNum = 0;
			// int index = workBook.getSheetIndex(sheetName);
			// sheet = workBook.getSheetAt(index);
			sheet = workBook.getSheet(sheetName);
			row = sheet.getRow(rowNum);
			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
					if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(rowName)) {
					rowNum = i;
					break;
				}
			}

			for (int j = 0; j <= row.getLastCellNum(); j++) {
				String cellName = String.valueOf(row.getCell(j));
				if (cellName.equalsIgnoreCase(colName)) {
					colNum = j;
					break;
				}
			}
			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);

			if (cell.getCellTypeEnum() == CellType.STRING) {
				System.out.println(cell.getStringCellValue());
				return cell.getStringCellValue();

			} else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
				System.out.println(String.valueOf(cell.getNumericCellValue()));
				return String.valueOf(cell.getNumericCellValue());

			} else if (cell.getCellTypeEnum() == CellType.BOOLEAN) {
				System.out.println(String.valueOf(cell.getBooleanCellValue()));
				return String.valueOf(cell.getBooleanCellValue());

			} else if (cell.getCellTypeEnum() == CellType.BLANK) {
				return " ";
			}
			return null;

		}

	}

