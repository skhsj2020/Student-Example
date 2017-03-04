package student;

public class Student {
		int id, age , mark[];
		String name , greader;
		double average;

		public Student(int id ,int age , int mark[] , String name){
			
			this.id = id;
			this.age = age;
			this.mark = mark;
			this.name = name;
		}
		public void setId(int id){
			this.id = id;
		}
		public int getId(){
			return id;
		}
		public void setAge(int age){
			this.age = age;
		}
		public int getAge(){
			return age;
		}
		public void setMark(int[]mark){
			this.mark = mark;
		}
		public int[] getMark(){
			return mark;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
		public void setGreader(String greader){
			this.greader = greader;
		}
		public String getGreader(){
			return greader;
		}
		public void setAverage(double average){
			this.average = average;
		}
		public String gradeAvg(){
			
			if(average >= 90){
				return "Excellent";
			} else if (average >= 80){
				return "Very Good";
			} else if(average >= 70){
				return "Good";
			}else if(average >= 60) {
				return "Passed";
			} else {
				return "Failed"; 
			}
		}
		public double getAverage(){
			int sum = 0;
			for(int i= 0 ; i< mark.length; i++) {
				sum =sum + mark[i];
			}
		
		    return sum / mark.length;
		}
			public String toString() {
				return "Student{" + "id" + id + ", age" + age + ", marks" + mark + ", name" 
			+ name + ", greader"  + greader +", average" + average +'}';
		}
		}
