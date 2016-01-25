package test;

import java.io.*;

/**
 * Created by csw on 2015/11/17.
 */
public class CodeCount {

    public static int getProjectFileNumber(File file, String endsWith) throws IOException {
        int number = 0;
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File subFile : file.listFiles()) {
                    number += getProjectFileNumber(subFile, endsWith);
                }
            } else if (file.isFile()) {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (br.readLine() != null) {
                    number += 1;
                }
            } else {
                System.out.println("===" + file.getAbsolutePath());
            }
        }
        return number;
    }

    public static void main(String[] args) throws IOException {
        //用法示例
        int num = CodeCount.getProjectFileNumber(new File("E:\\ieda_workspace\\sedi_platform\\src\\com\\sedi"), ".java");
        System.out.println(num);
    }
}
