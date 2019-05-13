import java.util.ArrayList;
import java.util.List;

/**
 *  类说明:ExceptionSource1.java.
 *
 * <pre>
 * 修改日期        修改人      修改原因
 * 2019年5月13日	    Lings 		新建
 * </pre>
 */

/**
 *  类说明:ExceptionSource1.java.
 *
 * <pre>
 * 修改日期        修改人      修改原因
 * 2019年5月13日	    Lings   		新建
 * </pre>
 */
public class ExceptionSource1 {

    public void testMethod() {
        List<Throwable> errorArray = new ArrayList<Throwable>();
        
        try {
            int a = 1 / 0;
            
            System.out.println(a);
        } catch(Throwable t) {
            errorArray.add(t);
        }
        
        try {
            String a = null;

            System.out.println(a.equals("A"));
        } catch(Throwable t) {
            errorArray.add(t);
        }
        
        try {
            throw new Exception("测试");
        } catch(Throwable t) {
            errorArray.add(t);
        }

        try {
            String[] a = new String[1];
            
            System.out.println(a[1]);
            
        } catch(Throwable t) {
            errorArray.add(t);
        }
        
        for(int i = 0; i < errorArray.size(); i++) {
            System.out.println("==============================================>>>>>>>>");
            System.out.println("第" + i + "种异常，开始打印");
            
            new PrintExecptionMessage().printExceptionMessage(errorArray.get(i));
            System.out.println("==============================================>>>>>>>>");
            System.out.println();
        }
    }
}
