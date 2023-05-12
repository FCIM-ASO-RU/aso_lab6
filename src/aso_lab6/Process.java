package aso_lab6;

public class Process extends Thread {
    
    int[] need;
    static int[] available;
    
    public Process(int[] _available, int[] _need) {
        available = _available;
        need = _need;
    }
    
    @Override
    public void run() {
        
    }
    
}