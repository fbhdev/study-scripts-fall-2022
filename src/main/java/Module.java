public class Module {

    private int module;

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "Module " + getModule();
    }
}
