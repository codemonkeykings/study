package com.zac.oom;

/**
 *java虚拟机栈OutOfMemory.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月3日  下午9:04:19
 */
public class JavaStackOOM {
    
    private void dontStop() {
        while (true) {
        }
    }
    
    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    /**
     * VM Args: -Xss1M.
     * 
     * @param args
     */
    public static void main(String[] args) {
        JavaStackOOM oom = new JavaStackOOM();
        oom.stackLeakByThread();
    }

}
