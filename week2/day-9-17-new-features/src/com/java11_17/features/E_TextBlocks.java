package com.java11_17.features;

public class E_TextBlocks {
    public static void main(String[] args) {
        // ES6 `` ==> """" """"
        String sql = """
      SELECT id, firstName, lastName
        FROM Employee
       WHERE departmentId = "IT"
    ORDER BY lastName, firstName""";

        String html = """
    <html>
      <body>
        <p>Hello World!</p>
      </body>
    </html>""";

        System.out.println(sql);
        System.out.println(html);

        String sql2 = """
      SELECT id, firstName, lastName
        FROM Employee
       WHERE departmentId = "IT"
    ORDER BY lastName, firstName\
  """;
        System.out.println(sql2);
        System.out.println("hello");
    }
}
