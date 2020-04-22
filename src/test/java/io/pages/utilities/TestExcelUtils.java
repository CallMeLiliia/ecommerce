package io.pages.utilities;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestExcelUtils {

	public static void main(String[] args) {

		ExcelUtils sheet = new ExcelUtils("file.xlsx","Sheet1");
		
		System.out.println(sheet.getCellData(3, 3));
		
		System.out.println(Arrays.deepToString(sheet.getDataAs2DArray()));
		
		
		List <Map<String,String>> dataAsAList = sheet.getDataAsList();
		
		
		
		for (Map<String, String> map : dataAsAList) {
		//	System.out.println(map);
		}
		
		
		System.out.println(sheet.getColumnNames());
		
		sheet.setCellData("Ozzi", "first_name", 1);
		
		
	}

}
