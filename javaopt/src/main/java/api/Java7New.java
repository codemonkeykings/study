package api;

/**
 * Java7������.
 * 
 * @author Zhang.Ge
 * @version v1.0 2016��11��21��  ����9:04:11
 */
public class Java7New {

    /**
     * java7��switch֧���ַ������ж�.
     * 
     * @param sex  �Ա�
     */
    public static void newSwitch(String sex) {
        switch (sex) {
            case "��":
                //System.out.println("���������ã�");
                break;
            case "Ů":
                //System.out.println("Ůʿ�����ã�");
                break;
            default:
                //System.out.println("���ã�����д��Ϣ��");
                break;
        }
    }
    
    /**
     * ���switch��ͬ���͵ı��ʽֵ���ܲ���.
     * 
     * @param i ���ʽֵ
     */
    public static void testSwitch(int i) {
        switch (i) {
            case 0:
                //System.out.println("���������ã�");
                break;
            case 1:
                //System.out.println("Ůʿ�����ã�");
                break;
            default:
                //System.out.println("���ã�����д��Ϣ��");
                break;
        }
    }
    
    public static void main(String[] args) {
        //newSwitch("��");
        //newSwitch(null);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            newSwitch("��");
        }
        long end = System.currentTimeMillis();
        System.out.println("String���ͣ�" + (end - start));
        
        for (int i = 0; i < 1000000000; i++) {
           testSwitch(0);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("int���ͣ�" + (end2 - end));
    }
}
