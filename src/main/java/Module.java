/**
 * <h1>Module</h1>
 * @author Francois Boulay-Handfield
 */
public class Module {

    private int module;

    /**
     * <h1>getModule</h1>
     * @return the module
     */
    public int getModule() {
        return module;
    }

    /**
     * <h1>setModule</h1>
     * @param module to set
     */
    public void setModule(int module) {
        this.module = module;
    }

    /**
     * <h1>toString</h1>
     * @return a String with the module's name
     */
    @Override
    public String toString() {
        return "Module " + getModule();
    }
}
