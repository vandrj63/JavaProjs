public class CReview
{
	public static void main(String[] args)
		{
			CourseAverage myCourse = new CourseAverage();
			myCourse.setStudentName("Ryan");
			myCourse.setCourseID("CS154");
			myCourse.setNumPrograms(5);
			myCourse.setWeightPrograms(.40);
			myCourse.setNumQuizzes(4);
			myCourse.setWeightQuizzes(.30);
			myCourse.setNumTests(2);
			myCourse.setWeightTests(.30);
			myCourse.calcProgramsAve();
			myCourse.calcQuizAve();
			myCourse.calcTestAve();
			double ave = myCourse.computeFinalAve();
			myCourse.displayFinalAve(ave);
			
		}

}