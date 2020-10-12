package org.mybatis.wb;

import java.util.StringTokenizer;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/8/19 20:48
 */
public class StringTokenizerTest {
  public static void main(String[] args) {
    String delimiter = ",;& \t\n";
    StringTokenizer tokenizer = new StringTokenizer("com.wb.spring&com.jd.module", delimiter);
    while (tokenizer.hasMoreTokens()) {
      String str = tokenizer.nextToken();
      System.out.println(str.trim());
    }
    System.out.println("---------------------");
    tokenizer = new StringTokenizer("com.wb.spring&com.jd.module", delimiter);
    while (tokenizer.hasMoreElements()) {
      System.out.println(tokenizer.nextElement());
    }
  }
}
