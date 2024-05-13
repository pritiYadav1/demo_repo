package Onetoone;

public class App 
{
    public static void main( String[] args )
    {
    	  Instructor instructor = new Instructor("priti", "Yadav", "priti.yadav@gmail.com");

          InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "IT");
          // associate the objects
          instructorDetail.setInstructor(instructor);
          // associate the objects
          instructor.setInstructorDetail(instructorDetail);

          // when you get instructorDetail then hibernate also saves instructor info
          InstructorDao instructorDao = new InstructorDao();
          instructorDao.saveInstructor(instructor);
    }    
}
