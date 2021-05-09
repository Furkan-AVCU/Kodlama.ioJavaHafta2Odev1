public class Main {


    public static void main(String[] args) {

        CourseManager courseManager=new CourseManager();
	Course course1=new Course(1,"Yazılım Geliştirici Yetiştirme Kampı(Java & React)","Engin Demiroğ " +
            "tarafından verilen bu eğitimde sıfırdan ileri seviyeye eğitim verilecektir.");


	Course[] courses={course1};

        for (int i=0;i<courses.length;i++){

            courseManager.showCourse(courses[i]);
        }
    }
}
