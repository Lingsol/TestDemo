/**
 *  类说明:TestDemoMain.java.
 *
 * <pre>
 * 修改日期        修改人      修改原因
 * 2019年5月9日	    Lings 		新建
 * </pre>
 */

/**
 * 类说明:TestDemoMain.java.
 *
 * <pre> 修改日期 修改人 修改原因 2019年5月9日 Lings 新建 </pre>
 */
public class TestDemoMain {

    public static void main(String[] args) {
        String[] testStrArr = { 
                "-00000001",

                "-1",

                "000000-1",

                "      -1",

                "00000001",

                "       1",

                "   -1   ",

                "    1   ",

                "1       ",

                "-1      ",

               //123456789abc
                "-00000001",
                "-000000001",
                "-0000000001",
                "-00000000001",
                //123456789abc
                "-100000000",
                "-1000000000",
                "-10000000000",
                "-100000000000",
               //123456789abc
                "000000001",
                "0000000001",
                "00000000001",
                "000000000001",
                //123456789abc
                "100000000",
                "1000000000",
                "10000000000",
                "100000000000",

                //123456789abc
                 "-00000001 ",
                 "-000000001 ",
                 "-0000000001 ",
                 "-00000000001 ",
                //123456789abc
                 "000000001 ",
                 "0000000001 ",
                 "00000000001 ",
                 "000000000001 "
                };

        System.out.println("测试开始：");
        
        for(int i = 0; i < testStrArr.length; i++) {
            String testStr = testStrArr[i];

            System.out.println("标尺：        ##123456789abcd$$");
            System.out.println("待转换字符串：##" + testStr + "$$");
            try {
                Integer result = Integer.parseInt(testStr.trim());
                System.out.println("字符串转换结果：##" + result + "$$");
            } catch(Throwable e) {
                System.err.println("字符串转换失败");
                e.printStackTrace();
            }
            System.out.println("=========================================");
            System.out.println();
        }
        
        System.out.println("测试结束");
    }
}
