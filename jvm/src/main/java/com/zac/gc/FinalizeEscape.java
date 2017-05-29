package com.zac.gc;

/**
 * Finalize方法浅析.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月4日  下午10:32:05
 */
public class FinalizeEscape {

    private static FinalizeEscape SAVE_HOOK = null;
    
    public static void main(String[] args) throws InterruptedException {
        
        SAVE_HOOK = new FinalizeEscape();
        SAVE_HOOK = null;
        
        System.out.println("第一次GC");
        System.gc();
        Thread.sleep(500);
        
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("我先走了");
        }
        
        SAVE_HOOK = null;
        System.out.println("第二次GC");
        System.gc();
        Thread.sleep(500);
        
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("我先走了");
        }
        
    }
    
    private void isAlive() {
        System.out.println("我还活着");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("FinalizeEscape finalize is excuted");
        SAVE_HOOK = this;
    }
    
    
}
