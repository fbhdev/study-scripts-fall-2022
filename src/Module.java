public class Module {

    private String course;
    private int module;

    /**
     * @param course the course to set
     * @param module the module to set
     */
    public Module(String course, int module){
        setCourse(course);
        setModule(module);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if(!isValid(course)){
            throw new IllegalArgumentException("Invalid course");
        }
        this.course = course;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }

    public boolean isValid(String course){
        String[] courses = {
                "Web Development",
                "Web Services",
                "Programming Techniques 2",
                "Data Structures and Algorithms"
        };

        for(String c : courses){
            if(c.equalsIgnoreCase(course)){
                return true;
            }
        }
        return false;
    }
}
