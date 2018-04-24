import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchData {

	public static void main(String arg[]) throws Exception {
		int i, j;

		String val[][] = null;
		String excelFilePath = System.getProperty("user.dir") + "\\Testdata\\Navision.xlsx";
		System.out.println(excelFilePath);
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount + " " + colCount);
		val = new String[rowCount][colCount];

		for (i = 0; i < rowCount - 1; i++) {

			Row row = sheet.getRow(i + 1);

			for (j = 0; j < row.getLastCellNum(); j++) {

				Cell cell1 = sheet.getRow(i + 1).getCell(j);

				switch (cell1.getCellType()) {

				case Cell.CELL_TYPE_STRING:
					val[i][j] = cell1.getRichStringCellValue().getString();
					break;

				case Cell.CELL_TYPE_NUMERIC:
					/*
					 * if (DateUtil.isCellDateFormatted(cell1)) { val[i][j] =
					 * cell1.getDateCellValue(); } else {
					 */
					val[i][j] = Double.toString(cell1.getNumericCellValue());

					break;

				case Cell.CELL_TYPE_BOOLEAN:
					val[i][j] = Boolean.toString(cell1.getBooleanCellValue());
					break;

				case Cell.CELL_TYPE_FORMULA:
					val[i][j] = cell1.getCellFormula();
					break;

				default:
					System.out.println();
				}
			}
		}

		workbook.close();

		inputStream.close();

		System.out.println(val);
	}

}
