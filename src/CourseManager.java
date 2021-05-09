public class CourseManager {

    public CourseManager() {

    }
    public  CourseManager(Course course){
        System.out.println(course+" managed");
    }



    public void addToCourses(Course course){

        System.out.println(course+" added");
    }
    public void showCourse(Course course){
        System.out.println(course.id);
        System.out.println(course.name);
        System.out.println(course.about);
    }
}
