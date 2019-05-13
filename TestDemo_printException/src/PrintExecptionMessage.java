/**
 *  类说明:PrintExecptionMessage.java.
 *
 * <pre>
 * 修改日期        修改人      修改原因
 * 2019年5月13日	    Lings 		新建
 * </pre>
 */

/**
 *  类说明:PrintExecptionMessage.java.
 *
 * <pre>
 * 修改日期        修改人      修改原因
 * 2019年5月13日	    Lings   		新建
 * </pre>
 */
public class PrintExecptionMessage {

    public void printExceptionMessage(Throwable throwable) {
        
        try {
            
            throw throwable;
            
        } catch(Throwable t) {

            System.out.println("==============================>>>>>>>>>>>>");
            System.out.println("打印LocalizedMessage：");
            System.out.println(t.getLocalizedMessage());
            System.out.println("<<<<<<<<<<<<==============================");

            System.out.println("==============================>>>>>>>>>>>>");
            System.out.println("打印Message：");
            System.out.println(t.getMessage());
            System.out.println("<<<<<<<<<<<<==============================");

            System.out.println("==============================>>>>>>>>>>>>");
            System.out.println("打印Cause：");
            System.out.println(t.getCause());
            System.out.println("<<<<<<<<<<<<==============================");

            System.out.println("==============================>>>>>>>>>>>>");
            System.out.println("打印Class：");
            System.out.println(t.getClass());
            System.out.println("<<<<<<<<<<<<==============================");

            System.out.println("==============================>>>>>>>>>>>>");
            System.out.println("打印StackTrace：");
            System.out.println(t.getStackTrace());
            System.out.println();
            System.out.println(t.getStackTrace().toString());
            System.out.println();
            System.out.println(t.getStackTrace());
            System.out.println();
            for(int i = 0; i < t.getStackTrace().length; i++) {
                System.out.println(t.getStackTrace()[i].toString());
            }
            System.out.println("<<<<<<<<<<<<==============================");
        }
    }
}
