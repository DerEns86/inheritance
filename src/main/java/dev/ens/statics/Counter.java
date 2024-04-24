package dev.ens.statics;

public class Counter {

    public static int totalCount = 0;

    protected int instanceCount;

    public Counter (int instanceCount){
        this.instanceCount = 0;
    }

    public int incrementInstanceCount(){
        return this.instanceCount++;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "instanceCount=" + instanceCount +
                '}';
    }
}
